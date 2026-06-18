// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package array;

class Kdane {
    public static void main(String[] args) {
        int arr[]={2, 3, -8, 7, -1, 2, 3};
        int start =0;
        int end=0;
        int tempStart=0;
        int currSum=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(currSum+arr[i]<arr[i]){
                currSum=arr[i];
                tempStart=i;
            }else{
                currSum+=arr[i];
            }
            if(maxSum<currSum){
                maxSum=currSum;
                start=tempStart;
                end=i;
            }
        }
        System.out.println(maxSum);
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
