import java.util.ArrayList;
import java.util.Collections;

public class CodewarsTask9 {
    public static void main(String[] args) {
        int[] array = {5,3,2,8,1,4};
        ArrayList<Integer> index_arr = new ArrayList<Integer>();
        ArrayList<Integer> temp_arr = new ArrayList<Integer>();


        for (int i=0; i<array.length; i++){
            if (array[i]%2 != 0){
                temp_arr.add(array[i]);
                index_arr.add(i);
            }
        }

        Collections.sort(temp_arr);
        for (int i=0; i<temp_arr.size(); i++){
            array[index_arr.get(i)] = temp_arr.get(i);
        }

//        // Sort the odd numbers only
//        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();
//
//        // Then merge them back into original array
//        for (int j = 0, s = 0; j < array.length; j++) {
//            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
//        }


    }
}
