import java.util.Scanner;

public class Determinan {
    int a, b, c;
    double D, x1, x2;

    Scanner input = new Scanner(System.in);

    public Determinan(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Determinan() {
    }

    void inputABC() {
        System.out.print("a   : ");
        a = input.nextInt();
        System.out.print("b   : ");
        b = input.nextInt();
        System.out.print("c   : ");
        c = input.nextInt();
    }

    void hitungD() {
        D = (b * b) - (4 * a * c);
    }

    void hitungX1X2() {
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
        } else if (D == 0) {
            x1 = x2 = -b / (2 * a);
        } else {
            x1 = (-b / (2 * a)) + Math.sqrt(-D) / (2 * a);
            x2 = (-b / (2 * a)) + Math.sqrt(-D) / (2 * a);
        }
    }

    void cetak() {
        System.out.println("D   : " + D);
        System.out.println("X1   : " + x1);
        System.out.println("X2   : " + x2);
    }

}
