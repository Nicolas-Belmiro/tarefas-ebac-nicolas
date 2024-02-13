import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NomeDeFamiliaresSe {

    private Object String;

    public NomeDeFamiliaresSe() {
    }

    public static void main(String[] args) {
        System.out.println("Primeira Parte");
        List<String> list = new ArrayList<>();
        list.add("Simone Elza - F");
        list.add("Marcio Dias - M");
        list.add("Nicolas Belmiro - M");
        list.add("Hilda Lopes - F");
        list.add("Yan Lucas - M");


        List<String> listM = new ArrayList<>();
        System.out.println("Segunda  Parte");
        list.add("Marcio Dias - M");
        list.add("Nicolas Belmiro - M");
        list.add("Yan Lucas - M");



        List<String> listF = new ArrayList<>();

        list.add("Simone Elza - F");
        list.add("Hilda Lopes - F");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println();
        for (String i : list){

            String[] splitted = i.split("-");

            String nome =  splitted[0];  //Está se referindo ao nome

            String genero  = splitted[1]; //Está se referindo ao genero

            if (genero.equals( " M") ){
                listM.add(i) ;
            } else if ( genero.equals( " F")) {
                listF.add(i) ;


            }

        }
        System.out.println(listM);
        System.out.println(listF);

    }
}
