package fibfac;

import java.io.*;

public class FibFac {

    public static void main(String[] args) throws IOException {
        choosing();
    }
    
    public static void choosing() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            System.out.print("[1] Fibonacci \n"
                + "[2] Factorial \n"
                + "[3] Exit \n"
                + "Enter your choice: ");
            int choice = Integer.parseInt(br.readLine());
            System.out.println("");
            
            switch(choice){
                case 1:
                    display(br, choice);
                    System.out.println("");
                    break;
                case 2:
                    display(br, choice);
                    System.out.println("");
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
    
    public static void display(BufferedReader br, int ch) throws IOException {
        System.out.print("Enter the number of elements: ");
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        int i;
        
        for(i = 0 ; i < arr.length ; i++){
            System.out.print("Enter a number for index " + (i+1) + ": ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        for(i = 0; i < arr.length ; i++){
            System.out.printf("f(%d) \t", (i));
        }
        System.out.println("");
        
        switch(ch){
            case 1:
                for(i = 0; i < arr.length ; i++){
                    System.out.printf("%d \t", f(arr[i]));
                }
                System.out.println("");
            break;
            
            case 2:
                for(i = 0; i < arr.length ; i++){
                    System.out.printf("%d \t", fa(arr[i]));
                }
                System.out.println("");
            break;
        }
    }

    public static int f(int num) {
        if (num <= 1) {
            return num;
        } else {
            return f(num - 1) + f(num - 2);
        }
    }

    static int fa(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num * fa(num - 1));
        }
    }
}