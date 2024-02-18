public class DynamicArray{

	static int n;
	static int idx=0;
	// int[] arr;

	static int [] arr = new int[10];

	public void add(int x) {

		if(idx >= arr.length){
			n=arr.length;
			int[] tempArr = new int[n];
			int i=0;
			for(int ele:arr){
				tempArr[i++] = ele;
			}
			arr = new int[n+n/2];
			idx = 0;
			for(int ele : tempArr){
				arr[idx++]=ele;
			}
			arr[idx++]=x;
		}else{
			arr[idx++] = x;
		}
	}
	
	public static void main(String [] args){
		System.out.println("************* Start of main ****************\n");

		DynamicArray da = new DynamicArray();
		da.add(4);
		da.add(378);
		da.add(4354);
		da.add(44534);
		da.add(445342);
		da.add(42);
		da.add(1);
		da.add(10);
		da.add(23);
		da.add(45);
		da.add(98);
		da.add(98720);

		for(int ele:da.arr){
			System.out.print(ele + " ");
		}

		System.out.println("\n\n********* End of main ************");
	}
	

}