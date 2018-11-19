package sorting;
import java.util.*;
import javax.swing.JOptionPane;

public class Sorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nm;
        int[] tm;
        
        //ask for input
        System.out.print("Input length of numbers: ");
        //nm = JOptionPane.showInputDialog(null, "Input random numbers: ");
        nm = in.nextInt();
        
        //convert input to int
        tm = new int[nm];
        System.out.println("Input numbers:");
        for(int i = 0 ; i<tm.length ; i++){
            tm[i] = in.nextInt();
        }
        
        //call
        BubbleSort(tm,nm);
        
    }
    public static void BubbleSort(int[] nm , int xy){
        int c = 0;
        int i = xy;
        
        //while loop just to be sure
        while(i!=50){
            for(int x = 0, y = 1; y<nm.length ; x++, y++){
                //System.out.print(x);
                //System.out.println(y);
                //evaluation if index 0 is greater than index 1
                if(nm[x] > nm[y]){
                    c = nm[y];
                    nm[y] = nm[x];
                    nm[x] = c;
                } 
            }
            i++;
        }

        //output the sorted array
        System.out.print("Sorted: ");
        for(int show : nm){
            System.out.printf("%d ",show);
        }
        //JOptionPane.showMessageDialog(null,  "Sorted: " + Arrays.toString(nm), "", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
