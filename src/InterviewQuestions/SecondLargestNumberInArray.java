package InterviewQuestions;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int arr[] = {10,20,50,30,90,40};
		int temp;
		int size= arr.length;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		}
		System.out.println("Second Largest Number "+ arr[size-3]);
	}

}
