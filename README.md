# Before you start:
* Try not to read ahead.
* Do one task at a time. The trick is to learn to work incrementally.
* Make sure you only test for correct inputs, there is no need to test for invalid inputs for this kata.
* Test First!

# Description
Quiz Builder is a console application that allows you to create and fill quizzes. This application is currently in development, so some of its features are already implemented but other need to be implemented.
 
## Current features
 * Create quiz
   * Supports the next kind of questions:
     * Text
     * Date
     * Pick one option (similar to a radio input element in HTML)
   * Each question type has its own associated validations, for example:
     * The question type *TEXT* supports the validations *REQUIRED* and *MIN_LENGTH*
   * Given a created quiz, it is possible to fill the values for its questions

## Pending features to implement
### Question types
1. Add support for a new question type called *NUMERIC*
2. Associate the next validations *REQUIRED* and *MIN* to it.
Remember that you need to convert the values to int

### Validations
You'll notice that several validations are implemented but they are not being applied.

3. Add the required code to apply validations when the user is filling the quiz.
   
4. Add support for new kind of validations for question's answer.
   * Text validations
     * Max length
     * Only uppercase text
     
### Enhance the _Show Quiz_ menu action
We want to enhance this action because currently the question information is not usefully,

5. Enhance that logic to show the question title and answer.  REFACTORING

### Persistence
Currently all the information is stored on memory, that means quizzes are lost after finishing the application. 
Sometime ago, a member of the dev team did a research about persisting information in a JSON file, you can check and run the JsonPersistence.java file which was the result of the research.

6. Given the JsonPersistence.java file, try to reuse that code to implement the quiz persistence in a JSON file and also load a quiz given a JSON file.
   Don't forget to include the respective action menu for this.

### Menu
We don't like how the action menu (Menu.java) is implemented, it has too much IFs; there should be a better way to implement it, 

7. Provide a better alternative that helps in the maintainability .

### Unit testing
There are some unit tests that will help you during the refactoring.

8. Include more scenarios. 
9. Additionally, there are some features that are failing, please fix them and add the related tests.


# Submit your task
You have less than 3 hours for this assignment, the way to submit your work is:
 * If you have a github account, you can accept the invite the Jalasoft Trainers will send you. By accepting this invite you'll have your GitHub repository ready for you. Clone it and ensure to push your changes when your are ready.
 
 * If you are not familiar with Git repositories or you don't have an account, you can download the project from the next url:
 https://github.com/jala-dev/quiz-builder/archive/refs/heads/master.zip
 
 To submit your changes, you can zip your project folder and send it to jose.ecos@fundacion-jala.org and felipe.canaviri@fundacion-jala.org before the time limit.  
 **NOTE:** Please make sure only include project files. 
 
# NOTE
To run the application you must have installed OpenJDK-8 (or higher) and Maven

Make sure that you are running the App.java file.
