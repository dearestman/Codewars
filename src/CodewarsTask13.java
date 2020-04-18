import javax.swing.text.html.parser.Parser;
import java.util.ArrayList;

public class CodewarsTask13 {
    public static void main(String[] args) {
        String str = "dasdasdasdas";
        StringBuffer temp_str = new StringBuffer(str);
//        if (temp_str.length()%2!=0) temp_str.insert(temp_str.length(), " ");
        for (int i=2; i<=temp_str.length()-1; i+=2){
            temp_str.insert(i, " ");
        }
        System.out.println(temp_str.toString());


    }
}
