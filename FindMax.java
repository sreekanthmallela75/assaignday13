package assaignmentsday13;

public class FindMax<T> {
    T input1, input2, input3;

    // contructor
    FindMax(T input1, T input2, T input3) {
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }

    public T testMaximum() {
        return FindMax.testMaximum(input1, input2, input3);
    }

    public static <T extends Comparable<T>> T testMaximum(T input12, T input22, T input32) {

        // assume input1 is max
        T maxValue = input12;
        if (input22.compareTo(maxValue) > 0) {
            maxValue = input22;
        }
        if (input32.compareTo(maxValue) > 0) {
            maxValue = input32;
        }

        showMaxValue(input12, input22, input32, maxValue);
        return maxValue;
    }

    public static <T> void showMaxValue(T input1, T input2, T input3, T maxValue) {

        System.out.println("\nNumber1 : " + input1 + "\nNumber2 : " + input2 + "\nNumber3 : " + input3);
        System.out.println("Maximum : " + maxValue);
    }

    public static void main(String[] args) {

        Integer intValue1 = 300, intValue2 = 500, intValue3 = 960;
        Float floatValue1 = 3.3f, floatValue2 = 3.5f, floatValue3 = 8.7f;
        String stringValue1 = "Mango", stringValue2 = "Orange", stringValue3 = "PineApple";

        new FindMax(intValue1, intValue2, intValue3).testMaximum();
        new FindMax(floatValue1, floatValue2, floatValue3).testMaximum();
        new FindMax(stringValue1, stringValue2, stringValue3).testMaximum();
    }
}
