import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("何回");
        System.out.println("繰り返したい?");
        int roop = scan.nextInt();
        scan.close();
        list = range(roop);

        System.out.println("実行中...");
        list.parallelStream().forEach(searchNum -> {
            int kensaNum = 2;
            int searchNumSqrt = (int) Math.sqrt(searchNum);
            int kanzensuTest = 1;
            if (searchNumSqrt * searchNumSqrt == searchNum) {
                kanzensuTest += searchNumSqrt;
                searchNumSqrt -= 1;
            }
            while (kensaNum <= searchNumSqrt) {
                int amari = searchNum % kensaNum;
                if (amari == 0) {
                    kanzensuTest += (int) kensaNum + searchNum / kensaNum;
                    if (kanzensuTest > searchNum) {
                        break;
                    }
                }
                kensaNum += 1;
            }
            if (kanzensuTest == searchNum) {
                System.out.println(searchNum);
            }
        });
    }
    public static List<Integer> range(int r){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < (r+1); i++){
            list.add(i);
        }
        return list;
    }
}