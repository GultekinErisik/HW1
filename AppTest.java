import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest extends App {

    @Test
    void test1() {// boş arraylist ve 0 degerlerının test eder
        assertEquals(0, App.customMethod(new ArrayList<>(), new ArrayList<>(), 0, 0));
    }

    @Test
    void test2() {// boş olmayan arraylistleri ve 0 olmayan değerler için test eder
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        assertEquals(21, App.customMethod(list1, list2, 5, 6));
    }

    @Test
    void test3() {//boş arraylistleri ve 0 dan farklı olan değerleri test eder
        assertEquals(11, App.customMethod(new ArrayList<>(), new ArrayList<>(), 5, 6));
    }

    @Test
    void test4() { //Arraylistelerin boş olmadığı ve değerlerin 0 olduğu durumu test eder
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        assertEquals(10, App.customMethod(list1, list2, 0, 0));
    }

    @Test
    void test5() {//Arraylistlerın null ve değerlerin 0 oduğu durumu test eder
        try {
            assertEquals(0, App.customMethod(null, null, 0, 0));
        }
        catch (NullPointerException e){
            System.out.println("This test method giving an error message because ArrayLists are null so it is true");
        }
    }

    @Test
    void test6() {//butun değerleri negatif olduğu durumu test eder
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(-1);
        list1.add(-2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(-3);
        list2.add(-4);

        assertEquals(-20, App.customMethod(list1, list2, -5, -5));
    }
}
