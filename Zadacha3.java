package homework;

import java.util.Scanner;

public class Zadacha3 {
        public static void main(String[] args) {
            int random = (int) (Math.random() *40+40);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter min limit: ");
            String next = scanner.next();
            System.out.println("Enter max limit: ");
            int nextInt = scanner.nextInt();

            System.out.println("next string: " + next);
            System.out.println("next int: " + nextInt);

            System.out.println("The random value is = " + random);
            System.out.println("between range: 20 and 80 = " + random);

    }

}
