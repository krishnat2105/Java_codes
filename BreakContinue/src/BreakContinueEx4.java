
public class BreakContinueEx4 {
	public static void main(String[] args) {
		System.out.println("Hello");
		for(int a=1;a<=8;a++) {
			System.out.println("Lavesh");
			if(a++==3){
				break;
			}else {
				a++;
			}
			System.out.println("Rohera");
		}
		System.out.println("Bye");
	}
}
