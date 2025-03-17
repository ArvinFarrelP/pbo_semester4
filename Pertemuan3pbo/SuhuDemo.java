public class SuhuDemo {

    public static void main(String[] args) {
        Suhu suhuku = new Suhu();
        Suhu suhumu = new Suhu(37);
        suhuku.c = 36;
        suhuku.cToK();
        suhuku.cToF();
        suhumu.cToK();
        suhumu.cToF();
        suhumu.inputC();
        suhumu.cToK();
        suhumu.cToF();
        System.out.println("Suhumu : " + suhumu.cToK(38.5f) + "K");
        System.out.println("Suhumu : " + suhumu.cToF(38.5f) + "F");
    }
}