import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void doesHaveManeForMaleReturnsTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean expected = true;

        boolean actual = lion.doesHaveMane();

        assertEquals(actual, expected);
    }

    @Test
    public void doesHaveManeForFemaleReturnsFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean expected = false;

        boolean actual = lion.doesHaveMane();

        assertEquals(actual, expected);
    }

    @Test
    public void unidentifiedSexTrownException(){
        Exception actualException = assertThrows(Exception.class, () -> new Lion("unknown", feline));
        String expectedException = "Используйте допустимые значения пола животного - самей или самка";

        assertEquals(expectedException, actualException.getMessage());
    }

    @Test
    public void getKittensReturnsValidCoune() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(2);
        int expected = 2;

        int actual = lion.getKittens();

        assertEquals(actual, expected);
    }

    @Test
    public void getFoodReturnsValidListOfFood() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Апельсины","Бананы"));
        List<String> expected = List.of("Апельсины","Бананы");

        List<String> actual = lion.getFood();

        assertEquals(actual, expected);
    }

}
