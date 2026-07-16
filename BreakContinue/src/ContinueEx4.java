
public class ContinueEx4 {
	public static void main(String[] args) {
		int a=1;
		do {
			System.out.println("Lavesh");
			a++;
			if(a==3){
				continue;
			}
			System.out.println("Rohera");
		}while(a<=5);
		System.out.println("Bye");
	}
}
