package InterviewQuestions;

public class ContOddEvenNumbersInArray {

	public static void main(String[] args) {
		int arr[] = {10,20,50,30,90,40,50,20,21};
		int count_even =0, count_odd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count_even += 1;
			}
			else {
				count_odd +=1;
			}
		}
		System.out.println("Even Elements count "+ count_even);
		System.out.println("Odd Elements count "+ count_odd);
	}
	
	

}
