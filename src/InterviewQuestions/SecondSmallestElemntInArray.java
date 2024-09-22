package InterviewQuestions;

public class SecondSmallestElemntInArray {

	public static void main(String[] args) {
		int arr[] = {10,20,50,30,90,40};
		int smallest = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		int second_smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != smallest && arr[i]< second_smallest) {
				second_smallest = arr[i];
			}
		}
		
		System.out.println("second smallest number "+second_smallest);
	}

}
