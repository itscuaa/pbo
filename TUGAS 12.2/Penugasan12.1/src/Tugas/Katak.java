package Tugas;

public class Katak {
    int umur;
    String nama;

    public Katak(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }

    public String caraBergerak() {
        return "melompat";
    }
}

class Kecebong extends Katak {
    double panjangEkor;

    public Kecebong(int umur, String nama, double panjangEkor) {
        super(umur, nama);
        this.panjangEkor = panjangEkor;
    }

    @Override
    public String caraBergerak() {
        return "berenang";
    }
}

class TesTugas2 {
    public static void main(String[] args) {
        Katak froggy = new Katak(5, "Froggy");
        Kecebong juniorFrog = new Kecebong(2, "Junior Frog", 10);

        System.out.println("Objek 01");
        System.out.println("Umur: " + froggy.umur);
        System.out.println("Nama: " + froggy.nama);
        System.out.println("Cara Bergerak: " + froggy.caraBergerak());

        System.out.println("\nObjek 02");
        System.out.println("Umur: " + juniorFrog.umur);
        System.out.println("Nama: " + juniorFrog.nama);
        System.out.println("Panjang Ekor: " + juniorFrog.panjangEkor);
        System.out.println("Cara Bergerak: " + juniorFrog.caraBergerak());
    }
}
