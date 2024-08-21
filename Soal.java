import java.util.Scanner;

public class Soal{
    public static void main(String[] args) {
        String NamaBarang;
        double Harga;
        double diskon;
        double jadi_satu;
        double jumlah;
        double total;
        Scanner masukan = new Scanner(System.in);
        System.out.println("Kalkulator belanja");
        System.out.println("Masukkan nama barang = ");
        NamaBarang = masukan.next();
        
        System.out.println("Masukkan Harga Barang = ");
        Harga = masukan.nextDouble();

        System.out.println("Masukkan Jumlah Barang =");
        jumlah = masukan.nextDouble();
        jadi_satu = Harga * jumlah;

        System.out.println("Masukkan Diskon = ");
        diskon = masukan.nextDouble();

        total = ( Harga * jumlah );
        diskon = diskon / 100 * jadi_satu;
        total = total - diskon;
        System.out.println("Total Harga adalah = "+total);


    }
}
    


    

