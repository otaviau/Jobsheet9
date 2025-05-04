import java.util.Scanner;
public class SuratDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat stack = new StackSurat(10);
        int pilih;

        do{
            System.out.println("\n------MENU------");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n--TERIMA SURAT IZIN--");
                    System.out.print("ID Surat      : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas         : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin    : ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Durasi (hari) : ");
                    int durasi = sc.nextInt(); sc.nextLine();
                    stack.push(new Surat20(id, nama, kelas, jenis, durasi));
                    break;
                case 2:
                    Surat20 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari "+diproses.namaMhs);
                    }
                    break;
                case 3:
                    Surat20 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari "+terakhir.namaMhs);
                    }
                    break;
                case 4:
                    System.out.println("\n--CARI SURAT IZIN--");
                    System.out.print("Masukkan nama mahasiswa :");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari);
                    break;
                default:
                    break;
            }
        } while (pilih != 0);
    }
}
