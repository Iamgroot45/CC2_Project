
package selectionsort;

 import java.util.Scanner;
public class SelectionSort {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        
        
        
        int [] arr ={2,4,5,3,1,8,10,0};
        int min, temp =0;
        //int num = arr.length;
        for (int i = 0 ; i < arr.length; i++){
            
            min = i;
            for (int a = i+1 ; a < arr.length; a++){
                if (arr[a]< arr[min]){
                    min = a;               
                }
            }
            
             temp = arr[min];
             arr[min] = arr[i];
             arr[i] = temp;
        }
        
        for (int b = 0; b<arr.length; b++){
            System.out.println(arr[b]);
        }
      
    }
    
}
