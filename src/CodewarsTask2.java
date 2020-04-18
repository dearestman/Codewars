public class CodewarsTask2 {

//    можно было решить так:
////    public class FindOdd {
////        public static int findIt(int[] A) {
////            int xor = 0;
////            for (int i = 0; i < A.length; i++) {
////                xor ^= A[i];
////            }
////            return xor;
////        }
////    }
    public static void main(String[] args) {
        int[] mass = {1,1,1,1,10,1,10,1,1,12,12,1,14,1,1};
        int count,element = 0;

        for(int i = mass.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( mass[j] > mass[j+1] ){
                int tmp = mass[j];
                mass[j] = mass[j+1];
                mass[j+1] = tmp;
            }
        }
    }

        for (int i=0; i<mass.length; i++){
            element=mass[i];
            count=0;
            for (int j =i; j<mass.length; j++){
                if (element==mass[j]) {
                    count++;
                }else
                    break;

            }
            if (((float)count/(float)2)%1!=0)
            {
                break;
            }
            i+=--count;
        }
        System.out.println(element);

    }
}
