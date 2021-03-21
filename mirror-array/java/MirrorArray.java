// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.Arrays;

class MirrorArray {

    public static void main(String[] args){
      System.out.println("this is a debug message - hi ema");

      int a;
      int[] array = {1, 3, 4, 2};
      int i = array.length - 1;

      System.out.println("start array: " + Arrays.toString(array));

      //  this is code to mirror an array in-place
      for(int j = 0; j <= i / 2; j++) {
        System.out.println("j: " + j);
        System.out.println("i: " + i);
        a = array[j];
        System.out.println("array[j]: " + array[j]);
        array[j] = array[i];
        System.out.println("array[i]: " + array[i]);
        array[i] = a;
        i--;
      }

      System.out.println("end array: " + Arrays.toString(array));
    }

}
