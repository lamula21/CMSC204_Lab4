
public class ArraySum {

	public int sumOfArray (Integer[] a,int index) {
		
		// Base Case - When to stop
		if (index == 0) {
			return a[0];
		}
		else {
			return a[index] + sumOfArray(a, index-1);
		}		
	}
}
