package InterviewQuestions;

public class SortElementsInArray {

	public static void main(String[] args) {
		int arr[] = {10,20,50,30,90,40};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] =temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}

	}

}
