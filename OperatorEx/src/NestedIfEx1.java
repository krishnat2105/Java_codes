//WAP to Check wether the no is +ve ,  -ve or zero , Also if the no is +ve also print wether its even or odd 
public class NestedIfEx1 {
    public static void main(String[] args) {
    	java.util.Scanner sc=new java.util.Scanner(System.in);
    		System.out.println("Enter the number : ");
		int no = sc.nextInt();
		if(no>0) {
			System.out.println("The number is Positive ");
			if(no%2==0) {
				System.out.println("The number is Even ");
			}
			else {
				System.out.println("The number is Odd ");
			}
		}
		else if(no==0){
			System.out.println("The number is Zero ");
		}
		else {
			System.out.println("The number is Negative ");
		}
		System.out.println("Thank you ");
		
    	
	}
		

	
}
