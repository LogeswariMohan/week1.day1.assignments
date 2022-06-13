package week1.day1.assignments;

public class Factorial {

	public static void main(String[] args) {
		
		int n=5,fact =1;

		for(int i=1;i<=n;i++)//1<5 |2<5 |3<5 |4<5 |5<=5
		{
			fact = fact*i;//1*1=1 |1*2=2 |2*3=6 |6*4=24 |24*5=120
		}
		System.out.println("Factorial of "+n+" "+"is "+fact);
		
	}

}
