package com.syntax.class10;

public class TwoDArray2Search2 {

	public static void main(String[] args) {
	int[][] nums= {{1,2,3,4,5},{199,300,588,700},{1900,4579,5353,6456}, {123,234,345,456}};
	
	for (int i=0;i<nums.length;i++) {
		for (int j=0;j<nums[i].length;j++) {
			System.out.print(nums[i][j]+" ");
		}System.out.println(" ");
	}
	
	/*i loop iterates over rows
	 * nums.length gives # of arrays inside 2D array=3
	 * loop iterates over columns
	 */
	System.out.println(" ");
	System.out.println("All values using enhanced for loop");
	
	for(int[] num:nums) {
		for(int n:num) {
			System.out.print(n+" ");
		}System.out.println(" ");
	}
	
	}
}
