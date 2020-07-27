import java.util.Scanner;

public class FirstJavaHello {
    public static void main(String[] args) {
        excercise_3_1();
        excercise_3_2();
        excercise_3_3();
    }

    public static void excercise_3_1() {
        int yourAge;

        Scanner readInput = new Scanner(System.in);
        System.out.printf("How old are you?: ");
        yourAge = readInput.nextInt();
        if (yourAge > 19)
            System.out.printf("You are an adult\n");
        else if (yourAge < 13)
            System.out.printf("You are a kid\n");
        else
            System.out.printf("You are a teenager\n");
    }

    public static void excercise_3_2() {
        double firstN;
        double secondN;
        char operator;
        Scanner readInput = new Scanner(System.in);
        Boolean repeat = true;

        while (repeat) {
            System.out.printf("Type a number, operator, number --" + "separated by a space: ");
            firstN = readInput.nextDouble();
            operator = readInput.next().charAt(0);
            secondN = readInput.nextDouble();

            if (operator == '+')
                System.out.printf("%f + %f = %f", firstN, secondN, firstN + secondN);
            else if (operator == '-') 
                System.out.printf("%f - %f = %f", firstN, secondN, firstN - secondN);
            else if (operator == '*')
                System.out.printf("%f * %f = %f", firstN, secondN, firstN * secondN);
            else if (operator == '/')
                System.out.printf("%f / %f = %f", firstN, secondN, firstN / secondN);
            else if (operator == '%')
                System.out.printf("%f %% %f = %f", firstN, secondN, firstN % secondN);
            else
                System.out.printf("Unknown operator");

            System.out.print("\n\nContinue? Type 'y' for yes: ");
            char key =  readInput.next().charAt(0);
            if (key != 'y' && key != 'Y') {
                repeat = false;
            }
        }      
    }

    public static void excercise_3_3() {
        int max, a, b, c;
        Scanner readInput = new Scanner(System.in);
        char key = 'y';
        
        while (key == 'y' || key == 'Y') {
            System.out.println("Enter three integer numbers to find max of them--separated by a space:");
            a = readInput.nextInt();
            b = readInput.nextInt();
            c = readInput.nextInt();

            max = (a >= b && a >= c) ? a : (b >= a && b >= c ? b : c);

            System.out.printf("The Max is: %d\n\n", max);
            System.out.print("Continue? Type 'y' for yes: ");
            key = readInput.next().charAt(0);
        }
    }
    
}