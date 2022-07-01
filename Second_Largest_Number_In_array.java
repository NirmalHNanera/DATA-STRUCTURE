class Second_Largest_Number_In_array{
	public static void main(String[] args) {
		double[] arr={3,2,5,4,8};
		double max=arr[0];
		double max2=arr[1];
		for(int i=0;i<arr.length;i++){
			if(i==0){
				max=arr[0];
				
			}
			else if(max<arr[i]){
				max2=max;
				max=arr[i];
			}
			else if(max2<arr[i]){
				max2=arr[i];
			}
		}
		System.out.println("second largest element of array: "+max2);
	}
}