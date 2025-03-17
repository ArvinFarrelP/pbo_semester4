import java.util.Scanner;

public class Nilai {
    String nim, nama;
    float nilaiUts, nilaiTugas, nilaiUas, pNilaiUts, pNilaiTugas,
            pNilaiUas, nilaiAkhir;

    String nHuruf, predikat;
    Scanner input = new Scanner(System.in);

    public Nilai(String nim, String nama, float nilaiTugas, float nilaiUts, float nilaiUas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    public Nilai() {
    }

    void inputData() {
        System.out.println("Nim   :");
        nim = input.nextLine();
        System.out.println("Nama  :");
        nama = input.nextLine();
        System.out.println("N. Tugas: ");
        nilaiTugas = input.nextFloat();
        System.out.println("N. uTS  : ");
        nilaiUts = input.nextFloat();
        System.out.println("N. UAS  : ");
        nilaiUas = input.nextFloat();
    }

    void hitungNilai() {
        pNilaiTugas = 0.3f * nilaiTugas;
        pNilaiUts = 0.35f * nilaiUts;
        pNilaiUas = 0.35f * nilaiUas;
        nilaiAkhir = pNilaiTugas + pNilaiUts + pNilaiUas;
    }

    String getNilHuruf(float nilai) {
        if (nilai >= 85)
            nHuruf = "A";
        else if (nilai >= 70 && nilai < 85)
            nHuruf = "B";
        else if (nilai >= 60 && nilai < 70)
            nHuruf = "C";
        else if (nilai >= 40 && nilai < 60)
            nHuruf = "D";
        else
            nHuruf = "E";
        return nHuruf;
    }

    String getPredikat(String huruf) {
        switch (huruf) {
            case "A":
                predikat = "Apik";
                break;
            case "AB":
                predikat = "Apik Baik";
                break;
            case "B":
                predikat = "Baik";
                break;
            case "BC":
                predikat = "Cukup Baik";
                break;
            case "C":
                predikat = "Cukup";
                break;
            case "D":
                predikat = "Dablek";
                break;
            default:
                predikat = "Elek";
        }
        return predikat;
    }

    void cetakNilai() {
        System.out.println("Nim   :" + nim);
        System.out.println("Nama  :" + nama);
        System.out.println("N. Tugas: " + nilaiTugas + "   30% : " + pNilaiTugas);
        System.out.println("N. uTS  : " + nilaiUts + "   35% : " + pNilaiUts);
        System.out.println("N. UAS  : " + nilaiUas + "   35% : " + pNilaiUas);
        System.out.println("N. Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + getNilHuruf(nilaiAkhir));
        System.out.println("Predikat : " + getPredikat(nHuruf));

    }
}