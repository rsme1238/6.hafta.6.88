
package pkg6.hafta.pkg6.pkg88;

import java.util.Scanner;

public class Hafta688 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("please enter a number");
        int a  =input.nextInt();
        
         int b =2;
         
          System.out.println("Prime Factors of "+ a +" is: ");
        while(a > 1 ){
           
           if(a % b == 0){
               
               System.out.print(b + "  ");
               
               a = a / b ;
           
           }
           
           else{   
                 
               b++;
            }
           
        }   
       
       
       
     
    }
    
}
