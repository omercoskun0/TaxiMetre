import java.util.Scanner;
public class Merhaba {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Km bilgisi lütfen : ");
        km= input.nextInt();
        total += km*perKm;
        total = (total < 20) ? 20 : total ;

        System.out.print(total);
    }
}
