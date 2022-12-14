package ahmedpractesing;

public class MinMaxFinding {
    public static class Pair{
        int min;
        int max;

    }
    public static Pair getMinMax(int arr[],int n){
        Pair minmax=new Pair();
        int i;
        if (n==1){
            minmax.min=arr[0];
            minmax.max=arr[0];
            return minmax ;
        }
        if (arr[0]<arr[1]){
            minmax.max=arr[0];
            minmax.min=arr[1];
        }else {
            minmax.min=arr[0];
            minmax.max=arr[1];
        }
        for (i=2;i<n;i++){
            if (arr[i]>minmax.max){
                minmax.max=arr[i];
            }else if (arr[i]<minmax.min){
                minmax.min=arr[i];
            }
        }return minmax;
    }

    public static void main(String[] args) {
        int arr[]={12,22,55,88,99,55};
        int arr_size=5;
        Pair minmax=getMinMax(arr,arr_size);
    }
}
