# CodingChallenge
QA Automation Engineer Coding Challenge - SCWX2021

The Coding Challenge:

For this challenge, you can use node js, java, python, go, or whatever language you are most comfortable with, to develop code that meets the challenge requirements listed below:

1. Read input from a file of words;

2. Find the largest word in the file

3. Transpose the letters in the largest word

4. Show the largest word and the largest word transposed 

5. Demonstrate positive and negative test cases

6. Ensure you document code and instructions for building and running based on the response best practices above

----
Example file

a

ab

abc

abcd

abcde

Result:

abcde

edcba

---------------

Coding challenge completed.

ScwxCode is the folder that contains all files.

FindBigWord.Java under src folder contains the code to read from input file "inputFile.txt" iterate through the file and read the largest word and print the largest and transpose (reverse) of largest word. 
test folder contains JUnit tests. Test Runner is the the class that extends JUnit's abstract runner class and is responsible for running JUnit tests.TestLargeWord.java has all tests (3 positive and 3 negative tests)

Scwxcode:
  -src
    -FindBigWord.java
  -test
    -TestLargeWord.java
    -TestRunner.java
  -inputFile.txt
  -emptyInputFile.txt
  -testInputFile1.txt

Approach:
Having worked on java and javascript, felt this can be accomplished better with java for coding and testing. Had to research a bit on the approach and inbuilt functions.
Chose string tokenizer when compared to scanner, because if there are more than one word in a line, it will still choose only largest word from the file. So the code works even if there is more than one word in a line.

Assumptions:
 - Assuming there is only one word in a line.
 - Assuming file is always populated with data.
 - Assuming not more than one large numbers are present. If more than one large words are present, only first large word is picked and transposed.

-TestCases:
  - Positive:
    - Assert largest word with hardcoded expected value.
    - Assert transposed (reversed) largest word with hardcoded.
    - Assert transposed largest word for a manually entered string.
  - Negative:
    -  Assert empty input file and compare with empty expected value.
    -  Assert empty value when input file is not present (looking for a file name that is not present).
    -  Assert transposed largest word returned with actual largest value and verify both are not same.

