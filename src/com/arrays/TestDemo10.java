package com.arrays;

public class TestDemo10 {

	public static void main(String[] args) {
		String[][] names = new String[3][2];

		names[0][0] = "ID";
		names[0][1] = "Name";

		names[1][0] = "101";
		names[1][1] = "Neeraja";

		names[2][0] = "102";
		names[2][1] = "Neeru";

		 for(String[] arr1:names) {
		 for(String name:arr1) {
		  System.out.print(name + " ");
		  }
		  System.out.println();

		  }

		// for (int i = 0; i < names.length; i++) {
			// for (int j = 0; j < names.length; j++) {
				// System.out.print(names[i][j]);

			// }
			// System.out.println();

		// }

	}

}
