import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a);
		System.out.print(b);
		int p=0;
		for(int i=1;i<=n-2;i++) {
			 p=a+b;
			System.out.print(p);
			a=b;
			b=p;
			
		}
	}

    }
