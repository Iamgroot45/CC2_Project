package abarrays;

import java.util.*;

public class AbArrays{
    
    static int e = 0,o = 0;
    //static int[][] sample;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        int size;
        int[] single , ee, oo;
        System.out.print("Input length of numbers: ");
        size = in.nextInt();
        
        //single dimensional
        //ArrayList even = new ArrayList();
        //ArrayList odd = new ArrayList();
       
        single = new int[size];
        System.out.println("Input numbers:");
        for(int i = 0 ; i<single.length ; i++){
            System.out.print("Input number for index " + (i+1) + ": ");
            single[i] = in.nextInt();
        }
        
        for(int xy = 0 ; xy < single.length ; xy++){
            if(single[xy] % 2 == 0){
                e++;
            }else{
                o++;
            }
        }
         
        ee = new int[e];
        oo = new int[o];
        
        System.out.print("Elements: ");
        int xyz = 0;
        int xyzz = 0;
        for(int xy = 0 ; xy < single.length ; xy++){
            System.out.printf("%d ",single[xy]);s
            if(single[xy] % 2 == 0){
                //even.add(single[xy]);
                ee[xyz] = single[xy];
                xyz++;
            }else{
                //odd.add(single[xy]);
                oo[xyzz] = single[xy];
                xyzz++;
            }
        }
        
        System.out.println("");
        System.out.println("Even\tOdd");
        /*
        for(int xy = 0 ; xy < single.length ; xy++){
            if(xy >= odd.size() && xy < even.size()){
                System.out.println(even.get(xy));
            }else if(xy >= even.size() && xy < odd.size()){
                System.out.println("\t" + odd.get(xy));
            }else if(xy < even.size() && xy < odd.size()){
                System.out.println(even.get(xy) + "\t" + odd.get(xy));
            }
        }
        
        for(int xy = 0 ; xy < single.length ; xy++){
            if(xy >= oo.length && xy < ee.length){
                System.out.println(ee[xy]);
            }else if(xy >= ee.length && xy < oo.length){
                System.out.println("\t" + oo[xy]);
            }else if(xy < ee.length && xy < oo.length){
                System.out.println(ee[xy] + "\t" + oo[xy]);
            }
        }
        
        
        */
        
        //multi dimensional
        int checker = 0;
        int[][] arr;
        System.out.print("Inputer number of columns: ");
        int col = in.nextInt();
        arr = new int[col][];
        
        while(checker < col){
            System.out.println("");
            System.out.print("Enter number of Rows for Column " + (checker+1) + ": ");
            int row = in.nextInt();
            arr[checker] = new int[row];
            System.out.println("");
            for(int xy = 0; xy<row ; xy++){
                System.out.print("Enter a number for Column " +(checker+1)+ " Row " + (xy+1) + ": ");
                arr[checker][xy] = in.nextInt();
            }
            checker++;
        }
        System.out.println("");
        System.out.println("Table: ");
        for(int xy = 0; xy<arr.length ; xy++){
            for(int xyz = 0; xyz<arr[xy].length ; xyz++){
                System.out.printf("%-8d \t",arr[xy][xyz]);
            }
            System.out.println("");
        }
        
        
    }
}
