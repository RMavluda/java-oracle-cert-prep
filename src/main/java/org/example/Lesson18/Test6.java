package org.example.Lesson18;

public class Test6 {

  public static void maxMin(double [] array){
    double max = array[0];
    double min = array[0];
    for(int i = 0; i < array.length; i++){
      if(array[i] > max){
        max = array[i];
      }
      if(array[i] < min){
        min = array[i];
      }
    }
    System.out.println("Max element massiva: " + max);
    System.out.println("Min element massiva: " + min);
  }

  public static void main(String[] args) {
    double array1[] = {1.05, -3.14, 8.0, 9.19, -3, 0};
    maxMin(new double[] {2.5, -1.3});
    maxMin(array1);
  }
}
