package com.task;

public class july31StringTask {

	public static void main(String[] args) {
		System.out.println("main method started");

		String str = "am2 I1 going3 home5 to4";
        String result = "";
        int n = 1;

        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                String s = arr[j];
                
                

                if (s.contains(n + "")) {

                    s = s.replace(n + "", "");

                    result = result + s + " ";

                    n++;
                }
            }
        }

        System.out.println("Result: " + result);

	}

}
