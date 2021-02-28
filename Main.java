import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        System.out.println(range(10));
    }
    public static List range(int r){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < (r+1); i++){
            list.add(i);
        }
        return list;
    }
}