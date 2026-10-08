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

        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= 100000){
            diskon = totalHarga * 10 / 100;

            else {
                diskon = 0;
            } totalBayar = totalHarga - diskon;
            
        }
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;

            else {
                kurang = totalBayar - uangBayar;
            }
        }
        
    }
}
