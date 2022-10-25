import java.util.Scanner;

class Inputs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //LEARNING INPUTS
        // System.out.print("What is your name? ");
        // String name = scanner.nextLine();

        // System.out.printf("Hello %s. How old are you? ", name);
        // int age = scanner.nextInt();

        // scanner.nextLine();

        // System.out.printf("%d is a great age to start playing golf! Are you right or left handed? ", age);

        // String leftOrRight = scanner.nextLine();

        // System.out.printf("There are a lot of %s golfers in the world!", leftOrRight);

        // CALCULATOR EXAMPLE

        System.out.print("Enter your first number ");
        double numberOne = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter your second number ");
        double numberTwo = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What operation do you want to do? ");

        String operation = scanner.nextLine();

        if(operation.equals("sum")){
            double result = numberOne + numberTwo;
            System.out.printf("%f + %f = %f", numberOne, numberTwo, result);
        }else if (operation.equals("sub")) {
            double result = numberOne - numberTwo;
            System.out.printf("%f - %f = %f", numberOne, numberTwo, result);
        }else if (operation.equals("mul")) {
            double result = numberOne * numberTwo;
            System.out.printf("%f * %f = %f", numberOne, numberTwo, result);
        }else if (operation.equals("div")) {
            if (numberTwo == 0){
                System.out.println("You can not divide by Zero");
            }else{
                double result = numberOne / numberTwo;
                System.out.printf("%f / %f = %f", numberOne, numberTwo, result);
            }
        }else {
            System.out.println("%s is not supported by the calculater");
        }
        

        scanner.close();
    }
}
