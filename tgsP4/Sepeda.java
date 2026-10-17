package p4.Tugas;

public class Sepeda {
    String merk;
    int jt=0;

    void maju(){
        jt += 10;
        System.out.println("Bergerak Maju 10 Km");
        tampilkanStatus("Jarak tempuh");
    }
    void mundur(){
        jt -= 5;
        System.out.println("Bergerak Mundur 5 Km");
        tampilkanStatus("Jarak tempuh");
    }
    void berhenti(){
        System.out.println("Sepeda Berhenti");
        tampilkanStatus("Jarak tempuh akhir"); 
    }
    void tampilkanStatus(String jr){
        System.out.println("Object Sepeda " + merk + ", " + jr + " " +  jt + " Km");
    }
}