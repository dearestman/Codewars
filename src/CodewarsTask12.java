import java.util.ArrayList;
import java.util.Collections;

public class CodewarsTask12 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";

//       Вот так можно было сделать
//        for (char c = 'a'; c<='z'; c++)
//            if (!sentence.toLowerCase().contains("" + c))
//                return false;
//        return true;

        System.out.println(str.toUpperCase().replaceAll("[^A-Z]", "").chars().distinct().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString().length() == 26);
    }
}
