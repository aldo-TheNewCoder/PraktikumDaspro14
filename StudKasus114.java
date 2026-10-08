import java.util.Scanner;
public class StudKasus114 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup;
        int totalHarga, diskon, totalBayar;
        int uangBayar, kembalian, kurang;

        System.out.print("Masukkan jumlah Cup yang dibeli: ");
        jumlahCup = scanner.nextInt();

        System.out.println("Massukkan uang bayar"+" Rp ");
        uangBayar = scanner.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= 100000){
            diskon = totalHarga * 10 / 100;
        } 
        
        diskon = 0;
        totalBayar = totalHarga - diskon;
            
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
             System.out.println("Kembalian: " + " Rp " + kembalian);

        }else {
                kurang = totalBayar - uangBayar;
                System.out.println("Uang tidak cukup, kurang : " + " Rp " + kurang);
            }

        System.out.println("Total Harga: " + " Rp " + totalHarga);

        System.out.println("Diskon: " + " Rp " + diskon);

        System.out.println("Total Bayar: " + " Rp " + totalBayar);

        scanner.close();
    }
}