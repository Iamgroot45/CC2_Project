package uicalc;

import javax.swing.*;

public class BasicCom {
    static String check = "", ver;
    String out, sp[];
    double comp;
    
    public BasicCom(String in, JTextField tf){
        try{
            if(check.equals("computed")){
                check = "";
                tf.setText("");
            }
            
            if(in.equals("Enter")) in = "";
                
            out = tf.getText().concat(in);
            tf.setText(out);

            sp = out.split("[-+*/]");

            for(int i = 0 ; i < out.length() ; i++){
                switch (Character.toString(out.charAt(i))) {
                    case "+":
                        ver = "+";
                        break;
                    case "-":
                        ver = "-";
                        break;
                    case "*":
                        ver = "*";
                        break;
                    case "/":
                        ver = "/";
                        break;
                    default:
                        break;
                }
            }

            int y = 0;
            if(in.equals("")){
                comp = Double.parseDouble(sp[y]);
                for(String sp1 : sp){
                    switch(ver){
                        case "+":
                            if(y>0)comp+=Double.parseDouble(sp1);
                            check = "computed";
                            break;
                        case "-":
                            if(y>0)comp-=Double.parseDouble(sp1);
                            check = "computed";
                            break;
                        case "*":
                            if(y>0)comp*=Double.parseDouble(sp1);
                            check = "computed";
                            break;
                        case "/":
                            if(y>0)comp/=Double.parseDouble(sp1);
                            check = "computed";
                            break;
                        default:
                            tf.setText(tf.getText());
                            break;
                    }
                    y++;
                }
                //System.out.println(comp);
                tf.setText(Double.toString(comp));
            }
            else if(in.equals("Cl")){
                tf.setText("");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex + "\nPlease Try Again", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
