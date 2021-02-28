import java.math.BigInteger;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        BigInteger num = BigInteger.ONE;
        Scanner scan = new Scanner(System.in);

        System.out.println("累乗計算機");

        System.out.println("何を累乗する？");
        int ruijo = scan.nextInt();

        System.out.println("何乗にしたい？");
        int nanjo = scan.nextInt();

        scan.close();

        
        for (int i=1; i<=nanjo; i++){
            num = num.multiply(BigInteger.valueOf(ruijo));
        }

        System.out.println("結果");
        System.out.println(num);
    }
}
