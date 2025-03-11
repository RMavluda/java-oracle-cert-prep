package org.example.Lesson04;

public class BankAccount {

  int id = 10;
  String name = "Petr";
  double balance = 100;
}

//javada har qanday class --> type hisoblanadi

class BankAccountTest {

  public static void main(String[] args) {
    //reference data type
    BankAccount myAccount = new BankAccount();
    BankAccount yourAccount = new BankAccount();
    BankAccount hisAccount = new BankAccount();

    myAccount.id = 1;
    myAccount.name = "Mavluda";
    myAccount.balance = 12.35;

    yourAccount.id = 2;
    yourAccount.name = "Malis";
    yourAccount.balance = 102.09;

    hisAccount.id = 3;
    hisAccount.name = "Ivan";
    hisAccount.balance = 44.77;

    System.out.println(hisAccount.name);
  }
}