package maktab.Hafte14.b;

import maktab.Hafte14.a.PrintArrayParent;

public class PrintArray1 extends PrintArrayParent {

    // این متد علاوه بر ارایه جنریک،محدوده انتخابی کاربر را نیز میگیرد و ارایه دلخواه را چاپ میکند
    public <T> void printArray(T[] array,int lowSubscript, int highSubscript) {
        // در صورتی که اعداد کران بالا و پایین در رنج معتبر برای ارایه نباشد یک اکسپشن پرتاب میشود
        if (lowSubscript <1 || highSubscript > array.length)
            throw new IllegalArgumentException("value not in rage");

        for (int i = lowSubscript - 1; i <= highSubscript - 1; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        PrintArray1 obj = new PrintArray1();
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        obj.printArray(charArray, 1, 3);
        obj.printArray(charArray, 1, 10);
        obj.printArray(charArray, -1, 3);

    }

}
