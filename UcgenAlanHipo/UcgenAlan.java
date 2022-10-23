import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        double a,b,c,u,x;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Üçgenin ilk kenarını yazınız:");
        a = girdi.nextDouble();
        System.out.print("Üçgenin dİğer kenarını yazınız:");
        b = girdi.nextDouble();
        System.out.print("Üçgenin son kenarını yazınız:");
        c = girdi.nextDouble();
        u =(a+b+c) / 2;
        x = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı:" + x);



    }
}
