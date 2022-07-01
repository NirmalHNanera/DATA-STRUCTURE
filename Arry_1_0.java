public class Arry_1_0 {
	public static void main(String[] args) {
		int[] a={5,5,5,5,6,6,6,8,8};
		int count=0;
		int flag=0;
		int i=0;
		for(i=0;i<a.length-1;i++){
		if(i+1<a.length-1){
			if(a[i+1]-a[i]==0){
				count++;
				}
		   else if(count>=3 && a[i+1]>a[i]){
		   	count++;
		   	continue;
		   }
		   else{
		   	flag=1;
		   }
		}
		}
		if (count == a.length-1)
		{
			System.out.println("0");
		}
		else
		{
			System.out.println("1");
		}
	}
}