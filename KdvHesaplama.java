
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvlitutar, kdv;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı Giriniz:");
        tutar = input.nextDouble();
        boolean buyuktutar = (tutar >= 1000);
        boolean kucuktutar = (tutar < 1000);
        double kdvorani = (buyuktutar)? 0.08:0.18;
        kdv = tutar * kdvorani;
        System.out.println("Kdv Oranı:" + kdvorani);
        System.out.println("Kdv tutarı:" + kdv);
        kdvlitutar = tutar + kdv;
        System.out.println("Kdv dahil tutar:" + kdvlitutar);


    }
}
