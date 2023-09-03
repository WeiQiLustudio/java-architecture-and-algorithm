package cn.lu.datastructure_algorithm;

public class Code04insertsort02 {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void insertsort2(int[] arr) {
        if(arr==null||arr.length<2){
            return;
        }
        //0~0
        //0~1
        //0~2
        //0~3
        int N=arr.length;
        for(int end = 1;end<N;end++){
            for(int pre=end-1;pre>=0&&arr[pre]>=arr[pre+1];pre--){
                swap(arr,pre,pre+1);
            }
        }
    }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={7,7,8,9,4,5,7,2,4,5,5,6,9,8,9,7,5,8,7,9};
        printArray(arr);
        insertsort2(arr);
        printArray(arr);
    }
}
