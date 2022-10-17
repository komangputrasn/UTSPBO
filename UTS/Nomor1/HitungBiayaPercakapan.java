import java.util.Scanner;

class BiayaPercakapan {
    private int jamAwal, menitAwal, detikAwal;
    private int jamAkhir, menitAkhir, detikAkhir;

    private int lamaPercakapanDetik;

    // constructor untuk menginisialisasi member variables
    public BiayaPercakapan(int jamAwal, int menitAwal, int detikAwal, int jamAkhir, int menitAkhir, int detikAkhir) {
        this.jamAwal = jamAwal;
        this.menitAwal = menitAwal;
        this.detikAwal = detikAwal;

        this.jamAkhir = jamAkhir;
        this.menitAkhir = menitAkhir;
        this.detikAkhir = detikAkhir;

        this.lamaPercakapanDetik = (jamAkhir - jamAwal) * 3600 + (menitAkhir - menitAwal) * 60 + (detikAkhir - detikAwal);
    }

    // mengembalkikan lama waktu percakapan dalam detik
    public int getLamaPercakapan() {
        return this.lamaPercakapanDetik; 
    }

    // mengembalikan biaya percakapan
    public double getBiayaPercakapan() {
        int totalPulsa = this.lamaPercakapanDetik / 5;
        int biaya = totalPulsa * 150;
        return biaya; 
    }
}

public class HitungBiayaPercakapan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jamAwal, menitAwal, detikAwal;
        int jamAkhir, menitAkhir, detikAkhir;
        int lamaPercakapan;

        System.out.println("------------------------");
        System.out.println("SOAL NOMOR 1");    
        System.out.println("------------------------\n");

        System.out.print("Masukan jam awal: ");
        jamAwal = input.nextInt();

        System.out.print("Masukan menit awal: ");
        menitAwal = input.nextInt();

        System.out.print("Masukan detik awal: ");
        detikAwal = input.nextInt();

        System.out.println("\n------------------------\n");

        System.out.print("Masukan jam akhir: ");
        jamAkhir = input.nextInt();

        System.out.print("Masukan menit akhir: ");
        menitAkhir = input.nextInt();

        System.out.print("Masukan detik akhir: ");
        detikAkhir = input.nextInt();

        System.out.println("\n------------------------\n");

        BiayaPercakapan bp = new BiayaPercakapan(jamAwal, menitAwal, detikAwal, jamAkhir, menitAkhir, detikAkhir);

        lamaPercakapan = bp.getLamaPercakapan();

        System.out.println("Lama percakapan: ");
        System.out.printf("%d jam\n", lamaPercakapan / 3600);
        System.out.printf("%d menit\n", (lamaPercakapan % 3600) / 60);
        System.out.printf("%d detik\n", (lamaPercakapan % 3600) % 60);

        System.out.printf("\nBiaya percakapan: Rp %.2f", bp.getBiayaPercakapan());
    }
}