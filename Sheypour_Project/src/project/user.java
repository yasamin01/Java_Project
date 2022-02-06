package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class user {
    private String username;
    private int password;

public static void verify(String username, String password) {
  boolean found = false;
  String tempUsername ;
  String tempPassword ;
  
  try
  {
   Scanner x = new Scanner(new File("user.txt"));
   x.useDelimiter("[,\n]");
   
   while(x.hasNext() && !found)
   {
    tempUsername = x.next();
    tempPassword = x.next();
    
    if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim()))
    {
     found = true;
    }
    
   }
   x.close();
   System.out.println(found);
  }
  catch(FileNotFoundException e)
  {
   System.out.println("Error");
  }
}
}
