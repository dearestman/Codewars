public class CodewarsTask7 {
    public static void main(String[] args) {
        int num = 16;
        int tempNum=0;
        int count=0;
        do {
            count+=tempNum;
            tempNum+=3;

            System.out.println(tempNum);
        } while (3+tempNum<num);
        tempNum=0;
        do {
            if (tempNum/3==0 | (float)tempNum/(float)3%1 != 0){
                count+=tempNum;
                tempNum+=5;

                System.out.println(tempNum);
            }
            else{
                tempNum+=5;
            }
        } while (5+tempNum<num);
        System.out.println(count);
    }
}
