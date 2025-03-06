public class TesMobil2 {
    public static void main(String[] a)
    {
        Mobil2 avanza=new Mobil2();
        Mobil2 xenia=new Mobil2();
        avanza.hidupkanMobil("Silver metalic");
        avanza.ubahGigi("Silver metalic");
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        System.out.println("Roda avanza   : "+avanza.roda);
        System.out.println("Roda Xenia    : "+xenia.roda);
        System.out.println("Mesin avanza  : "+avanza.mesin);
        System.out.println("Mesin xenia   : "+xenia.mesin);
        avanza.roda=5;
        System.out.println("Roda avanza   : "+avanza.roda);
        System.out.println("Roda Xenia    : "+xenia.roda);
        avanza.mesin=9;
        System.out.println("Mesin avanza  : "+avanza.mesin);
        System.out.println("Mesin xenia   : "+xenia.mesin);
        avanza.matikanMobil("Silver metalic");
    }
}