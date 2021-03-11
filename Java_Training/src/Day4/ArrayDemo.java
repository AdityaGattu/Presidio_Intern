package Day4;

public class ArrayDemo {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		System.out.println(a[1]);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[0]);
		
		int arr2[]=new int[5];
		//by default arrays are initialized, even though they are declared local
		for(int i:arr2) {
			System.out.println(i);
		}
		//once declared the array size cannot be changed...
		
		int twodarr[][]= {
				{1,2,3,4},
				{2,3,4,5},
				{4,5,6,7}
		};
		int twodarr2[][]=new int[3][4];//three rows four columns
		for(int i=0;i<twodarr2.length;i++) {//this will give you length of rows...
			for(int j=0;j<twodarr2[i].length;j++) {//this will give length of columns in that row
				System.out.println(twodarr2[i][j]);
			}
		}
		
		for(int i[]:twodarr) {
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
