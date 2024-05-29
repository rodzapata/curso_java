
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] vowels= {"a","e","i","o","u"};
        List<String> listVowels= Arrays.asList(vowels);
        List<String> listVowels2= List.of(vowels);

        List<String> listVowelArray = new ArrayList<>();
        listVowelArray.add("u");
        listVowelArray.add("i");
        listVowelArray.add("a");
        System.out.println(listVowelArray);
        Collections.sort(listVowelArray);
        System.out.println(listVowelArray);


        List<String> listVowels3 = new ArrayList<>();
        listVowels3.add("z");
        //listVowels2.add("z");

        listVowels.set(0,"z");
        //listVowels.remove(0);
        //listVowels2.set(0,"z");
        System.out.println(listVowels);
        Collections.sort(listVowels);
        System.out.println(listVowels);
        System.out.println(listVowels2);
        System.out.println(listVowels3);

    }

}
