import java.util.Scanner;

/**
 * Exercises on if, for and while loops
 */
public class Main {

    // Look up the documentation for Scanner and what methods are available
    private Main() {
    Scanner input = new Scanner(System.in);
    int number1; // first number to compare
    int number2; // second number to compare
    }

    //TODO: Write a Java program to compare two numbers.

    public void compare2(int num1, int num2){;
        if (num1 > num2) {
            System.out.print("The bigger number is " + num1);
        } else  {
            System.out.print("The bigger number is " + num2);
        }
    }


    // TODO: Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
    // TODO: Otherwise, print "positive" or "negative".
        public static void main(String[]args){
           Scanner in = new Scanner(System.in);
            System.out.print("Input value");
            double input = in.nextDouble();
            if (input > 0) {
                if (input < 1) {
                    System.out.println("Positive small number");
                } else if (input > 1000000) {
                    System.out.println("Positive large number");

                } else {
                    System.out.println("Positive number");
                }
            } else if (input < 0) {
                if (Math.abs(input) < -1000000) {
                    System.out.println("Negative small number");
                } else if (Math.abs(input) > -1) {
                    System.out.println("Negative large number");
                } else {
                    System.out.println("Negative number");
                }
            } else {
                System.out.println("Zero");
            }
        } public void compare(int num1, int num2) {
            if (num1 > num2) {
                System.out.print("The bigger number is " + num1 + '\n');
            } else  {
                System.out.print("The bigger number is " + num2 + '\n');
            }     }

    // TODO: Write a program in Java to display the first 10 natural numbers.

                public static void main3(String[]args){;
                {
                    int i;
                    System.out.println("\n");
                    for (i=1;i<=10;i++)
                    {
                        System.out.println(i);
                    }

                    System.out.println("The first 10 natural numbers are:");
            }   }

// so in this we have a range for small and large positive numbers, as well as for the negatives.




    // TODO: Write a Java program to reverse a string. Print the before and after.
    public static void main4(String args){
             {int var[] = new int[] {1,2,3};
                for(int i = var.length - 1; i >= 0 ; i--){;
                    System.out.println(var[i]);
                }
}          } }

// All the flowchart pictures I will send you via Outlook, because I couldn't find a way to upload them an the Internet's advice is hard to understand.