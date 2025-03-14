package org.example.Homework.lesson_05;

public class BankAccount {

  int id;
  double balance;

  void popolneniyeScheta(double summaPopolneniya){
    balance += summaPopolneniya;
    System.out.println("Popolneniye: " + balance);
  }

  void snyatiyeSoScheta(double summaSnyatiya){
    balance -= summaSnyatiya;
    System.out.println("Snyatiye: " + balance);
  }

}

class BankAccountTest {
  public static void main(String[] args){
    BankAccount myAccount = new BankAccount();

    myAccount.popolneniyeScheta(30.5);
    myAccount.snyatiyeSoScheta(20.5);
  }
}