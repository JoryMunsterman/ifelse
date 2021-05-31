package basic.novi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Geef een jaar op" );

        int year = input.nextInt();
        boolean isLeapYear = year % 4 ==0;

        if (isLeapYear) {
            System.out.println("Het jaar " + year + " is een schrikkeljaar");
        } else {
            System.out.println("Het jaar " + year + " is geen schrikkeljaar");
        }

    }
}
