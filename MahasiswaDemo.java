import java.util.Scanner;
public class MahasiswaDemo {
    public static void main(String[] args) {
        StackTugasMahasiswa20 stack = new StackTugasMahasiswa20(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Pengumpulan Pertama");
            System.out.println("5. Jumlah Mahasiswa yang Mengumpulkan");
            System.out.println("6. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa20 mhs = new Mahasiswa20(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa20 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari "+ dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalBiner(nilai);
                        System.out.println("Nilai biner tugas: "+biner);
                    }
                    break;
                case 3:
                    Mahasiswa20 lihat =stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh "+ lihat.nama);
                    }
                    break;
                case 4:
                    Mahasiswa20 lihatAwal =stack.peekFirst();
                    if (lihatAwal != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh "+ lihatAwal.nama);
                    }
                    break;
                case 5:
                    if (stack != null) {
                        System.out.println("Jumlah mahasiswa yang telah mengumpulkan tugas "+stack.peekTop());
                    }
                    break;
                case 6:
                    System.out.println("Daftar nama tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }while (pilih>=1 && pilih <=4);
    }
}
