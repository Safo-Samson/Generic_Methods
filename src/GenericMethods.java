import java.util.ArrayList;
import java.util.List;

/**
* This is useful when you write a method but want to be flexible with the type of method that gets passed in
 * instead of using the Object class
**/


public class GenericMethods {

    private static Integer[] intArray = {1,2,3,4};
    private static Character[] charArray = {'a','b', 'c'};
    private static String[] stringArray = {"Sam", "eben", "messi"};

    /** The initial approach will be to use an object to accept any type that is passed in*/

//    public static List arrayToList(Object[] array, List<Object> list){
//        for (Object o: array)
//            list.add(o);
//        return list;
//    }

    /**
     * The first T has a local scope (can be used in that method only). To specify the return type properly, another
     * T is added before the List to enforce that the return type of the method is of the new type T.
     * */
    
    public static <T> List<T> arrayToList(T[] array, List<T> list){
        for (T o: array)
            list.add(o);
        return list;
    }

    public static void main(String[] args) {

        /** leaves error with generic but not Object even though the lists says all integers*/
//        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
//        List<Integer> charList = arrayToList(charArray, new ArrayList<>());
//        List<Integer> stringList = arrayToList(stringArray, new ArrayList<>());

        List<Integer> intList1 = arrayToList(intArray, new ArrayList<>());
        List<Character> charList1 = arrayToList(charArray, new ArrayList<>());
        List<String> stringList1 = arrayToList(stringArray, new ArrayList<>());
    }
}
