import java.lang.reflect.Array;
import java.util.Arrays;

public class CodewarsTASK3 {
    public static void main(String[] args) {
//        String str = "dsgf";
//        char[] chars = str.toUpperCase().toCharArray();
//        Arrays.sort(chars);
//        for (int i=0; i<chars.length-1; i++){
//            if (chars[i]==chars[i+1]){
//                System.out.println(false);
//                break;
//            }
//        }
//        System.out.println(true);
        String str = "dsgf";
        System.out.println(str.length() == str.toLowerCase().chars().distinct().count());


    }
}
