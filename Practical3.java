import java.util.Scanner;

public class Practical3 {
    public static void main(String[] args) {
        double minutesInYear = 60 * 24 * 365;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input the number of minutes: ");
        double min = sc.nextDouble();
        long years = (long)(min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;
        System.out.printf((int) min + " minutes is approximately " + years + " year and " + days + " day");

    }
    
}

