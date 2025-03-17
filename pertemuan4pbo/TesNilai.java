public class TesNilai {
    public static void main(String[] a) {
        Nilai nilaiku = new Nilai();
        nilaiku.nim = "A11.2023.15062";
        nilaiku.nama = "ArvinFarrelP";
        nilaiku.nilaiTugas = 90;
        nilaiku.nilaiUts = 87;
        nilaiku.nilaiUas = 89;
        nilaiku.hitungNilai();
        nilaiku.cetakNilai();
        Nilai nilaimu = new Nilai();

        nilaimu.inputData();
        nilaimu.hitungNilai();
        nilaimu.cetakNilai();
        Nilai nilainya = new Nilai("A11.2023.15062", "ArvinFarrelP", 88, 90, 75);
        nilainya.hitungNilai();
        nilainya.cetakNilai();
        ;
    }
}
