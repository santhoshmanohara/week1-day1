package week1day4;

public class amstrongnumber {

	public static void main(String[] args) {
		 int a=153;
		 int b=a;
		 int sum=0;
		 while(a>0) {
			 int rem=a%10;
			 sum=sum+(rem*rem*rem);
			 a=a/10;
		 }
	if(b==sum) {
		System.out.println("it is a amstrong number");
	}
	else {
		System.out.println("it is not an amstrongnumber");
	}
	}
}
