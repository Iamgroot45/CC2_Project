package switching;

public class Switching {

    public static void main(String[] args) {
       for(int y = 0; y <= 100 ; y++){
           if(y % 2 !=0)continue;
           System.out.print(y + ", ");
       }
        System.out.println("");
       outerloop: 
       for(int y = 0; y <= 10 ; y++){
           System.out.print("\nOuter loop: " + y + " Inner Loop: ");
           for(int z = 0 ; z <= 10 ; z++){
               if(z==4) continue outerloop;
               System.out.print(z);
           }
       }
       
        System.out.println("");
        System.out.println("");
        
        int x = 0;
        while(x < 10){
            if(x==5) break;
            System.out.print(x + ", ");
            x++;
        }
        
        System.out.println("");
        outerloop: 
       for(int y = 0; y <= 10 ; y++){
           System.out.print("\nOuter loop: " + y + " Inner Loop: ");
           
           for(int z = 0 ; z <= 10 ; z++){
               if(z==2) break outerloop;
               System.out.print(z);
           }
       }
        
        System.out.println("");
        System.out.println("");
        
        int z = 10;
        do{
            System.out.print(z + ", ");
            z++;
        }while(z < 10);
    }
    
}
