import java.util.Scanner;

public class Gaji{
    public static void main(String[] args) {
        int jam_kerja;
        int tarif_per_jam;
        double gaji_kotor;
        double gaji_bersih;
        double pajak = 10 ;
        double potongan;
        double hasil_akhir;
        Scanner input = new Scanner(System.in);

        //GAJI KOTOR JAM KERJA * TARIF PERJAM
        //GAJI BERSIH = GAJI KOTOR * 10 PERSEN
        
        System.out.println("Lama jam kerja = ");
        jam_kerja = input.nextInt();

        System.out.println("Tarif per jam = ");
        tarif_per_jam = input.nextInt();
        gaji_kotor = jam_kerja * tarif_per_jam;

        System.out.println("gaji kotornya yaitu = "+gaji_kotor);
        pajak = pajak / 100;
        potongan = gaji_kotor * pajak;
        System.out.println("potongannya adalah = "+potongan);

        gaji_bersih = gaji_kotor - potongan;
        System.out.println("jadi gaji bersihnya adalah = "+gaji_bersih);
        
        
        
        
        
    }
}

    

