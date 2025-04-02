package org.example.Lesson07;

public class Employee {

  public double salary;

  public void dvoynayaZP() {
    double result = salary * 2;
    /*
    'double result = salary * 2':
    -> bu o`zgaruvchilar instance hisoblanmidi, ular class ga emas metodga tegishli bo`ladi.
    -> 'public double result = salary * 2;' ko`rinishida yozish xato hisoblanadi
    -> local hisoblanadi. ular metod ichida yaratiladi, metod ichida foydalaniladi, metod ichda tugatiladi.
    metod dan tashqarida result o`zgaruvchisiga dostup yopiq.
    Shu sababli ularda access modifier mavjud emas
    */
    System.out.println("Novaya Z/p: " + result);
  }

  public Employee(double salary2) {
    salary = salary2;
  }

}

class EmployeeTest {

  public static void main(String[] args) {
    Employee emp = new Employee(500);
    System.out.println(emp.salary);
    emp.dvoynayaZP();
  }
}

/*
private

 private double salary;

  private void dvoynayaZP() {
    System.out.println("Novaya Z/p: " + salary * 2);
  }

  private Employee(double salary2) {
    salary = salary2;
  }

private ga o`zgartirishimiz bilan hattoki shu fayl ichidagi EmployeeTest class uchun ham dostup yopiladi. Ya`ni private har qanday class uchun dostup yo`qligini anglatadi
*/

//////////////////////

/*
default
Bu modifier faqatgina shu package ichida dostup borligini anglatadi
*/

/////////////////////

/*
protected
Masalan package1.classA da protected elementlar bor:
protected = default, ya`ni protected modifier default ga o`xshash + classA ning nasledovatel lari uchun ham dostup bor
nasledovatel package1 ichida(masalan classF) joylashgan bo`lsa ham, yoki boshqa hohlagan package(masalan package2.classD) da joylashgan bo`lsa ham, dostup doim bor degani
boshqa package dagi boshqa class larga dostup yopiq bo`ladi, faqatgina classA ning nasledovateli bo`lsagina ochiq hisoblanadi
*/