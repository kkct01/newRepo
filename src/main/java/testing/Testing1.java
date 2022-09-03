package testing;

public class Testing1 {
	
	int[] arr = {1,2,3};
	int x = 0;
	int y = 0;

	public void test() {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 4) {
				y += 1;
			}
		}
		

//		if (x == 0) {
//			y += 1;
//			System.out.println(y);
//		}

		System.out.println(y);
	}
	
	
}
