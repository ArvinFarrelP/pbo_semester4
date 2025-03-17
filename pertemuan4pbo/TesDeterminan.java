import java.util.Scanner;

public class TesDeterminan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jawab = "";
        do {
            Determinan dtm = new Determinan();
            dtm.inputABC();
            dtm.hitungD();
            dtm.hitungX1X2();
            dtm.cetak();
            System.out.print("input lg Y/T: ");
            jawab = input.nextLine();

        } while (jawab.equalsIgnoreCase("Y"));
    }
}