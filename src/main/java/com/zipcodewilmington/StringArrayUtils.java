package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (String s : array) {

            if (s.equals(value)) {

                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] list = new String[array.length];

        for (int i = 0; i < list.length; i++) {

            list[i] = array[array.length - i - 1];
        }
        return list;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return Arrays.equals(array, reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean answer = true;
        String alphabet = Arrays.toString(array).toLowerCase();

        for (char i = 'a'; i <= 'z'; i++) {

            if (!alphabet.contains(String.valueOf(i))) {

                answer = false;
            }
        }
        return answer;
    }
           /* for (int i = 0; i < array.length; i++){
                String word = array[i];
            }

            for (int d = 0; d < word.length(); d++){
                if (word.charAt(i) == ) */

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(value))
              counter++;
            }
        return counter;
        }

        /**
         * @param array         array of String objects
         * @param valueToRemove value to remove from array
         * @return array with identical contents excluding values of `value`
         */ // TODO
        public static String[] removeValue (String[]array, String valueToRemove){
            ArrayList<String> take = new ArrayList<>(Arrays.asList(array));

            for (int i = 0; i < array.length; i++){

                if (array[i].equals(valueToRemove)){

                    take.remove(array[i]);
                }
            }


            return take.toArray(new String[0]);
        }

        /**
         * @param array array of chars
         * @return array of Strings with consecutive duplicates removes
         */ // TODO
        public static String[] removeConsecutiveDuplicates (String[]array){
            ArrayList<String> take = new ArrayList<>(Arrays.asList(array));

            for (int i = 1; i < take.size(); i++){

                if (take.get(i-1).equals(take.get(i))){

                    take.remove(i);
                    i--;
                }
            }
            return take.toArray (new String[0]);
        }

        /**
         * @param array array of chars
         * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
         */ // TODO
        public static String[] packConsecutiveDuplicates (String[]array){
            ArrayList<String> take = new ArrayList<>(Arrays.asList(array));

            for (int i = 1; i < take.size(); i++){
                String previous = take.get(i-1);
                String current = take.get(i);

                if (previous.charAt(0) == current.charAt(0)){

                    take.set(i,previous + current);

                    take.remove(previous);

                    i--;
                }
            }
            return take.toArray(new String[0]);
        }
    }

