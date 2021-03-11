package Day4;

public class ArraysPBR {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		
		//you should be very careful when passing a array because the original will get changed...
		int copy[]=new int[5];
		System.arraycopy(arr, 0, copy, 0, arr.length);//to create a copy of the original array
		getArray(copy);
		
		System.out.println();
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		
		System.out.println("\nprint the copy....\n");
		
		for(int i:copy) {
			System.out.print(i+"\t");
		}
	}
	
	public static void getArray(int a[]) {// arrays are always pass by reference....
		a[0]=100;
		a[4]=500;
	}
}
