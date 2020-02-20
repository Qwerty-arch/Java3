package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

    }

    private static void swapElement(Object[] arr, int index1, int index2) {
        if (index1 == index2) {
            return;
        }
        Object obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
    }
    /*
    * alternative
     */
   /* private static <T> void swapElement(T[] arr, int index1, int index2) {
        if (index1 == index2) {
            return;
        }
        T obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
    }*/

    private static <T>ArrayList<T> arrayToArrayList(T[] arr){
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, arr);     // можно и через asList
        return arrayList;
    }
}
