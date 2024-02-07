
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Student
 */
public class first {

	/**
 	* @param args the command line arguments
 	*/
	public static void main(String[] args) {
        
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter a two three digits number: ");
    	int num1,num2,d1,d2,d3,d4,d5,d6;
   	 
    	num1 = s.nextInt();
    	num2 = s.nextInt();
   	 
    	d1 = num1%10; num1=num1/10;
    	d2 = num1%10; num1=num1/10;
    	d3 = num1%10;
    	d4 = num2%10; num2=num2/10;
    	d5 = num2%10; num2=num2/10;
    	d6 = num2%10;
   	 
    	if(d1==d4 && d2 == d5 && d3==d6){
        	System.out.println("The award tk is: 12000");
    	}
    	else if((d1==d4 || d1 == d5 ||d1==d6)&&(d2==d4 || d2 == d5 ||d2 == d6)&&(d3==d4 || d3 == d5 ||d3==d6)){
        	System.out.println("The award tk is: 5000");
    	}
    	else if((d1==d4 || d1 == d5 || d1==d6 || d2==d4 || d2 == d5 ||d2 == d6 || d3==d4 || d3 == d5 || d2==d6)){
            System.out.println("The award tk is: 2000");
        }
        else{
        	System.out.println("Alas! The award tk is: 0");
    	}
   	 
	}
    
}

