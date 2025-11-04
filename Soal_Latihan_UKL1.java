import java.util.Scanner;

public class Soal_Latihan_UKL1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama barang: ");
        String barang = input.nextLine();
        System.out.print("Masukkan berat barang (dalam kg): ");
        double beratKg = input.nextDouble();
        System.out.print("Masukkan jarak pengiriman (dalam km): ");
        int jarakKm = input.nextInt();
        System.out.print("Masukkan panjang (cm): ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar (cm): ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi (cm): ");
        double tinggi = input.nextDouble();
        double Volume = panjang * lebar * tinggi;

        double beratDikenakan = beratKg;
        double biayaPerKg = 0;
        double biayaVolume = 0;

        if (jarakKm <= 10) {
            biayaPerKg = 4250;
        } else if (jarakKm > 10) {
            biayaPerKg = 6000;
        }

        double total;
        if (Volume > 100) {
            biayaVolume = 50000;
            total = (beratDikenakan * biayaPerKg) + biayaVolume;
        } else {
            total = beratDikenakan * biayaPerKg;
        }
        System.out.println();
        System.out.println("----- Nota Pengiriman -----");
        System.out.println("Barang           : " + barang);
        System.out.println("Jarak            : " + jarakKm + " km");
        System.out.println("Berat           : " + beratKg + " kg");
        System.out.println("Volume          : " + Volume + " cm3");
        System.out.println("Biaya per kg     : " + biayaPerKg);
        System.out.printf("Biaya volume     : " + biayaVolume);
        System.out.printf("Total : " + total);
        input.close();

    }
}
