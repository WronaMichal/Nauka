package pl.wrona.michal.nauka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;
//Zadania String:
//1. Stwórz statyczną metodę, która będzie przyjmować dowolny String i będzie wypisywać jego pierwszy i ostatni znak
//2. Stwórz statyczną metodę, która będzie przyjmować dowolny String i będzie wypisywać jego długość
//3. Stwórz statyczną metodę, która będzie przyjmować dowolny String i będzie wypisywać każdą jego literę w oddzielnym wierszu
//4. Stwórz statyczną metodę, która będzie przyjmować dwa obiekty typu String i będzie zwracać nowy String powstały poprzez połączenie podanych obiektów String.
//5. Stwórz statyczną metodę, która będzie przyjmować dwa obiekty typu String i będzie zwracać nowy String powstały poprzez połączenie podanych obiektów String złączonych wyrażeniem "dodawanie"
//6. Stwórz statyczną metodę, która będzie przyjmować dowolny String i będzie wypisywać "prawda" w przypadku gdy podany String zawiera literę "a", "fałsz" w przypadku gdy nie będzie zawierał litery "a"
//7. Stwórz statyczną metodę, która będzie przyjmować dowolny String i będzie wypisywać "prawda" w przypadku gdy podany String zawierał wyrażenie "abc", "fałsz" w przeciwnym wypadku
//8. Stwórz statyczną metodę, która będzie przyjmować dowolny String i będzie wypisywać "prawda" w przypadku gdy podany String kończy się literą "a", "fałsz" w przeciwnym wypadku
//9. Stwórz statyczną metodę, która będzie przyjmować dowolny String i będzie wypisywać "prawda" w przypadku gdy podany String zaczyna się literą "a", "fałsz" w przeciwnym wypadku
//10. Stwórz statyczną metodę, która będzie przyjmować dwa obiekty typu String i będzie wypisywać "prawda" w przypadku gdy oba obiekty są sobie równe, "fałsz" w przeciwnym wypadku
//11. Stwórz statyczną metodę, która będzie przyjmować dwa obiekty typu String i będzie wypisywać "prawda" w przypadku gdy oba obiekty są sobie równe bez rozróżniania wielkości liter, "fałsz" w przeciwnym wypadku
//12. Stwórz statyczną metodę, która będzie przyjmować dowolny String i będzie wypisywać indeks pierwszego wystąpienia litery "a"
//13. Stwórz statyczną metodę, która będzie przyjmować dowolny String i będzie wypisywać indeks ostatniego wystąpienia litery "a"
//14. Stwórz statyczną metodę, która będzie przyjmować dowolny String i będzie wypisywać wszystkie indeksy na których występuje litera "a"
//14.1. Stwórz statyczną metodę, która będzie przyjmować dowolny String i dla każdej znalezionej litery "a" wypisze znaki, które są obok
//14.2. Stwórz statyczną metodę, która będzie przyjmować dowolny String i wypisze wszystkie znaki, które występują obok liter "a"
//15. Stwórz statyczną metodę, która będzie przyjmować dowolny String i będzie wypisywać "niepusty" w przypadku gdy podany String nie jest pusty, "pusty" w przeciwnym wypadku
//16. Stwórz statyczną metodę, która będzie przyjmować dowolny String i zamieni wszystkie litery "a" na "-"
//17. Stwórz statyczną metodę, która będzie przyjmować dowolny String i będzie zwracać ten String bez pierwszych trzech liter
//18. Stwórz statyczną metodę, która będzie przyjmować dowolny String i będzie zwracać ten String bez trzech ostatnich liter
//19. Stwórz statyczną metodę, która będzie przyjmować dowolny String i zamieni wszystkie litery na wielkie
//20. Stwórz statyczną metodę, która będzie przyjmować dowolny String i zamieni wszystkie litery na małe
//21. Stwórz statyczną metodę, która będzie przyjmować dowolny String i usunie z niego wszystkie białe znaki z początku i końca.

public class Main {

    static void zadanie1(String word) {
        System.out.println("First letter: " + word.charAt(0) + " Last letter: " + word.charAt(word.length() - 1));

    }

    static void zadanie2(String word) {
        System.out.println("Length of word: " + word.length());
    }

    static void zadanie3(String word) {
        for (int index = 0; index < word.length(); index++) {
            System.out.println("Letter " + index + "\n" + word.charAt(index));
        }

    }
    static void zadanie4(String word1, String word2) {
        String word3 = word1 + word2;
        System.out.println("New string " + word3);
    }

    static void zadanie5(String word1, String word2) {
        String word3 = word1 + "dodawanie" + word2;
        System.out.println("New string " + word3);
    }

    static void zadanie6(String word) {
        ArrayList<Character> list = new ArrayList<>();
        for (int index = 0; index < word.length(); index++) {
            char a = word.charAt(index);
            list.add(a);
        }
        if (list.contains('a')) {
            System.out.println("Prawda");
        } else {
            System.out.println("Fałsz");
        }

    }

    static void zadanie7(String word) {
        if (word.contains("abc")) {
            System.out.println("Prawda");
        } else {
            System.out.println("Fałsz");
        }
    }

    static void zadanie8(String word) {
        if (word.endsWith("a")) {
            System.out.println("Prawda");
        } else {
            System.out.println("Fałsz");


        }
    }

    static void zadanie9(String word) {
        if (word.startsWith("a")) {
            System.out.println("Prawda");
        } else {
            System.out.println("Fałsz");

        }
    }

    static void zadanie10(String word1, String word2) {
        if (word1.equals(word2)) {
            System.out.println(("Prawda"));
        } else {
            System.out.println("Fałsz");
        }

    }

    static void zadanie11(String word1, String word2) {
        if (word1.equalsIgnoreCase(word2)) {
            System.out.println(("Prawda"));
        } else {
            System.out.println("Fałsz");
        }
    }

    static void zadanie12(String word) {
        System.out.println(word.indexOf('a'));
    }

    static void zadanie13(String word) {
        System.out.println(word.lastIndexOf('a'));
    }

    static void zadanie14(String word, String guess) {
        for (int index = word.indexOf(guess); index >= 0; index = word.indexOf(guess, index + 1)) {
            System.out.println("Position of character is: " + index);
        }
    }

    static void zadanie141(String word, String guess) {
        int l = word.length();
        for (int index = word.indexOf(guess); index >= 0; index = word.indexOf(guess, index + 1)) {
            if((index-1 >=0) && (index+1<l)){
                System.out.println("Position of character " + guess + " is: " + index);
                System.out.println("Characters next to " + guess + " are " + word.charAt(index-1) + " and " + word.charAt(index+1));
            }
            else if(index==0){
                System.out.println("Position of character " + guess + " is: " + index);
                System.out.println("Character next to " + guess + " is " + word.charAt(index+1));

            }
            else if (index +1 ==l){
                System.out.println("Position of character " + guess + " is: " + index);
                System.out.println("Character next to " + guess + " is " + word.charAt(index-1));
            }
        }

    }

    static void zadanie15(String word){
        if(word.isEmpty()){
            System.out.println("Pusty");
        }
        else{
            System.out.println("Niepusty");
        }
    }
    static void zadanie16(String word){
        System.out.println(word.replace('a','-'));
    }
    static void zadanie17(String word){
        System.out.println(word.substring(3));
    }
    static void zadanie18(String word){
        int l = word.length();
        System.out.println(word.substring(0,l-3));

    }
    static void zadanie19(String word){
        System.out.println(word.toUpperCase());

    }
    static void zadanie20(String word){
        System.out.println(word.toLowerCase());
    }
    static void zadanie21(String word){
        System.out.println(word.trim());
    }


    ///Arrays, Java InBuilt Lists, AutoBoxing and Unboxing

    //Create a program using arrays that sorts a list of integers in descending order.
    //Descending order is highest value to lowest.
    //In other words if the array had the values in it [106, 26, 81, 5, 15] your program should ultimately have an array with [106, 81, 26, 15, 5] in it.
    //Set up the program so that the numbers to sort are read in from the keyboard (Scanner).
    //Implement the following methods:
    //getIntegers has one parameter of type int which is the size of the array. It returns an array of entered integers from the keyboard.
    //printArray accepts an array and prints out the contents of the array. It should be printed in the following format:

    //Element 0 contents 106
    //Element 1 contents 81
    //Element 2 contents 26
    //Element 3 contents 15
    //Element 4 contents 5
    //sortIntegers accepts the unsorted array. It should sort the array and return a new array containing the sorted numbers.
    //
    //The scenario is:
    //1. getIntegers() is called.
    //2. The returned array from getIntegers() is then used to call sortIntegers().
    //3. The returned array from sortIntegers() is then printed to the console.


    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values:\r");
        int[] values = new int[number];

        for (int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println("Element " + i + " contents " + values[i]);

        }
    }

    public static int[] sortIntegers(int[]values) {
        int[] sortedArray = new int[values.length];
        for (int i = 0; i < values.length; i++){
            sortedArray[i] = values[i];
    }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1;i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    // Minimum Element Challenge

    //Write a method called readInteger() that has no parameters and returns an int.
    //It needs to read in an integer from the user - this represents how many elements the user needs to enter.
    //Write another method called readElements() that has one parameter of type int
    //The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
    //And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.

    //The scenario is:
    //1. readInteger() is called.
    //2. The number returned by readInteger() is then used to call readElements().
    //3. The array returned from readElements() is used to call findMin().
    //4. findMin() returns the minimum number.


    private static Scanner scanner2 = new Scanner(System.in);
    public static int[] readIntegers(int count){
        int[] array = new int[count];

        for(int i=0; i<array.length; i++){
            System.out.println("Enter numbers:\r");
            int number = scanner2.nextInt();
            scanner2.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static void finMin(int[]array){
        Arrays.sort(array);
        System.out.println("Minimum element in array is: " + array[0]);
    }


    //Another approach for finMin method

    private static int finMin2(int[]array){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<array.length;i++){
            int value = array[i];
            if(value<min){
                min=value;
            }
        }
        return min;
    }

    private static void reverse (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Original Array: " + Arrays.toString(array));

        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("Original Array: " + Arrays.toString(array));
        }
    }


    //another solution for reverse array method

    private static void reverse2(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;
        int lengthArray = array.length / 2;

        for (int i = 0; i < lengthArray; i += 1) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }





        public static void main (String[]args){
//            zadanie1("Moje");
//            zadanie2("Moje");
//            zadanie3("Moje");
//            zadanie4("Moje", "Twoje");
//            zadanie5("Moje", "Twoje");
//            zadanie6("Moje");
//            zadanie7("Moje");
//            zadanie7("abcd");
//            zadanie8("abcdf");
//            zadanie9("abcdf");
//            zadanie10("abcdf", "ABCDF");
//            zadanie11("abcdf", "ABCDF");
//            zadanie12("abcdf");
//            zadanie13("abcdfghya");
//            zadanie14("abcdfaghya", "a");
//            zadanie141("abcdfaghya", "a");
//            zadanie15("ble");
//            zadanie15("");
//            zadanie16("abcdfaghya");
//            zadanie17("abcdfaghya");
//            zadanie18("abcdfaghya");
//            zadanie19("abcdfaghya");
//            zadanie20("abcdFSaghya");
//            zadanie21(" abcdFSaghya ");
  //          System.out.println("Enter count: ");
  //          int count = scanner2.nextInt();
  //          scanner2.nextLine();
  //          int[] returnedArrays = readIntegers(count);
  //          finMin(returnedArrays);
//            int[] myArray = {10,20,30,50};
//            reverse(myArray);
            // int[] myArray = {1,2,3,4,5};
            // reverse2(myArray);



        }
    }
