package guru;

import java.sql.SQLOutput;

public class Main {

  public static void main(String[] args){
    byte aByte = 127;   //-128 ... 127
    short aShort = -32768; // -32768... 32767
    int aInt = 520;
    long aLong = 102L;
    float aFloat = 5.8f;
    double aDouble = 3.9d;
    boolean aBoolean = false;

    System.out.println(aByte + aShort);
    System.out.println(aInt - aLong);
    System.out.println(aFloat * 9);
    System.out.println(aDouble / 9);
    System.out.println(aDouble % 3);


    int money = 600000;
    if (money >= 500000) {
      System.out.println("Ваши накопления составляют " + money + " рублей. Вы можете полететь на Мальдивы!");
    }
    else {
      System.out.println("Ваши накопления составляют " + money + " рублей. Нам очень жаль. Подкопите денег=(");
    }


    short money2 = 29999;
    if (money2 >= 500000) {
      System.out.println("Ваши накопления составляют " + money2 + " рублей. Вы можете полететь на Мальдивы!");
    }
    else {
      System.out.println("Ваши накопления составляют " + money2 + " рублей. Нам очень жаль. Подкопите денег=(");
    }

    short bShort = 32767;
    short cShort = 32222;
    System.out.println(bShort + " + " + cShort + " = " + (short)(bShort + cShort));

  }

}
