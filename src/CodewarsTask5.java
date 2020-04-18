public class CodewarsTask5 {
    public static void main(String[] args) {
        int num =625;
        System.out.println((int)Math.pow((int)Math.sqrt(num)+1,2));
        System.out.println(Math.sqrt(num)%1 == 0 ? (long)Math.pow((long)Math.sqrt(num)+1,2) : -1);
    }
}
