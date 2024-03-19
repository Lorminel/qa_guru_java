package com.lorminel22;

public class Main {
    public static void main(String[] args) {

        byte first = 100;
        byte second = 40;
       // byte sum = first + second;    ошибка
        System.out.println(first + second); // сумма вычисляется
        System.out.println(first * second);

        int firstByteToInt = first;
        int secondByteToInt = second;
        int sum = firstByteToInt + secondByteToInt;
        System.out.println(sum);

        short firstShort = 30000;
        short secondShort = 5000;
        short thirdShort = -15677;

        short multipleShort = (short) (firstShort * secondShort);   //результат -11904
        System.out.println(multipleShort);
        short div = (short) (firstShort / secondShort);
        System.out.println(div);
        System.out.println(thirdShort + firstShort*5);

        boolean a = true;
        boolean b = false;
        System.out.println(!a);
        System.out.println(a == b );
        System.out.println(a && b );
        System.out.println(a || b );

        if(5 >= 6){
            System.out.println(a);
        } else {
            System.out.println(b);
        }


      // вычисления разных типов данных
        double firstD = 0.001;
        int firstInt = 40;
        System.out.print((firstD + firstInt) + "\n" +
                         (firstD - firstInt) + "\n" +
                         (firstD * firstInt) + "\n" +
                         (firstD / firstInt) + "\n");

        System.out.println(firstD % 10);
        System.out.println(firstInt % 10);

    }
}