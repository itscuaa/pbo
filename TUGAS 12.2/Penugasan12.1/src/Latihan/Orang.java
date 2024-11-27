package Latihan;

class Orang {
    String nama;
    int umur;

    Orang(String nama) {
        this.nama = nama;
    }

    Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
}

class Dosen extends Orang {
    int nip;

    Dosen(String nama) {
        super(nama);
    }

    Dosen(String nama, int nip) {
        super(nama);
        this.nip = nip;
    }

    Dosen(String nama, int nip, int umur) {
        super(nama, umur);
        this.nip = nip;
    }

    void info() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Umur: " + umur);
    }
}

class TesLatihan {
    public static void main(String args[]) {
        System.out.println("Memasukkan identitas dosen 1: Agus");
        Dosen dosen1 = new Dosen("Agus");

        System.out.println("Memasukkan identitas dosen 2: Budi, NIP 1458");
        Dosen dosen2 = new Dosen("Budi", 1458);

        System.out.println("Memasukkan identitas dosen 3: Iwan, NIP 1215, umur 47");
        Dosen dosen3 = new Dosen("Iwan", 1215, 47);

        System.out.println();

        dosen1.info();
        System.out.println();

        dosen2.info();
        System.out.println();

        dosen3.info();
    }
}