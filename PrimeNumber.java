package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int x = 13;
		boolean flag = false;
		
		for(int i=2;i<x/2;i++) 
		{
			if(x%i==0)
			{
				flag = true;
				break;
		
		}
	}
		System.out.println(x);
}
}
