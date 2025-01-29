package reactiveProgramming;


import java.util.concurrent.Flow.*;
import java.util.*;
import java.util.stream.Collectors;

// Implement the TrendingHashtagsProcessor class to process incoming hashtags 
class TrendingHashtagsProcessor implements Subscriber<String> {
    private Subscription subscription;
    private List<String> hashtags = new ArrayList<>();
    
    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);  // Request one item at a time
    }

    @Override
    public void onNext(String hashtag) {
        // Add the incoming hashtag to the list
        hashtags.add(hashtag);
        // Request the next item
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        // Handle errors (if any)
        System.err.println("Error: " + throwable.getMessage());
    }

    @Override
    public void onComplete() {
        // Once complete, we can print the top trending hashtags
        System.out.println("Processing complete. Top trending hashtags are:");
    }

    // Method to get top trending hashtags (top 3 most recent hashtags)
    public List<String> getTopTrendingHashtags() {
        // Get the top 3 trending hashtags
        return hashtags.stream()
                .limit(3)
                .collect(Collectors.toList());
    }
}

// Implement the TrendingHashtagsPublisher class to publish hashtag updates 
class TrendingHashtagsPublisher implements Publisher<String> {
    private List<Subscriber<? super String>> subscribers = new ArrayList<>();
    
    @Override
    public void subscribe(Subscriber<? super String> subscriber) {
        // Add the subscriber to the list of subscribers
        subscribers.add(subscriber);
        // Notify the subscriber that the subscription has been accepted
        subscriber.onSubscribe(new Subscription() {
            @Override
            public void request(long n) {
                // For this simulation, we request one hashtag at a time
            }

            @Override
            public void cancel() {
                // Handle cancellation if needed
            }
        });
    }

    public void publishHashtag(String hashtag) {
        // Notify all subscribers with the new hashtag
        for (Subscriber<? super String> subscriber : subscribers) {
            subscriber.onNext(hashtag);
        }
    }

    public void complete() {
        // Notify all subscribers that the publishing is complete
        for (Subscriber<? super String> subscriber : subscribers) {
            subscriber.onComplete();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of TrendingHashtagsPublisher 
        TrendingHashtagsPublisher hashtagsPublisher = new TrendingHashtagsPublisher();
        
        // Create an instance of TrendingHashtagsProcessor 
        TrendingHashtagsProcessor hashtagsProcessor = new TrendingHashtagsProcessor();
        
        // Subscribe the processor to the publisher 
        hashtagsPublisher.subscribe(hashtagsProcessor);
        
        // Simulate the arrival of hashtags 
        hashtagsPublisher.publishHashtag("#Java");
        hashtagsPublisher.publishHashtag("#ReactiveProgramming");
        hashtagsPublisher.publishHashtag("#Java9");
        hashtagsPublisher.publishHashtag("#Concurrency");
        
        // Complete the publisher to trigger completion in the processor 
        hashtagsPublisher.complete();
        
        // Print the top three trending hashtags 
        System.out.println("Top Trending Hashtags: " + hashtagsProcessor.getTopTrendingHashtags());
    }
}




//Expected Output: 
//Top Trending Hashtags: [#Java, #ReactiveProgramming, #Java9] 
