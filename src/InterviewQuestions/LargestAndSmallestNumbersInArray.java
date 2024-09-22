package InterviewQuestions;

public class LargestAndSmallestNumbersInArray {

	public static void main(String[] args) {
		int arr[] = {10,20,50,30,90,40};
		int max = arr[0], min = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			else if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Maximum Number "+max);
		System.out.println("Minimum Number "+min);

	}

}
