######### My Assumptions on the requirements

1. the primary goal of this Task is to check if the Search Bar function and Display Results
2. a tool must be used to control and execute the test
3. tool of choice
4. Simplicity comparing to the estimated time of delivery

Notes:
the requirements were not specified
    * expected Results to test
    * the complexity and Coverage of the Task

as simple task for 2 hours i tried to make it as simple as i can, without using complex structure
   so i used only TestNG and Selenium and PageObject i didn't see the need for Cucumber, hooks and
   Feature files for testing Search Bar



######### List Of tools i used
1. Intellij IDEA Community version: 2019.1.3
2. testng-6.14.3
3. selenium-server-3.141.59




######## Setup Environment ( Tried to make the setup simple)
1. Pull/download the project
2. In IDEA open project
3. In IDEA check in project structure, that:
   * Project has Project SDK: 1.8 (can be downloaded from here: https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
   * Modules has "new_project" with "src" folder selected as "Sources"
   * Libraries has these jars :
     * testng-6.14.3 (can be downloaded from here: https://mvnrepository.com/artifact/org.testng/testng/6.14.3)
     * selenium-server-3.141.59 (can be downloaded from here: https://www.selenium.dev/downloads/ )
you can also find these jars in 'lib' folder (Make sure to add all the Jar's for Selenium)
add the jars in project structure -> Modules -> Dependencies using the "+" Icon
4. run the test
