//Generating-password-and--OTP
import java.util.*;
public class NewClass{
  
  public static void main(String[] args)
  {
    //Length of the password as i choose here 6
    int length=6;
    System.out.print(gen_password(length));
  
  }
  //This is my password generating method
  //I have used static method here, so that i have not to make any object for it
  
  static char[] gen_password(int len)
  {
    System.out.println("Generating password using random():");
    System.out.println("Our new password will be :");
    
    
    //A strong password has Capital latters , lower latters
    //Numeric digits and symbols, So we are using all of
    //them to generate our password
    String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
    String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
    String numbers = "0123456789"; 
    String symbols = "!@#$%^&*_=+-/.?<>)"; 
  
  
    // String for storing all the values of symbols  
    String values = Capital_chars + Small_chars + 
                        numbers + symbols; 
      
    //defining a random keyword                  
    Random rm=new Random();
    char[] pass=new char[len];
    
    //iterating till the length of password and generating random values 
    for(int i=0; i<len; i++)
    {
         
        pass[i]=values.charAt(rm.nextInt(values.length()));
         
        }
    return pass;                     
    }
}
