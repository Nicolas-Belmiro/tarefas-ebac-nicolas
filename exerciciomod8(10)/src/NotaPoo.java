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


         long result = totalSomado;

        if (result == 6) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Passou de Materia Parabens");
        }


    }



}
