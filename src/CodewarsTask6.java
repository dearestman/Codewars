public class CodewarsTask6 {
    public static void main(String[] args) {
        int p0 = 1500;
        double percent = 0.05;
        int aug=100;
        int p=5000;
        int count=0;
        while (p0<p){
            p0=(int)(p0+p0*percent+aug);
            count++;
        }
        System.out.println(count);
    }
}
