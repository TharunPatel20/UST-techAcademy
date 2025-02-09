package exceptionHandling;

class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

class DataProcessor {
    public double processData(int[] data) throws InvalidDataException {
        if (data == null || data.length == 0) {
            throw new InvalidDataException("Data cannot be null or empty.");
        }

        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum / data.length;
    }
}

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        
        try {
            int[] data = {1, 2, 3, 4, 5};
            System.out.println("Average: " + processor.processData(data));

            int[] emptyData = {};
            System.out.println("Average: " + processor.processData(emptyData));
        } catch (InvalidDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
