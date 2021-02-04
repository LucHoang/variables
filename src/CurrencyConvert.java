import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tyGia = 23000;

        System.out.print("Nhap vao USD: ");
        double usd = input.nextDouble();

        double vnd = usd*tyGia;
        System.out.println(usd+" USD = "+vnd+" VND");
    }
}
