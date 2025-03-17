public class Matematika {
    int a, b, hasil;
    double hsl;

    public Matematika() {
    }

    public Matematika(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void pertambahan() {
        hasil = a + b;
        System.out.println("pertambahan: " + a + " +" + b + " = " + hasil);
    }

    void pengurangan() {
        hasil = a - b;
        System.out.println("pengurangan: " + a + " -" + b + " = " + hasil);
    }

    void perkalian() {
        hasil = a * b;
        System.out.println("perkalian: " + a + " x " + b + " = " + hasil);
    }

    void pembagian() {
        hasil = a / b;
        System.out.println("pembagian: " + a + " /" + b + " = " + hasil);
    }

    void pertambahan(float a, float b) {
        hsl = a + b;
        System.out.println("Pertambahan : " + a + " + " + b + " = " + hsl);

    }

    void pertambahan(double a, double b, double c) {
        hsl = a + b + c;
        System.out.println("Pertambahan : " + a + " + " + b + " + " + c + " = " + hsl);

    }

    void pengurangan(float a, float b) {
        hsl = a - b;
        System.out.println("Pengurangan : " + a + " - " + b + " = " + hsl);

    }

    void perkalian(float a, float b) {
        hsl = a * b;
        System.out.println("Perkalian: " + a + " x " + b + " = " + hsl);

    }

    void pembagian(float a, float b) {
        hsl = a / b;
        System.out.println("Pembagian : " + a + " / " + b + " = " + hsl);

    }
}