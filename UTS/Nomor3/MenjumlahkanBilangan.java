import java.util.Scanner;

class JumlahkanBilangan {
    int jumlah;
    Scanner input;

    public JumlahkanBilangan() {
        this.jumlah = 0; 
        this.input = new Scanner(System.in); 
    }

    public void inputBilangan(int n) {
        if (n > 0) {
            System.out.printf("Masukan bilangan #%d: ", 11 - n);
            jumlah += input.nextInt();
            inputBilangan(n - 1);
        }
    }

    public int getJumlah() {
        return this.jumlah;
    }
}

public class MenjumlahkanBilangan {
    public static void main(String[] args) {
        JumlahkanBilangan jb = new JumlahkanBilangan();
        
        System.out.println("------------------------");
        System.out.println("SOAL NOMOR 3");    
        System.out.println("------------------------\n");
        
        jb.inputBilangan(10);

        System.out.println("\nHasil penjumlahan dari 10 bilangan di atas adalah: " + jb.getJumlah());
    }
}