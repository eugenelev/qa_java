import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline predator;


    @Test
    public void getSoundReturnsMeow(){
        Cat cat = new Cat(predator);
        String expected = "Мяу";

        String actual = cat.getSound();

        assertEquals(actual, expected);
    }


    @Test
    public void getFoodReturnsNotEmptyList() throws Exception {
        Cat cat = new Cat(predator);
        Mockito.when(predator.eatMeat()).thenReturn(List.of("2","2"));
        int expected = 2;

        int actual = cat.getFood().size();

        assertEquals(actual, expected);
    }


}
