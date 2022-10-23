import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, dmt = 1.11, muz = 0.95, pat = 5.0;
        double kar, kel, kdmt, kmuz, kpat, tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ?");
        kar = input.nextDouble();
        System.out.print("Elma Kaç Kilo ?");
        kel = input.nextDouble();
        System.out.print("Domates Kaç Kilo ?");
        kdmt = input.nextDouble();
        System.out.print("Muz Kaç Kilo ?");
        kmuz = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ?");
        kpat = input.nextDouble();
        tutar = (kar*armut) + (kel*elma) + (kdmt*dmt) + (kmuz*muz) + (kpat*pat);
        System.out.println("Toplam Tutar :" +tutar);

    }
}
