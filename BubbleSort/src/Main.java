
public class Main {

	public static void main(String[] args) {
		
		
		int[] array = {25, 37, 12, 87, 98, 34, 54, 65, 14, 102, 58, 42};
		
		bubbleSort(array);
			
		for(int i = 0; i < array.length; i++) { 
			
			System.out.print(array[i] + " ");
			
		}
		
	}

	private static void bubbleSort(int[] array) {
		
		for(int i = 0; i < array.length - 1; i++) {
			
			for(int j = 0; j < array.length - i - 1; j++) {
				
				if(array[j] > array[j + 1]) {
					
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					
				}
				
			}
			
		}
		
		
	}

}
