import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {

        int mesafe, yas, yol;
        double fiyat, km = 0.10, indcocuk = 0.5, indgenc = 0.1, indyasli = 0.3, indikibilet = 0.2;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yol = input.nextInt();

        if (mesafe > 0 && yas > 0 && (yol == 1 || yol == 2)) {
            fiyat = mesafe * km;
            if (yas <= 12) {
                fiyat = fiyat - (fiyat * indcocuk);
            } else if (yas <= 24) {
                fiyat = fiyat - (fiyat * indgenc);
            } else if (yas >= 65) {
                fiyat = fiyat - (fiyat * indyasli);
            }
            if (yol == 2) {
                fiyat = (fiyat - (fiyat * indikibilet)) * 2;
            }
            System.out.print("Toplam tutar : " + fiyat + "Tl");
        } else {
            System.out.print("Hatalı giriş yaptınız!");
        }
    }
}