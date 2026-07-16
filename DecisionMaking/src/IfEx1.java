
public class IfEx1 {
     public static void main (String [] args) {
    	 java.util.Scanner sc = new java.util.Scanner(System.in);
    	 System.out.println("Enter yoyr age : ");
    	 int age = sc.nextInt();
    	 if(age>0 && age <4) {
    		 System.out.println("You're Infant : ");
    	 }
    	 else if(age >= 4 && age < 13)
    	 {
    		 System.out.println("You're Child   : ");
    	 }
    	 else if(age>=13 && age <19)
    	 {
    		 System.out.println("You're Teenager  : ");
    	 }
    	 else if(age >= 19 && age <50)
    	 {
    		 System.out.println("You're adult  : ");
    	 }
    	 else if (age >=50 && age <80)
    	 {
    		 System.out.println("You're Oldage : ");
    	 }
    	 else {
    		 System.out.println("You're Kabhi bhi jaane wale   : ");
    	 }
    	 System.out.println("Thank You : ");
    	 
     }
}
