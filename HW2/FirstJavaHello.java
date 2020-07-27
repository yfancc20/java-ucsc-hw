import java.util.Scanner;

public class FirstJavaHello {
    public static void main(String[] args) {
        excercise_2_1();
        excercise_2_2();
        excercise_2_3();
    }

    public static void excercise_2_1() {
        int radius = 2;
        double area;
        final double pi = 3.142;

        area = pi * radius * radius;

        System.out.printf("The area is: %.2f\n", area);
    }

    public static void excercise_2_2() {
        Scanner readInput = new Scanner(System.in);
        int radius;
        double PI, area;

        System.out.println(); // extra line feed
        System.out.print("Enter the radius: "); 
        radius = readInput.nextInt();

        System.out.print("Enter the PI: "); 
        PI = readInput.nextDouble();

        area = PI * radius * radius;

        System.out.printf("The area is: %.2f\n", area);
    }

    public static void excercise_2_3() {
        Scanner readInput = new Scanner(System.in);
        double area, pi = 3.14;
        
        System.out.println(); // extra line feed
        System.out.print("Enter the radius: ");
        byte newRadius = readInput.nextByte();

        area= pi * newRadius * newRadius;
        
        System.out.printf("The area is: %.2f\n", area);

        System.out.println(); //extra line feed
        System.out.print("What is your first name?: ");
        char yourInitial = readInput.next().charAt(0);
        System.out.println("Hello Mr. " + yourInitial + ".");
        // the input buffer will still have enter character '\n'
        // so that needs to be cleaned.
        // You can do that by using .nextLine() method.
        readInput.nextLine();

        System.out.println(); //extra line feed
        System.out.printf("5185 is fun course.\n\n");
        System.out.printf("First Name \tLast Name\tCity\n");
        System.out.printf("----------- \t---------\t---\n");
        System.out.printf("Bill \tClinton \tHarlem\n");
        System.out.printf("\n");
        System.out.println(); //extra line feed
        System.out.printf("How do you print double quotes?\n");
        System.out.printf("Who said\"Test Scores Can Be Used ....\"\n\n");

        String firstName, lastName, city, zip; 
        System.out.print("Please enter your first name: ");
        firstName = readInput.nextLine();
        System.out.print("Please enter your last name: ");
        lastName = readInput.nextLine();
        System.out.print("Please enter your city: ");
        city = readInput.nextLine();
        System.out.print("Please enter your zip code: ");
        zip = readInput.nextLine();

        System.out.println(); //extra line feed
        System.out.printf("First Name \tLast Name\tCity\tZip Code\n");
        System.out.printf("----------- \t---------\t---\t----\n");
        System.out.printf("%s \t\t%s \t\t%s \t%s\n", firstName, lastName, city, zip);
        System.out.println(); //extra line feed
    }
}