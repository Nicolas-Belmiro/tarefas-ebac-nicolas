
import javax.swing.*;
import java.util.*;

public class NomeDeFamiliares {

    private Object String;

    public NomeDeFamiliares() {
    }

    public static void main(String[] args) {
        System.out.println("Primeira Parte");
        List<String> list = new ArrayList<>();
        list.add("Simone Elza");
        list.add("Marcio Dias");
        list.add("Nicolas Belmiro");
        list.add("Hilda Lopes");
        list.add("Yan Lucas");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println();


    }


}





