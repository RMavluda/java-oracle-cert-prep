package org.example.Lesson18;

import java.util.Arrays;

public class Test4 {

  public static void main(String[] args) {
    int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
    for (int i = 0; i < array1.length; i++) {
      System.out.print(array1[i] + " ");
    }
    System.out.println();
    //sort(array)
    Arrays.sort(array1);
    for (int i = 0; i < array1.length; i++) {
      System.out.print(array1[i] + " ");
    }
    System.out.println();
    //binarySearch(array, value)
    int index1 = Arrays.binarySearch(array1, 2);
    /*
    massivda yo`q element qidirilganda,
    agar massivda shu element bo`lganida qaysi indexda turgan bo`lar edi shu index ni manfiy qiymatga o`tkazadi
    va -1 qiymatni chiqarqadi
    */
    System.out.println(index1);
    /*
    * binarSearch faqat sortlangan massivlae uchun ishlaydi
    * */
    System.out.println(array1);
    // bu yerda array1 obyekt bo`lganligi uchun uni tog`ridan-to`g`ri soutda chiqarishga urunganda massiv adresini chiqaradi

  }

}
