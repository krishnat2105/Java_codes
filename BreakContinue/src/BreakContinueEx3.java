
public class BreakContinueEx3 {
	public static void main(String[] args) {
		int a=1;
		do {
			System.out.println("Lavesh");
			if(a++>3){
				break;
			}
			System.out.println("Lavesh");
		}while(a<=5);
		System.out.println("Bye");
	}
}
