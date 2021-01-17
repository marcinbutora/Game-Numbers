package doctype;
import java.util.Scanner;

class randomTxt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name = scan.nextLine();
        System.out.println("Ile zarabiasz?");
        double payment = scan.nextDouble();
        System.out.println("Ile masz już wiosen?");
        int age = scan.nextInt();
        System.out.println("Cześć: "+name);
        System.out.println("Twoja wypłata to: " +payment);
        System.out.println("Twój wiek to: " +age);
    }
}
