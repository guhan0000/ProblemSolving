import java.util.*;
public class BulbSwitch
{
    public static int BulbSwitch(int arr[], int n)
    {
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                arr[i] = 1;
                for(int j = i+1; j < n; j++){
                    if(arr[j] == 1){
                        arr[j] = 0;
                    }
                    else{
                        arr[j] = 1;
                    }
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {0,0,0,0};
        int n = arr.length;

        System.out.println("Minimum no of switches to press: " + BulbSwitch(arr, n));
    }
} 