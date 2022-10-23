import java.util.Scanner;
public class DaireDilimiAlan {
    public static void main(String[] args) {
        double r, alfa, alan, pi=3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını yazınız:");
        r = input.nextDouble();
        System.out.println("Merkez açısının ölçüsünü yazınız:");
        alfa = input.nextDouble();
        alan =  (pi * (r*r) * alfa) / 360;
        System.out.print("Daire diliminin alanı:" +alan);


    }
}

