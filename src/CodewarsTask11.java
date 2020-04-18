public class CodewarsTask11 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        int target = 4;
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length-1; j++){
                if (arr[i]+arr[j+1]==target){
                    int[] return_arr = {i,j+1};
                }
            }
        }
        int a=0;
    }
}
