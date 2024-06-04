import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


// acrescimo de testes unitarios testar se na lista criada ha somente mulher

public class MainTest {
    @Test
      public void testeFiltrarNomesDeMulheres(){
        List<ListaNomes> listaNomes = Arrays.asList(
                new ListaNomes("Fernanda", "Mulher"),
                new ListaNomes("Paula", "Mulher"),
                new ListaNomes("Hilda", "Mulher"),
                new ListaNomes("Simone", "Mulher"),
                new ListaNomes("Marceline", "Mulher")  );

        List<ListaNomes> mulher = Main.testeFiltrarNomesDeMulheres(listaNomes);
        assertEquals(5, mulher.size());
        mulher.forEach(ListaNomes -> assertEquals("Mulher", ListaNomes.getGenero()));

    }

}