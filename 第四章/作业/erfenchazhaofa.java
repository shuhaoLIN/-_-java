class erfenchazhaofa
{
	public static void main(String[] args)
	{
		int[] arr = {12,14,15,16,19,25,50};
		int index = binarySearch(arr,53);
		System.out.println(index);
	}
	public static int binarySearch(int[] arr,int target)
	{
		int min = 0;
		int max = arr.length-1;
		int mid;
		while (min < max ){
			mid = (min+max)/2;
			if(target == arr[mid])
				return mid;
			if(target < arr[mid]){
				max = mid -1 ;
				continue;
			}
			else {
				min = mid+1;
				continue;
			}
		}
		if(arr[min] != target)
			return -1;
		else{
			return min;
		}
		// while (true){
		// 	mid = (min+max)/2;
		// 	if(target == arr[mid])
		// 		return mid;
		// 	if(target < arr[mid]){
		// 		max = mid -1 ;
		// 	}
		// 	else {
		// 		min = mid+1;
		// 	}

		// 	//没有找到
		// 	if(max < min){
		// 		return -1;
		// 	}
		// }
	}
}