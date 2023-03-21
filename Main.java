
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Unesi temperaturu vode: ");
        int temp = scan.nextInt();
        if (temp >= 100)
            System.out.print("Ejte vi, voda vri!");
        else System.out.print("Jos nista...");

    }
}