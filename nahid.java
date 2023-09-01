package lab1;

import java.util.Scanner;

public class nahid{
public static void main(String[] args) {

	 String grade = null;
     System.out.print("Enter your mark: ");  
     Scanner sc = new Scanner(System.in); 
     int mark = sc.nextInt(); 

     switch(mark/10) 
     {
       
       case 10:
       case 9:
          grade = "A";
          break;
       
       case 8:
          grade = "B";
          break;
       
       case 7:
          grade = "C";
          break;
       
       case 6:
          grade = "D";
          break;
       
       case 5:
          grade = "E";
          break;
       
       default:
          grade = "F";
          break;
     }
     
     
     System.out.println("Your Grade is  = " + grade);
  }

}

