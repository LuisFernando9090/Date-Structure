package DateStructure;

import java.util.Scanner;

public class MainQueue {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            TypeStructureQueue client = new TypeStructureQueue();
            System.out.println("---------------------");
            System.out.println("Good Morning! ");
            while (true) {
                System.out.println("---------------------");
                System.out.println("1 - Add Queue! ");
                System.out.println("2 - Next Queue! ");
                System.out.println("3 - Remove Queue! ");
                System.out.println("4 - View Queue! ");
                System.out.println("5 - System Close! ");
                System.out.println("---------------------");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        client.addQueue();
                        break;
                    case 2:
                        client.nextAndRemove();
                        break;
                    case 3:

                        break;
                    case 4:
                        client.viewQueue();
                        break;
                    case 5:
                        System.out.close();
                    default:
                        break;
                }
            }
        }
    }

}
