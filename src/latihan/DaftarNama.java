package latihan;

import java.util.ArrayList;
import java.util.Scanner;

public class DaftarNama {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean cond = true;
        while (cond) {
            System.out.println("Menu");
            System.out.println("1. Tambah nama");
            System.out.println("2. Hapus nama");
            System.out.println("3. Tampilkan daftar nama");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = scanner.nextLine();
                    daftarNama.add(nama);
                    break;
                case 2:
                    System.out.print("Masukkan nama yang ingin dihapus: ");
                    String namaHapus = scanner.nextLine();

                    if (!daftarNama.contains(namaHapus)) {
                        System.out.println("Nama tidak ditemukan");
                        break;
                    }

                    daftarNama.remove(namaHapus);
                    System.out.println("Nama " + namaHapus + " berhasil dihapus");
                    break;
                case 3:
                    System.out.println("Daftar nama:");
                    for (String n : daftarNama) {
                        System.out.println(n);
                    }
                    break;
                case 4:
                    cond = false;
                    System.out.println("Thanks bro");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }
    }
}
