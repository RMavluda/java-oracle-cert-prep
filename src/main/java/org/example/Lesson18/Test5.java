package org.example.Lesson18;

public class Test5 {

  public static void main(String[] args) {
    int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
    int array2[] = {1, 9, 3, -8, 0, 5, 4, 1};
    int array3[] = array2;
    System.out.println(array1 == array2);
    System.out.println(array2 == array3);
    System.out.println(array1.equals(array3));
    System.out.println(array2.equals(array3));
    // massivlarda equals method == bilan bir xil ishlaydi
    array1[1] = 0;
    array2[5 - 3] = 3;
//    array1[array1.length] = 10; => ArrayIndexOutOfBoundsException
    //chunki massivlar 0dan boshlab indexlanadi va m-n o`lchami 8 bolsa oxirgi element indexi 7 hisoblanadi
  }
}

/*
* Qanday massivlarni e`lon qilish noto`g`ri hisobalnadi ?
* a. int[][] array1 = new int[10][]; to`g`ri-> faqat, agar sout ga array1[1][1] yozilsa, NullPointerException bo`ladi. chunki ichki massiv o`lchami noaniq edi
* b. Car[][][] array2 = new Car[1][0][7] to`g`ri -> faqat, mantiqsiz. chunki [0] degani [7] ham mavjud emas deganidir
* c. String array3[] = new array3[9] xato -> array3 o`rniga String yozilganda to`g`ri bo`lar edi
* d. java.lang.String[] array4[] = new java.lang.String[5][]; to`g`ri -> faqat, sout ga array4[2][3] yozilsa, NullPointerException bo`ladi. chunki ichki massiv o`lchami noaniq edi
* e. int[][] array5 = new int[]; xato -> chap tomonda ikki o`lchamli massiv e`lon qilingan, ammo o`ng tomonda bir o`lchamli yozilgan
* f. int[][] array6 = new int[][]; xato -> skobkalar bir xil, ammo massiv o`lchami mavjud emas
* */

/*
* Qanday massivlarni e`lon qilish to`g`ri hisoblanadi?
* a. int array1[] = {3, 5, 6, 0}; // to`g`ri -> chunki, decloration & location 7 initialization
* b. int[] array2 = new int[1]; // to`g`ri -> chunki, declaration & location
* c. int[] array3 = new int[]{}; // to`g`ri -> chunki, decloration & location & initialization
* d. int[] array4 = new int[2]{}; // xato -> chunki, bir vaqtda massiv o`lchamini va elementlarini e`lon qilish mumkin emas
* e. int array5[] = new int[3]{0, 1, 2}; // xato -> chunki, bir vaqtda massiv o`lchamini va elementlarini e`lon qilish mumkin emas
* */