import java.util.Scanner;
class BinaryToDecimal 
    {
        public static void main(String args[]) 
            {
                Scanner fk = new Scanner(System.in);
                int bin, b, d, s = 0, i = 0;
                System.out.print("Binary number: ");
                bin = sc.nextInt();
                b = bin;
                while (b != 0) {
                d = b % 10;
                s += d * (int) Math.pow(2, i++);
                b /= 10;
            }
        System.out.println("Decimal equivalent:" + s);
        fk.close();
    }
}
