import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    char ch=sc.next().charAt(0);
    int result=solution(a,b,ch);
    System.out.println(result);
    System.out.println(switchcalculator(a,b,ch));
	}
    
    public static int solution(int a,int b,char ch) {
    if(ch=='+') {
    	return a+b;
   
    }
    if(ch=='/') {
    	return a/b;
   
    }
    if(ch=='-') {
    	return a-b;
    }
    if(ch=='*') {
    	return a*b;
   }
    System.out.println("Invalid operator");
    return 0;

	}
    
    public static int switchcalculator(int a,int b,char ch) {
      switch(ch) {
      case '+':
    	  return a+b;
    	///  break;
      case '-':
    	  return a-b;
    	 // break;
      case '*':
    	  return a*b;
    	 // break;
      case '/':
    	  return a/b;
    	//  break;
      default:
    	  return 00000000;
      }
    	
    }
     
   
	}




