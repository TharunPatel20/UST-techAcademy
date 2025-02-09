# Cracking the Case - String Matching Algorithms in Java

Skill Description:
Java programming involves understanding fundamental concepts, including data structures,
algorithms, and basic programming constructs. Learners at this level can work with basic data
structures like arrays and strings, implement simple sorting algorithms, and solve straightforward
problems using Java. This assignment will equip you with the tools to solve detective-style text
analysis challenges using String Matching Algorithms in Java.

## Problem Statement 1: The Case and the Evidence

➢ The Scenario: You are a detective investigating a case where a hidden message is embedded
within a seemingly ordinary text file. This message could be crucial evidence!
➢ The Evidence: You will be provided with two files:
• innocent_text.txt: This file contains the text with the hidden message.
• message_to_find.txt: This file contains the hidden message you need to locate.

## Problem Statement 2: The Algorithms - Your Detective Tools

### 1. Naive Search:

➢ Objective: Implement the Naive String Matching Algorithm in Java.
➢ Guidance: The Naive Search algorithm iterates through the text file, comparing the search
message (from message_to_find.txt) character by character at each position.
➢ Task:
• Write Java code for the Naive Search algorithm.
• Use this algorithm to analyze the innocent_text.txt file, searching for the message in
message_to_find.txt.
• Calculate the time complexity of your Naive Search implementation (consider the
number of comparisons made).

### 2. Boyer-Moore Algorithm:

➢ Objective: Implement the Boyer-Moore String Searching Algorithm in Java.
➢ Guidance: The Boyer-Moore algorithm is a more efficient approach that avoids unnecessary
character comparisons. It preprocesses the search message to identify patterns that can be
used for faster skipping during the search.
➢ Task:
• Research and understand the basic principles of the Boyer-Moore Algorithm.
• Implement the Boyer-Moore algorithm in Java.
• Analyze the innocent_text.txt file using your Boyer-Moore implementation to find
the hidden message.
• Compare the time complexity of Boyer-Moore to your Naive Search implementation.
Explain the difference in efficiency.

## Problem Statement 3: Expanding the Investigation

### 1. Beyond the Basics:

➢ Objective: Explore and choose one additional String Matching Algorithm besides Naive
Search and Boyer-Moore (e.g., Knuth-Morris-Pratt (KMP), Rabin-Karp).
➢ Guidance: Research and understand the chosen algorithm's core concept and how it differs
from Naive Search and Boyer-Moore. Resources like online tutorials or textbooks can be
helpful.
➢ Task:
• Briefly explain the chosen algorithm's working principle compared to the algorithms you
already explored.
• Implement your chosen algorithm in Java.
• Analyze the innocent_text.txt file using your chosen algorithm.
• Compare the time complexity of all three algorithms.

### Part 4: Unmasking the Message - The Detective's Conclusion

➢ Objective: Based on the results from your String Matching Algorithms, identify the hidden
message within the text file.
➢ Task:
• Analyze the outputs from each algorithm.
• Identify the location of the hidden message within the text file.
• Write a report summarizing your findings:
o Explain how each algorithm identified the hidden message (or why it failed).
o Identify the most efficient algorithm for this specific case and explain your
reasoning.
o Mention any challenges you faced during the implementation.
Learning Outcomes:
By completing this assignment, you will:
• Gain practical experience implementing String Matching Algorithms in Java.
• Understand the efficiency differences between various algorithms.
• Apply your knowledge to solve a real-world scenario (albeit a detective-themed one!).
• Explore additional algorithms and expand your knowledge base.
This assignment provides a structured approach to learning String Matching Algorithms while
offering real-world application through the detective theme.
