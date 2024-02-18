public class DynamicArray{

	static int n;
	static int idx=0;
	static int [] arr = new int[10]; //Created and initilize the array for size 10;

	// Method to add an element at the end of the table.
	public void add(int x) {

		// Before adding element to array check for array size
		// if array size is within its size then add the element at the end.
		// else increase the size of array then add older elements to new array
		// then add new element at the end of the array.
		if(idx >= arr.length){ 
			n=arr.length;
			// Create new temp array to hold old elements.
			int[] tempArr = new int[n];
			// Add all elements of array to temp array.
			int i=0;
			for(int ele:arr){
				tempArr[i++] = ele;
			}
			// Increase the array size my n/2
			arr = new int[n+n/2];
			// Add old elements to the increased array.
			idx = 0;
			for(int ele : tempArr){
				arr[idx++]=ele;
			}
			// Add given element to the end of array.
			arr[idx++]=x;
		}else{
			arr[idx++] = x; // add element when size of array is in withing n.
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