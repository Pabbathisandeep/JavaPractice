package basic;

public class PracticePrograms {

	public static void main(String[] args) {
		int[] array = {5,6,6,7,8,2};
		int size = array.length;
		  for (int i = 0; i <size ; i++){
	            int flag = 0;
	            int count = 0;

	            for (int j = i+1; j < size; j++){
	                if (array[i] == array[j]){
	                    flag = 1;
	                    break;
	                }
	            }
	            if (flag == 1)
	                continue;

	            for (int j = 0;j<=i;j++){
	                if (array[i] == array[j])
	                    count++;
	            }
	            System.out.println(array[i]+": "+count);
	        }
		}
	
	}


