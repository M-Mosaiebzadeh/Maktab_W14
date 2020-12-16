package maktab.Hafte14.a;

import java.util.Arrays;

public class PrintArrayParent {

    // یک متد جنریک که ارایه ای جنریک را میگیرد و اعضای آن را چاپ میکند(به روش استریم)
    public <T> void printArray(T[] array) {
        Arrays.asList(array).forEach(System.out::print);
    }

    public static void main(String[] args) {
        PrintArrayParent obj = new PrintArrayParent();

        Integer[] intArray = {1, 2, 3, 4};
        Character[] charArray = {'a', 'b'};

        obj.printArray(charArray);
        System.out.println();
        obj.printArray(intArray);
    }

}
