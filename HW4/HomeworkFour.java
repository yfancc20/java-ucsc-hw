import java.util.Scanner;

public class HomeworkFour {
    public static void main(final String[] args) {
        final int width = 25;
        final int height = 17;
        char cw = '-';
        char ch = '|';

        System.out.println("4.1 How many times each loop is executed?\n");
        excercise_4_1();

        System.out.printf("4.2 Using 3 loop to print %d x %d:\n", height, width);
        excercise_4_2(height, width);

        System.out.printf("4.3 Using do-while to print %d x %d:\n", height, width);
        excercise_4_3(height, width);

        System.out.printf("4.4 Using for-loop to print %d x %d:\n", height, width);
        excercise_4_4(height, width, ch, cw);

        System.out.println("4.5+4.6 Using custom characters, height and width");
        excercise_4_5();
    }


    public static void excercise_4_1() {
        // a: 10 times
        int i = 0;
        while (i++ < 10) {
            System.out.println("Hello World a: " + i); 
        }
        System.out.println("\n### a: 10 times\n");

        // b: 9 times
        i = 0;
        while (++i < 10) {
            System.out.println("Hello World b: " + i); 
        }
        System.out.println("\n### b: 9 times\n");

        // c: 0 times
        while (++i < 10) {
            System.out.println("Hello World c: " + i); 
        }
        System.out.println("\n### c: 0 times\n");
    }

    public static void excercise_4_2(int height, int width) {
        // top line
        for (int i = 0; i < width; i ++) {
            System.out.print("-");
        }
        System.out.println();
        // middle lines
        for (int i = 1; i < height - 1; i ++) {
            for (int j = 0; j < width; j ++) { // middle lines
                if (j == 0 || j == width - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // bottom line
        for (int i = 0; i < width; i ++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void excercise_4_3(int height, int width) {
        int i = 0;
        do {
            if (i == 0 || i == height - 1) { // top line and bottom line
                int j = 0;
                do {
                    System.out.print("-");
                } while (++j < width);
            } else {
                int j = 0;
                do {
                    if (j == 0 || j == width - 1) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                } while (++j < width);
            }
            System.out.println();
        } while (++i < height);
        System.out.println();
    }

    public static void excercise_4_4(int height, int width, char ch, char cw) {
        // use a outer loop to draw line by line
        for (int i = 0; i < height; i ++) {
            if (i == 0 || i == height - 1) { // top line and bottom line
                for (int j = 0; j < width; j ++) {
                    System.out.print(cw);
                }
            } else {
                for (int j = 0; j < width; j ++) { // middle lines
                    if (j == 0 || j == width - 1) {
                        System.out.print(ch);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void excercise_4_5() {
        Scanner readInput = new Scanner(System.in);

        boolean repeat = true;

        while (repeat) {
            System.out.print("Please enter a horizontal character: ");
            char ch = readInput.next().charAt(0);
            System.out.print("Please enter a vertical character: ");
            char cw = readInput.next().charAt(0);
            System.out.print("Please enter the height: ");
            int height = readInput.nextInt();
            System.out.print("Please enter the width: ");
            int width = readInput.nextInt();
            
            excercise_4_4(height, width, ch, cw);

            System.out.print("Do you want to draw a new box? (y/n) ");
            char c = readInput.next().charAt(0);
            repeat = (c == 'y' || c == 'Y');
        }
    }
}