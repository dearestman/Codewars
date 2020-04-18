public class CodewarsTask10 {
    public static void main(String[] args) {
        int seconds = 20;

        int h,s,m;
        if (seconds>359999) seconds=359999;
        h=seconds/3600;
        m=(seconds-(h*3600))/60;
        s=seconds-(m*60)-(h*3600);
        String str = String.format("%02d:%02d:%02d",h,m,s);


//        String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
//        String str = String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);

        System.out.println(str);
    }
}
