import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin Bir Kenarı:");
        a = input.nextInt();
        System.out.println("Üçgenin Diğer Kenarı:");
        b = input.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs:" + c);

    }
}
