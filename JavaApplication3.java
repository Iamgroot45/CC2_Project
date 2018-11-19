package javaapplication3;
import java.util.*;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("What program/course are your enrolled in?: ");
        String pc = in.next();
        
        if(pc.equalsIgnoreCase("BSIT") || pc.equalsIgnoreCase("IT")){
            System.out.print("What major?: ");
            String m = in.next();
            if(m.equalsIgnoreCase("Netsec")){
                System.out.println("Net Sec");
            }else if(m.equalsIgnoreCase("WebDev")){
                System.out.println("Web Dev");
            }
            else if(m.equalsIgnoreCase("Erp")){
                System.out.println("Erp");
            }else{
                System.out.println("Wrong input");
            }
        }else if(pc.equalsIgnoreCase("BSCS") || pc.equalsIgnoreCase("CS")){
            System.out.print("What major?: ");
            String m = in.next();
            if(m.equalsIgnoreCase("MobDev")){
                System.out.println("Mob Dev");
            }else if(m.equalsIgnoreCase("DigitalArts")){
                System.out.println("Digital arts and animation");
            }else{
                System.out.println("Wrong input");
            }
        }else if(pc.equalsIgnoreCase("bsda")){
            System.out.println("BSDA");
        }else{
            System.out.println("Wrong input");
        }
    }
    
}
