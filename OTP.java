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
    System.out.println("Generating OTP using random():");
    System.out.println("Our new OTP will be :");
    
    //Numbers are used for OTP
    String num= "0123456789"; 
     
      
    //defining a random keyword                  
    Random rm=new Random();
    char[] pass=new char[len];
    
    //iterating till the length of password and generating random values 
    for(int i=0; i<len; i++)
    {
         
        pass[i]=num.charAt(rm.nextInt(num.length()));
         
        }
    return pass;                     
    }
}