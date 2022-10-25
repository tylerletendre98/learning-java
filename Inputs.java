import java.util.Scanner;

class Inputs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s. How old are you? ", name);
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.printf("%d is a great age to start playing golf! Are you right or left handed? ", age);

        String leftOrRight = scanner.nextLine();

        System.out.printf("There are a lot of %s golfers in the world!", leftOrRight);

        scanner.close();
    }
}
