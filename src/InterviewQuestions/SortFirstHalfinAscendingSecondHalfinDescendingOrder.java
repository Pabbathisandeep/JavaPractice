package InterviewQuestions;

public class SortFirstHalfinAscendingSecondHalfinDescendingOrder {

	public static void main(String[] args) {
		int arr[] = {10,20,50,30,90,40};
		int temp;
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0;j<arr.length/2;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[i];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			for(int j=arr.length/2;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		

	}

}
