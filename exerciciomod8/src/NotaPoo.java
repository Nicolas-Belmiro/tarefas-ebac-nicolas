import java.io.ObjectInputFilter;

public class NotaPoo {
    public static void main (String args[]){
        operacaoDivisao();
    }

    private static void operacaoDivisao() {

         long notaProva = 9;

         long notaAtividade = 9;

         long segundaProva = 8;

         long notaSegundaAtividade = 10;

         long totalSomado = (notaProva + notaAtividade + segundaProva + notaSegundaAtividade);

         long totalNota = totalSomado / 4;


         System.out.println(totalNota);

    }



}
