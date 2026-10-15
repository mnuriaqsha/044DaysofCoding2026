
import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner hai = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String nama = hai.nextLine();
        
        System.out.print("Masukkan Nilai : ");
        int nilai = hai.nextInt();
        
        char predikat;
        
        if ( nilai >= 85 && nilai <= 100) {
            predikat = 'A';
        } else if (nilai >= 75 && nilai <= 84 ) {
            predikat = 'B';
        } else if (nilai >= 65 && nilai <= 74 ) {
            predikat = 'C';
        } else if (nilai >= 50 && nilai <= 64 ) {
            predikat = 'D';
        } else if (nilai <= 49 && nilai >= 0) {
            predikat = 'E';
        } else {
            System.out.print("Nilai tidak Valid");
            return;
        }

        System.out.println("Nama : "+nama);
        System.out.println("Nilai : "+nilai);
        System.out.println("Predikat Nilai :  " + predikat );
        
        if (nilai >= 60 && nilai <= 100) {
            System.out.println("Status : Lulus");
        } else {
            System.out.println("Status : Tidak Lulus");
        }
        
    }
}
