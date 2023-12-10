import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Byte count = 0;
        int choice = -1;
        while (count < 3) {
            System.out.print("User name: ");
            String name = scanner.nextLine();
            String tName = "admin";
            System.out.print("Password: ");
            String pass = scanner.nextLine();
            String tPass = "123456";
            Boolean cmp1 = name.equals(tName);
            Boolean cmp2 = pass.equals(tPass);
            count++;
            if (cmp1 && cmp2) {
                while (choice != 0) {
                    System.out.println("Menu");
                    System.out.println("1. Draw the rectangle");
                    System.out.println("2. Draw the square");
                    System.out.println("3. Draw the isosceles triangle");
                    System.out.println("0. Exit");
                    System.out.println("Enter your choice: ");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
//                      draw Rectange
                            System.out.print("Enter length: ");
                            int length = scanner.nextInt();
                            System.out.print("Enter height: ");
                            int heightR = scanner.nextInt();
                            for (int i = 0; i < heightR; i++) {
                                for (int j = 0; j < length; j++) {
                                    System.out.print("*  ");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 2:
//                      draw Square
                            System.out.print("Enter edge: ");
                            int edge = scanner.nextInt();
                            for (int i = 0; i < edge; i++) {
                                for (int j = 0; j < edge; j++) {
                                    System.out.print("*  ");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 3:
//                      draw Triangle
                            System.out.print("Enter height: ");
                            int heightT = scanner.nextInt();
//                    System.out.print("Enter bottom edge: ");
//                    int botEdge = scanner.nextInt();

                            for (int i = 0; i < heightT; i++) {
                                for (int j = heightT - i; j > 0; j--) {
                                    System.out.print(" ");
                                }
                                for (int k = 0; k < (2 * i + 1); k++) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 0:
                            System.exit(0);
                        default:
                            System.out.println("No choice!");
                    }
                }
            } else {
                System.out.println("Retype");
            } if (count == 3) {
                System.out.print("You entered the wrong more than the specified number of times");
            }
        }
    }
}