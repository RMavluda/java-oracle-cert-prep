package org.example.Lesson28;

public class Test8 {

  void marafon(int temperaturaVozduxa, int tempBega) throws PodvernutNoguException{
    if(tempBega > 12) {
      throw new PodvernutNoguException("Temp bega bil slishkom visokim " + tempBega);
    }
    if(temperaturaVozduxa > 32) {
      throw new SveloMishsuException();
    }
    System.out.println("Vi probejali marafon");
  }

  public static void main(String[] args) {
    Test8 t = new Test8();
    try{
      t.marafon(10, 20);
    }catch(PodvernutNoguException e){
      System.out.println(e.getMessage());
    } finally{
      System.out.println("V lyubov sluchi v poluchite gramotu");
    }
  }
}

class PodvernutNoguException extends Exception {

  PodvernutNoguException(String message) {
    super(message);
  }
}

class SveloMishsuException extends RuntimeException {

  SveloMishsuException(String message) {
    super(message);
  }

  SveloMishsuException() {
  }
}