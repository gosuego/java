
public class IrregularArray2 {

	public static void main(String[] args) {
		int k =1;
		int n[][] = new int[4][];
		n[0]= new int[4];
		n[1]= new int[2];
		n[2]= new int[3];
		n[3]= new int[4];
		
		for (int i = 0; i < n.length; i++)
			for (int j = 0; j < n[i].length; j++)
				n[i][j] = k++;

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++)
				System.out.print(n[i][j] + " ");
		System.out.println();
		}
	}

}