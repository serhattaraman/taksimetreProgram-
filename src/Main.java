import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double ttKm=2.2, total, startPrice=10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Km Cinsinden Giriniz : ");
        km = input.nextInt();


        total=(km*ttKm);
        total+= startPrice;

        total =(total <20)? 20: total;

        System.out.println("Toplam Tutar: "+total);
    }
}