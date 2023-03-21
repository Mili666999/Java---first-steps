import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Unesi iznos racuna: ");
        double iznos = scan.nextDouble();
        System.out.println("Baksa je " + iznos * 15 / 100 + " novaca.");

    }
}