import java.util.ArrayList;
import java.util.List;


import static java.util.Collections.sort;


public class NomeDeFamiliares {
    private static java.lang.Object Collections;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> list = new ArrayList<String>();
        list.add("Simone Elza");
        list.add("Marcio Dias");
        list.add("Nicolas Belmiro");
        list.add("Hilda Lopes");
        list.add("Yan Lucas");
        System.out.println(list);
        java.util.Collections.<String>sort(list);
        System.out.println(list);
        System.out.println();


    }
}