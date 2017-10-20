public class Programm{

	public static void QuickSort(int[] feld) {
		
		for(int i=0; i<feld.length-1; ++i) {			//bubble sort
			for(int j = i+1; j<feld.length; ++j) {
				if(feld[i]>feld[j]) {
					int temp = feld[i];		//swap
					feld[i] = feld[j];
					feld[j] = temp;
				}
			}
		}	
	}

	
	public static int IndexVonMitte(int[] feld, int i, int j) {
		return (i+j+1)/2;
	}
	

}
