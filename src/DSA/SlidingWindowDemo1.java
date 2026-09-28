package DSA;

public class SlidingWindowDemo1 {

	public static void main(String[] args) {

		int[] visitors = { 10, 12, 15, 20, 30, 50 };//10,12,15-->37
		                                            // 12,15,20--47
		                                            // 15,20,30--65
		                                            // 20,30,50--100

		int days = 3;

		int wondowSum = 0;

		for (int i = 0; i < days; i++) {
			wondowSum = wondowSum + visitors[i];

		}
		System.out.println("total number of visitors visited on a first window : " + wondowSum);

		for (int i = 1; i <= visitors.length - days; i++) {
			wondowSum=wondowSum-visitors[i-1]+visitors[i+days-1];
			
			System.out.println("total number of visitors visited on a next window : " + wondowSum);

		}

	}

}
