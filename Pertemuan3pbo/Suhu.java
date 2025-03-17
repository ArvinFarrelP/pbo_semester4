import java.util.Scanner;

public class Suhu {
    int c;
    float hasil;
    Scanner key = new Scanner(System.in);

    public Suhu() {
    }

    public Suhu(int c) {
        this.c = c;
    }

    void inputC() {
        System.out.print("input C : ");
        c = key.nextInt();
    }

    void cToK() {
        hasil = c + 273.15f;
        System.out.println(c + "C = " + hasil + "K");
    }

    void cToK(int c) {
        hasil = c + 273.15f;
        System.out.println(c + "C = " + hasil + "K");
    }

    float cToK(float c) {
        return c + 273.15f;
    }

    //
    void cToF() {
        hasil = c * (1.8f + 32);
        System.out.println(c + "C = " + hasil + "F");
    }

    void cToF(int c) {
        hasil = c * (1.8f + 32);
        System.out.println(c + "C = " + hasil + "F");
    }

    float cToF(float c) {
        return c * (1.8f + 32);
    }
}