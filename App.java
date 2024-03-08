import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        // Example usage of the method
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        int intValue1 = 5;
        int intValue2 = 6;

        // Calling the method
        int result = customMethod(list1, list2, intValue1, intValue2);

        // Displaying the result
        System.out.println("Result: " + result);
    }

    public static int customMethod(ArrayList<Integer> list1, ArrayList<Integer> list2, int intValue1, int intValue2) {
        // Simple implementation, you can replace it with your logic
        int sum1 = sumList(list1);
        int sum2 = sumList(list2);

        return sum1 + sum2 + intValue1 + intValue2;
    }

    private static int sumList(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
