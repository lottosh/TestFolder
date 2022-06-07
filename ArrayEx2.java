class Car {
	
}

class ArrayEx2 {
	public static void main(String[] args) {
		int[] nums = new int[100]; // 1~100 까지를 넣어주고 싶다
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (i+1);
		}
		for(int i=0; i<100; i++) {
			System.out.println(nums[i]);
		}
		
		Car[] c = new Car[100];
		for(int i=0; i<50; i++) {
			c[i] = new Car();
		}
	}
}