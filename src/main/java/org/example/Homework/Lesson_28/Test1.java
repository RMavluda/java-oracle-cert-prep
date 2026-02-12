package org.example.Homework.Lesson_28;

import java.util.jar.JarOutputStream;

public class Test1 {

  public static void main(String[] args) {
    Tiger tiger = new Tiger();
    tiger.eat("myaso");
    try{
      tiger.drink("voda");
      try{
        tiger.drink("pivo");
      }catch(NeVodaException e){
        System.out.println(e.getMessage());
      }catch(Exception e){
        System.out.println(e.getMessage());
      }finally{
        System.out.println("Eto inner finally block");
      }
    }catch(RuntimeException e){
      System.out.println(e.getMessage());
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
  }
}

class Tiger{
  public void eat(String eda){
    if(!eda.equals("myaso")){
      throw new NeMyasoException("Tiger ne est " + eda);
    }
    System.out.println("Tiger est myaso");
  }

  public void drink(String jidkost) throws NeVodaException{
    if(!jidkost.equals("voda")){
      throw new NeVodaException("Tiger ne pyet " + jidkost);
    }
    System.out.println("Tiger pyet vodu");
  }
}

class NeMyasoException extends RuntimeException {


  NeMyasoException(String s) {
    super(s);
  }

}

class NeVodaException extends Exception {


  NeVodaException(String s) {
    super(s);
  }

}