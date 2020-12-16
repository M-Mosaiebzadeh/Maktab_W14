package maktab.Hafte14.c;

import maktab.Hafte14.a.PrintArrayParent;
import java.util.Arrays;

public class PrintArray2 extends PrintArrayParent {

    // یک متد غیر جنریک که ارایه ای از استرینگ را گرفته و آن را چاپ میکند
    public void printArray(String[] array) {

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        PrintArray2 obj = new PrintArray2();
        String[] strArray = {"ali","hassan","reza"};
        obj.printArray(strArray);
    }
}
