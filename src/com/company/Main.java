package com.company;

public class Main {

    public static void main(String[] args) {
      Boss c1 = new Boss();
      c1.attack = 50;
      c1.health = 500;


      Warrior c2 = new Warrior();
      c2.attack= 25;
      c2.health = 250;
      c2.attackType = "Phisical";
      c2.printible();

      Magical c3 = new Magical();
      c3.attack = 25;
      c3.health = 250;
      c3.attackType = "Magical";
      c3.printible();


      Mental c4 = new Mental();
      c4.attack = 25;
      c4.health = 250;
      c4.attackType = "Mental";
     c4.printible();



    }
}
