import java.util.Arrays;

public class StringAnagram {

    public boolean identifyAnagrams(String str1, String str2){
        if(str1.equals(str2))
            return true;
        if(str1.length() != str2.length())
            return false;

        char[] array1 = str1.toLowerCase().toCharArray();
        Arrays.sort(array1);
        char[] array2 = str2.toLowerCase().toCharArray();
        Arrays.sort(array2);

        return (Arrays.compare(array1, array2) == 0);

    }

    public static void main(String[] args) {
        System.out.println("Listen & silence");
        Main m = new Main();
        System.out.println(m.identifyAnagrams("Listen", "silence"));

        System.out.println("Listen & silent");
        System.out.println(m.identifyAnagrams("Listen", "silent"));
    }
}
