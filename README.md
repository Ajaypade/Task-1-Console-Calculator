# Task-1-Console-Calculator

The program is a simple console-based calculator built in Java. 
It provides a menu to the user to choose between addition, subtraction, multiplication, division, or exit. 
Each operation is written in its own method for clarity and reusability, and the results are printed with separators for better readability. 
In the main method, a loop keeps showing the menu until the user chooses to exit. 
The Scanner class is used to take input from the user. For valid arithmetic choices, the program asks for two numbers and calls the corresponding method using a switch statement. Division has a safeguard to handle division by zero. 
If the user enters an invalid choice, an error message is displayed. The program ends gracefully when the user selects the exit option.
