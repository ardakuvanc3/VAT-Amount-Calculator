import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price = 0.0;
        int rate = 18;

        System.out.println("Lütfen tutarı giriniz: ");
        price = input.nextDouble();
        double kdvPrice = (price * rate) / 100;
        System.out.println("KDV Oranı: %" + rate );
        System.out.println("KDV Tutarı: "+ kdvPrice);
        System.out.println("Tutar: "  + (price + kdvPrice));

    }
}