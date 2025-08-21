import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		int rev=0;
		while(n!=0) {
			int p=n%10;
			rev=rev*10+p;
			n=n/10;
		
		}
		System.out.println(x);
		if(x==rev) {
		System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
