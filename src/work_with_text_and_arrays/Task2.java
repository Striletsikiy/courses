package work_with_text_and_arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.IntStream;

public class Task2 {

    public void qw(){

        String s = "Jaka is an object-oriented programming language released in 1995 by Sun Microsystems as a core component of the Jaka platform.";
        System.out.println(s.replace('k','v'));

    }
    public void er(){

       String s = "Java is an object-12 programming language released in 1995 by Sun Microsystems as a core component of the Java platform.";
        System.out.println((s.replace("-12","-oriented")));
    }
    public void rt(){

        String s = "Java is an object-oriented programming language released in 1995 by Sun Microsystems as a core component of the Java platform";
        System.out.println((s.replaceAll("a","1")) + s.replaceAll("b","2"));

    }
    public void averageValue(){

        int[] array;
        array = new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum = IntStream.of(array).sum();
//        System.out.println((array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9]) / 9);
        System.out.println(sum);

    }
    public void maxMin(){

        var array = new int[]{1,2,3,4,-5,600,7,100,9,10};
        Arrays.sort(array);

        int min = array[0];
        System.out.println(min);

        int max = array[array.length-1];
        System.out.println(max);

    }
    public void equalityChecks() {
        var a = new int[]{1, 2, 3, 4, -5, 600, 7, 100, 9, 10,11};
        var b = new int[]{1, 2, 3, -4, -5, 600, 7, 100, 9, 10};

        if (a.length != b.length) {
             System.out.println("Arrays is not identical, array a length: " + a.length + " array b length: " + b.length);
             return;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                 System.out.println(a[i] + "!=" + b[i]);
                 return;
            }
        }

        System.out.println("Arrays is identical");
        return;
    }

    public void DeleteAnElemenFromAnArray(){
        int[] tensArray = { 10,20,30,40,50,60};

        int rm_index = 2;

        if (tensArray == null
                || rm_index < 0
                || rm_index > tensArray.length ) {

            System.out.println("No removal operation can be performed!!");
        }
        int[] proxyArray = new int[tensArray.length - 1];

        for (int i = 0, k = 0; i < tensArray.length; i++) {

            if (i == rm_index) {
                continue;
            }
            proxyArray[k++] = tensArray[i];
        }
        System.out.println("Array after removal operation: " + Arrays.toString(proxyArray));
    }
    public void stringPerNumber(){
        String i = "2" ;
        int b = Integer.parseInt(i) ;
        System.out.println(b);

    }
    public void duplicateElementsInAnArray(){

        Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};

        System.out.println( Arrays.toString(numbers) );

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );

        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});

        System.out.println( Arrays.toString(numbersWithoutDuplicates) );

    }
}