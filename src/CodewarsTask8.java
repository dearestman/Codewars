public class CodewarsTask8 {
    public static void main(String[] args) {
        String s = "[T]he-Stealth-Warrior";
        String[] words = s.split("[_-]+");
//        String[] words = s.replace("-","_").split("(_)+");
        String s_new = words[0];

//        for (String word : s.replace("-","_").split("(_)+")){
//            if (!word.equals(s.replace("-","_").split("(_)+")[0]))
//                s_new+=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
//            else
//                s_new+=;
//        }

        for (int i=1; i<words.length; i++){
            s_new+=words[i].substring(0,1).toUpperCase()+words[i].substring(1).toLowerCase();
        }


        System.out.println(s_new);
    }
}
