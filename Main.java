import java.util.Scanner;

public class Main {

    public static void add(int a, int b) 
    {
        int c = a + b;
        System.out.println("Addition is : "+c);
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static void subtract(int a, int b) 
    {
        int c= a - b;
        System.out.println("Subtraction is : "+c);
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static void multiply(int a, int b) 
    {
        int c= a * b;
        System.out.println("Multiplication is : "+c);
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static void divide(int a, int b) 
    {
        if (b == 0) 
        {
            System.out.println("Error: Cannot divide by zero!");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------");
            
        }
        int c= a / b;
        System.out.println("Dividation is : "+c);
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) 
        {
            System.out.println("\n--- Java Console Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println();
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            int num1, num2, c = 0;

            if (choice >= 1 && choice <= 4) 
            {
                System.out.print("Enter first number: ");
                num1 = sc.nextInt();
                System.out.print("Enter second number: ");
                num2 = sc.nextInt();
                System.out.println();

                switch (choice) 
                {
                    case 1: 
                    	add(num1, num2); 
                    	break;

                    case 2:
                    	subtract(num1, num2); 
                    	break;

                    case 3: 
                    	multiply(num1, num2); 
                    	break;
                    		
                    case 4: 
                    	divide(num1, num2); 
                    	break;
                }
            } 
            else if (choice == 5) 
            {
                exit = true;
                System.out.println("Exiting calculator. Goodbye!");
            } 
            else 
            {
                System.out.println("Invalid choice! Please try again.");
            }
        }
        sc.close();
    }
}
