import com.example.Animal;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class AnimalTest {

    @Test
    public void getFamilyReturnsStringAnimals() throws Exception {
        Animal animal = new Animal();
        String expectedFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        String actualFamily = animal.getFamily();

        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getFoodListForHerbivoreIsNotEmpty() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood("Травоядное");
        assertThat(actual, hasSize(2));
    }

    @Test
    public void getFoodListForPredatorIsNotEmpty() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood("Хищник");
        assertThat(actual, hasSize(3));
    }


    @Test
    public void getFoodTrownException() throws Exception {
        Animal animal = new Animal();

        Exception actualException = assertThrows(Exception.class, () -> animal.getFood("dfg"));
        String expectedException = "Неизвестный вид животного, используйте значение Травоядное или Хищник";

        assertEquals(expectedException, actualException.getMessage());
    }



}
