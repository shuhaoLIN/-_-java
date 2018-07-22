/**
 * 选择排序算法
 */
public class paixuday5
{
	public static void main(String[] args)
	{
		int[] arr = {12,5,-23,16,47};
		selectSort(arr);
	}
	public static int[] selectSort(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j] > arr[i]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		return arr;
	}
}