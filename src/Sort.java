public class Sort {
    public static void main(String[] args) {
        int arr[]={66,16,8,67,4,5};
    for (int i = 0; i<arr.length-1;i++){
        for (int j =0; j< arr.length-1;j++ ){
            if (arr[j]>arr[j+1]){
                int temp =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    } for (int a: arr){
            System.out.print(a+" ");
        }
    }
}
