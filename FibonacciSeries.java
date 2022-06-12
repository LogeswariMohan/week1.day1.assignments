package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range, firstNum, secNum, sum;
		range = 8;
		firstNum = 0;
		secNum = 1;
		System.out.println("Fibonacci series for the given range are");
		System.out.print(firstNum+" " +secNum+" ");//0 1

		for(int i = 1; i<=range-2;i++)//range-2 = because already i have printed first two values
		{
			sum = firstNum+secNum;//0+1=1 |1+1=2 |1+2=3 |2+3=5 |3+5=8 |5+8=13
			firstNum = secNum;//1 |1 |2 |3 |5 |
			secNum = sum;//1 |2 |3 |5|8 |
			System.out.print(sum+" ");
		}
	}

}
