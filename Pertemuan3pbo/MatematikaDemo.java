public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        Matematika mtk1 = new Matematika(357, 73);
        mtk.a = 221;
        mtk.b = 9;
        mtk.pertambahan();
        mtk.pengurangan();
        mtk.perkalian();
        mtk.pembagian();
        mtk1.pertambahan();
        mtk1.pengurangan();
        mtk1.perkalian();
        mtk1.pembagian();
        Matematika mtk2 = new Matematika();
        mtk2.pertambahan(777.79f, 55.7f);
        mtk2.pengurangan(777.79f, 55.7f);
        mtk2.perkalian(777.79f, 55.7f);
        mtk2.pembagian(777.79f, 55.7f);

    }
}