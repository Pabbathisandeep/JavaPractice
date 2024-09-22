package basic;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		int[] arr = {2,5,3,5,2,6,7,6};
		int count= 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					System.out.print(arr[i]+" ");
					
				}
			}
			
		}
		System.out.println();
		System.out.println(count);
		

	}

}
