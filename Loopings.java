package loopings;
import java.io.*;


public class Loopings {

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        try{  
            System.out.println("Input your number: ");
            int rand = Integer.parseInt(in.readLine());
              
            System.out.println("Guess the number: ");
            System.out.print("(Hint: ");
            if(rand % 2 == 0){
                System.out.println("It is an even number)");
            }else{
                System.out.println("It is an odd number)");
            }
            int inp = Integer.parseInt(in.readLine());

            do{
                if(inp > rand){
                    System.out.println("Lower Please!");
                    inp = Integer.parseInt(in.readLine());
                }else if(inp < rand){ 
                    System.out.println("Higher Please!");
                    inp = Integer.parseInt(in.readLine());
                }
            }while(inp != rand);

            System.out.println("Congratulations!");
            
        }catch(Exception e){
            System.out.println("Error please try again!");
            
        }
        
    }
    
}
