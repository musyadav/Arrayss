package J21;

import java.util.Arrays;

public class Que49 {
    public static void main(String[] args) {
        int arr [] = { 1,2,3,4,5 };
        int k = 3; // k = k%n
        for (int j = 1; j <=k; j++){
            int temp = arr[0];
            for (int i = 0; i< arr.length-1;i++) {
                arr[i] = arr[i + 1];
            }arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
