# Project 

This project is a Java application that demonstrates various string manipulation methods. It includes a set of unit tests to verify the correctness of these methods.

##Installation

To install this project, clone the repository to your local machine. 

```bash
git clone git@github.com:krishaakarkii/tamk-5G00DM62-3005-grade-upgrade.git


## Prerequisites

Before running the application and tests, make sure you have the following installed:

- Java Development Kit (JDK)
- junit-4.13.2.jar
- hamcrest-core-1.3.jar

## Compilation

To compile the application, follow these steps:

1. Open the terminal.
2. Navigate to the project directory.
3. Run the following command:

```bash
javac -d . src/*.java

This command compiles all the .java files in the src directory and places the resulting .class files in the current directory.

## Running the Tests

To run the tests,  you need to have JUnit and Hamcrest installed. You can download them from the following links:
JUnit: https://junit.org/junit4/
Hamcrest: http://hamcrest.org/JavaHamcrest/

After downloading the JAR files, place them in the same directory as your source and test files. 

To compile the test classes, Open the terminal. Navigate to the project directory. Run the following command:

javac -d . -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar test/*.java

To run the tests, use the following command:

java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore test.AllTests


## Contact

If you have any questions or need support, you can reach me at : krisha.karki@tuni.fi
