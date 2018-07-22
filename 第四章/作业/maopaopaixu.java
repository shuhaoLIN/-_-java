/**
 * 冒泡排序算法
 */
class maopaopaixu
{
	public static void main(String[] args)
	{
		int[] arr = {12,5,-23,16,47};
		bubbleSort(arr);
	}
	public static void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
	}
}