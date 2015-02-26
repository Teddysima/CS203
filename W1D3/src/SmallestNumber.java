
public class SmallestNumber {

	public static void main(String[] args) {
		
		double [] nums = new double[10];
		
		for (int i = 0; i < nums.length; i++){
			double rand1 = (Math.random()*10);
			nums[i]=rand1;
			System.out.println(rand1);
		}
		double small = nums[0];
		for (int j = 0; j < nums.length; j++){
			if (nums[j]<small){
				small = nums[j];	
			}	
		}	
		System.out.println("The smallest number is; "+small);
	}

}
