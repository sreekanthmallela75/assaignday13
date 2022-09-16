package assaignmentsday13;

public class MaxNoByGenerics {
	 public static <T extends Comparable<T>> T getMax(T input1, T input2, T input3) {

	        // assume input1 is max
	        T maxNoOfGenerics = input1;
	        if (input2.compareTo(maxNoOfGenerics) > 0) {
	            maxNoOfGenerics = input2;
	        }
	        if (input3.compareTo(maxNoOfGenerics) > 0) {
	            maxNoOfGenerics = input3;
	        }

	        Object maxValue = null;
			showMaxNoOfGenerics(input1, input2, input3, maxValue);
	        return maxNoOfGenerics;
	    }

	    private static <T> void showMaxNoOfGenerics(T input1, T input2, T input3, T maxValue) {
		// TODO Auto-generated method stub
		
	}

		public static <T> void showMaxValue(T input1, T input2, T input3, T maxValue) {

	        System.out.println("\nNumber1 : " + input1 + "\nNumber2 : " + input2 + "\nNumber3 : " + input3);
	        String maxNoOfGenerics = null;
			System.out.println("Maximum : " + maxNoOfGenerics);
	    }

	    public static void main(String[] args) {

	        Integer intValue1 = 800, intValue2 = 100, intValue3 = 950;
	        Float floatValue1 = 6.3f, floatValue2 = 11.3f, floatValue3 = 14.7f;
	        String stringValue1 = "Mango", stringValue2 = "Orange", stringValue3 = "PineApple";

	        getMax(intValue1, intValue2, intValue3);
	        getMax(floatValue1, floatValue2, floatValue3);
	        getMax(stringValue1, stringValue2, stringValue3);
	    }
}
