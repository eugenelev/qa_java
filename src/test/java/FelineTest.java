import com.example.Animal;
import com.example.Feline;
import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class FelineTest {

    @Test
    public void eatMeatReturnsNotEmptyList() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();

        assertFalse(actual.isEmpty());
    }

    @Test
    public void getFamilyReturnsFeline() throws Exception {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();

        assertEquals(actual, expected);
    }

    @Test
    public void getKittensReturnsKittensCount() throws Exception {
        Feline feline = new Feline();
        int kittensCount = 5;
        int actual = feline.getKittens(kittensCount);
        int expected = kittensCount;

        assertEquals(actual, expected);
    }


    @Test
    public void getKittensReturnsOne() throws Exception {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;

        assertEquals(actual, expected);
    }


}
