package p4.Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sepeda spd = new Sepeda();
        
        System.out.print("Masukan Object Merk Sepeda: ");
        spd.merk = input.nextLine();
        System.out.println("Object " + spd.merk + " dibuat, jarak tmpuh awal " + spd.jt + " km");
        
        int pil;
        do {
            System.out.println("\nMenu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            System.out.print("Pilihan: ");
            pil = input.nextInt();

            switch(pil){
                case 1->spd.maju();
                case 2->spd.mundur();
                case 3->spd.berhenti();
                case 0->{System.out.println("Keluar Program ..");
                         System.out.println("Terimakasih sudah menggunakan program ini");
                }
                default-> System.out.println("Pilihan tidak valid, silakan coba lagi");
            }
        } while (pil != 0);
    }
}