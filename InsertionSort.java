package exercise_02;

public class InsertionSort {

	public int[] sort(int array[]) { 
		//System.out.println("before Sort :- ");
		print(array);
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
        //System.out.println("atfer Sort");
		//print(array);
		return array;
    } 
	public void print(int array[]) {
		//System.out.println("After Insertion Sort");    
        for(int i:array){    
            System.out.print(i+"|");
	}
	}
	

}
