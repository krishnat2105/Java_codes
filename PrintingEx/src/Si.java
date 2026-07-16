//Write a program to calculate simple intrest and all the value will be given by the user
public class Si {
   public static void main(String [] args) {
	   java.util.Scanner sc = new java.util.Scanner(System.in);
	   System.out.println("Enter the value of P , R and T");
	   float P = sc.nextFloat();
	   float R = sc.nextFloat();
	   float T = sc.nextFloat();
	   float SI = (P*R*T)/100;
	   System.out.println("simple intrest : "+SI );
	   
	   
	   
   }
}
