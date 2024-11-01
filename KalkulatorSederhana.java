package belajar.kalkulatorsederhana;

import java.util.Scanner;

public class KalkulatorSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Angka Pertama : ");
        int angka1 = input.nextInt();
        
        System.out.print("Operator (+, -, *, /) : ");
        String operator = input.next();
        
        System.out.print("Angka Kedua : ");
        int angka2 = input.nextInt();
        
        int hasil = 0;
        
        switch (operator) {
            case "+":
                hasil = angka1 + angka2;
                System.out.println("Hasil : " +hasil);
                break;
            case "-":
                hasil = angka1 - angka2;
                System.out.println("Hasil : " +hasil);
                break;
            case "*":
                hasil = angka1 * angka2;
                System.out.println("Hasil : " +hasil);
                break;
            case "/":
                if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.println("Hasil : " +hasil);
            } else {
                System.out.println("Kesalahan : Pembagian dengan nol tidak diperbolehkan");
            }
                break;
            default:
                System.out.println("Input tidak valid");
                break;
        }
        input.close();
    }
}
