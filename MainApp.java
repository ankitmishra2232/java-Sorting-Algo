package exercise_02;

public class MainApp {
	
	public static void main(String[] args) {
		System.out.println("Bubb Sort");
		
		int data[] = {2,15,46,4,64,54,51};
		
		BubbleSort bSort = new BubbleSort();
		bSort.sort(data);
		System.out.println("\nInsertion Sort");
		InsertionSort iSort = new InsertionSort();
		iSort.sort(data);
		System.out.println("\nSelection Sort");
		SelectionSort sSort=new SelectionSort();
		sSort.sort(data);
	}

}
