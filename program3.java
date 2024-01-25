import java.util.*;
class EquilibriumDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		PivotDemo obj=new PivotDemo();
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int index=obj.fun(arr);
		System.out.println("Output= "+index);
	}
	int fun(int arr[]){
		int sum=0;
		int i=0;
		while(i<arr.length){
			sum+=arr[i];
			i++;
		}
		int leftsum=0;
		for(int j=0;j<arr.length;j++){
			if(leftsum==sum-leftsum-arr[j]){
				return j;
			}else{
				leftsum +=arr[j];
			}
		}
		return -1;
	}
}
