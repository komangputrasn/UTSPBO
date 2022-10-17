import java.util.Scanner;

class PerhitunganBMI {
    private double tinggi, berat;
    private double nilaiBMI;

    public PerhitunganBMI(double tinggi, double berat) {
        this.tinggi = tinggi;
        this.berat = berat;
    }
    
    public double getNilaiBMI() {
        this.nilaiBMI = this.berat / (this.tinggi * this.tinggi);
        return this.nilaiBMI; 
    }
}

public class BMI {
    public static void main(String[] args) {
        System.out.println("------------------------");
        System.out.println("SOAL NOMOR 2");    
        System.out.println("------------------------\n");

        Scanner input = new Scanner(System.in);
        double tinggi, berat;
        double nilaiBMI;

        System.out.print("Masukan tinggi badan dalam meter: ");
        tinggi = input.nextDouble();

        System.out.print("Masukan berat badan dalam kg: ");
        berat = input.nextDouble();

        PerhitunganBMI bmi = new PerhitunganBMI(tinggi, berat);

        nilaiBMI = bmi.getNilaiBMI();

        if (nilaiBMI >= 18.5 && nilaiBMI <= 22.9) {
            System.out.printf("\nNilai BMI = %.2f --> Ideal\n\n", nilaiBMI);
        } else if (nilaiBMI < 18.5) {
            System.out.printf("\nNilai BMI = %.2f --> Underweight\n\n", nilaiBMI);
        } else {
            System.out.printf("\nNilai BMI = %.2f --> Underweight\n\n", nilaiBMI);
        }

        input.close();
    }
}
