package lesson10;

public class TaskFifth {
        public static int remove_Duplicate_Elements(int arr[], int n){
            if (n==0 || n==1){
                return n;
            }
            int[] tempA = new int[n];
            int j = 0;
            for (int i=0; i<n-1; i++){
                if (arr[i] != arr[i+1]){
                    tempA[j++] = arr[i];
                }
            }
            tempA[j++] = arr[n-1];
            for (int i=0; i<j; i++){
                arr[i] = tempA[i];
            }
            return j;
        }

        public static void main (String[] args) {
            int arr[] = {56,56,77,78,78,98,98,98,98,1,1,1,1,2,2,2};
            int length = arr.length;
            length = remove_Duplicate_Elements(arr, length);
            for (int i=0; i<length; i++)
                System.out.print(arr[i]+" ");
        }
    }

