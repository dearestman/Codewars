public class CodewarsTask4 {
    public static void main(String[] args) {
        String str = "WUBWUBABCWUB";

//        System.out.println(str.replace("WUB", " ").trim().replace("  ", " "));
        System.out.println(str.replaceAll("(WUB)+", " ").trim());
    }
}
