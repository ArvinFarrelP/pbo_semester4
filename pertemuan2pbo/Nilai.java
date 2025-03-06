public class Nilai {
    String nim,nama;
    float nilaiUts,nilaiTugas, nilaiUas, pNilaiUts, pNilaiTugas,
    pNilaiUas, nilaiAkhir;

    void hitungNilai(){
        pNilaiTugas=0.3f*nilaiTugas;
        pNilaiUts=0.35f*nilaiUts;
        pNilaiUas=0.35f*nilaiUas;
        nilaiAkhir=pNilaiTugas+pNilaiUts+pNilaiUas;
    }
    void cetakNilai(){
        System.out.println("Nim   :"+nim);
        System.out.println("Nama  :"+nama);
        System.out.println("N. Tugas: "+nilaiTugas+"   30% : "+pNilaiTugas);
        System.out.println("N. uTS  : "+nilaiUts  +"   35% : "+pNilaiUts);
        System.out.println("N. UAS  : "+nilaiUas  +"   35% : "+pNilaiUas);
        System.out.println("N. Akhir: "+nilaiAkhir);
        
    }
}