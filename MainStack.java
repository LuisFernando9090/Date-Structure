package DateStructure;

import java.util.Scanner;

public class MainStack {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            TypeStructureStack client = new TypeStructureStack();

            System.out.println("Good Morning! ");

            while (true) {
                System.out.println("1 - Add Stack! ");
                System.out.println("2 - Remove Stack! ");
                System.out.println("3 - View Stack! ");
                System.out.println("4 - System Close! ");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        client.addStack();
                        break;
                    case 2:
                        client.removeStack();
                        break;
                    case 3:
                        client.viewStack();
                        break;
                    case 4:
                        System.out.close();
                    default:
                        break;
                }
            }
        }
    }

}
