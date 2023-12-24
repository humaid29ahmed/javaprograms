
public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Int Multi Dimensional Array
		int[][] number = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, };

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				System.out.print(number[i][j] + "\t");

			}
			System.out.println();
		}
		System.out.println(number.length);// It prints number of row
		System.out.println(number[2].length);// It prints number of element or Column in each row

		// String Multi Dimensional Array

		String[][] txt = new String[3][3];
		txt[0][0] = "Hello";
		txt[0][1] = "Hello";
		txt[0][2] = "Hello";
		txt[1][0] = "Hello";
		txt[1][1] = "Hello";
		txt[1][2] = "Hello";
		txt[2][0] = "Hello";
		txt[2][1] = "Hello";
		txt[2][2] = "Hello";

		for (int i = 0; i < txt.length; i++) {
			for (int j = 0; j < txt[i].length; j++) {
				System.out.print(txt[i][j] + " ");
			}
			System.out.println();
		}

		// In this multi dimensional array we can skip the column part and explicitly
		// give size to different rows
		String[][] name = new String[2][];
		name[0] = new String[3];
		name[0][0] = "Humaid";
		name[0][1] = "Ahmed";
		name[0][2] = "Humnabad";
		System.out.println(name[0][0] + " " + name[0][1] + " " + name[0][2]);

	}

}
