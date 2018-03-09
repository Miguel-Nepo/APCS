
public class Numbers {	
	
		public static void main(String[] args){
			System.out.println(1234%100);
			System.out.println(isGoofy(12));
			System.out.println(isGoofy(15));
			System.out.println(isGoofy(26));
			System.out.println(isGoofy(8));
			System.out.println(isGoofy(1234));
			//System.out.println(getSomeGoofyNumbers(3));
		}
		
		public static boolean isGoofy (int num){
			int sum = 0;
			int temp = 0;
			int[] digits = new int[10];
			if (num >=0){
				for (int i = 10;i<digits.length*10;i*=10){
					digits[temp]=num%i;
					num=num/i;
					temp++;
				}
						
				
				for (int i = 0;i<digits.length;i++)
				{
					if (num%digits[i]==0){
						sum+=digits[i];
					}
				}	
				//At this point, sum should be done adding up and iterating
				//Return true if sum is odd, otherwise return false
				System.out.println(sum);
				if (sum%2==1){

					return true;
				}
				return false;
			}
			return false;
		}
		
		public static int[] getSomeGoofyNumbers (int count){
			if (count > 0){
				int[] nums = new int[count];
				int j = 0;
				for (int i = 0;i<count;i++){	//While the array remains empty...				
					while (isGoofy(j)!=true){	//Iterate until statement is true;
						j++;					//Increment the j variable
					}
					nums[i] = j;				//and set the array to j
					}
				return nums;
			}
			return null;
		}
		
}
