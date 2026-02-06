package org.example.Lesson28;

public class Test5 {
    void abc() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
            System.out.println("Poyman ArrayInexOutOfBoundException ");
            try {
                System.out.println(s.length());
            } catch (NullPointerException ex) {
                System.out.println("Eto vnutrenniy catch block");
            }
        } catch (NullPointerException e) {
            System.out.println("Poyman NPE");
        }
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.abc();
    }
}
