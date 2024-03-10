import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        AppTest tester = new AppTest();
        tester.test1();
        tester.test2();
        tester.test3();
        tester.test4();
        tester.test5();
        tester.test6();

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

