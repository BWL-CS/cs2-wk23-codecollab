public class Main {

   public static void main(String []args) {
      // 2DArray EXAMPLE #1
		int[][] grid = new int[3][3];
		grid[0][0] = 7;
		grid[1][1] = 8;
		grid[2][2] = 9;
		grid[0][2] = 3;

		System.out.println("Printing a 2D Array: ");
		System.out.println(grid);

		System.out.println("Um. Let's try that again: ");
		for (int[] currentRow : grid) {
			for (int colValue : currentRow ) {
				System.out.print(colValue + " ");
			}
			System.out.println();
		}
		System.out.println();

		// 2DArray EXAMPLE #2
		double[][] initializedArray = { { 1.0, 2.0 }, { 3.0, 4.0 }, { 5.0, 6.0 } };
		double value = initializedArray[1][1];
		System.out.println("Accessed Value: " + value);
		System.out.println("Another Accessed Value: " + initializedArray[2][0]);
		System.out.println();

		// 2DArray EXAMPLE #3
		String[][] seatingChart = {
				{ "Jackson", "None", "None", "Maia"},
				{ "Finny", "None", "None", "Alex"},
				{ "Bryce", "Natalie", "Paige", "Zoie"}
		};

		System.out.println("APCS Unassigned Assigned Seats: \n");

		for (int row = 0; row < seatingChart.length; row++) {

			for (int col = 0; col < seatingChart[row].length; col++) {

				String currentItem = seatingChart[row][col];
				// what is this conditional block doing??
				if (currentItem.equals("None")) {
					seatingChart[row][col] = "🪑";
				}

				System.out.print(seatingChart[row][col]);
				System.out.print("\t"); // tab formatting
			}
			System.out.println();
		}
   }
}
