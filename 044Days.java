
import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner hai = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String nama = hai.nextLine();

        System.out.print("Masukkan Nilai : ");
        int nilai = hai.nextInt();

        char predikat;

        if (nilai >= 95 && nilai <= 100) {
            predikat = 'A';
        } else if (nilai >= 85 && nilai < 95) {
            predikat = 'B';
        } else if (nilai >= 75 && nilai < 85) {
            predikat = 'C';
        } else if (nilai >= 65 && nilai < 75) {
            predikat = 'D';
        } else if (nilai < 65 && nilai >= 0) {
            predikat = 'E';
        } else {
            System.out.print("Nilai tidak Valid");
            return;
        }

        System.out.println("Predikat = " + predikat);
    }
}
