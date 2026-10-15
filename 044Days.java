
import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner hai = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String nama = hai.nextLine();
        
        System.out.print("Masukkan Nilai : ");
        int nilai = hai.nextInt();
        
        char predikat;
        
        if ( nilai >= 90 && nilai <= 100) {
            predikat = 'A';
        } else if (nilai >= 80 && nilai < 90 ) {
            predikat = 'B';
        } else if (nilai >= 70 && nilai < 80 ) {
            predikat = 'C';
        } else if (nilai >= 60 && nilai < 70 ) {
            predikat = 'D';
        } else if (nilai < 60 && nilai >= 0) {
            predikat = 'E';
        } else {
            System.out.print("Nilai tidak Valid");
            return;
        }
        
        System.out.println("Predikat = " + predikat );
        
        if (nilai >= 60 && nilai <= 100) {
            System.out.println("Lulus");
        } else {
            System.out.println("Gagal");
        }
        
    }
}
