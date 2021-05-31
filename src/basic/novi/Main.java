package basic.novi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int year = 2004;
        boolean isLeapYear = year % 4 ==0;

        if (isLeapYear) {
            System.out.println("Het jaar " + year + " is een schrikkeljaar");
        } else {
            System.out.println("Het jaar " + year + " is geen schrikkeljaar");
        }
    }
}
