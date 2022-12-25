import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParametrizedTest {
    private String typeOfAnimal;
    private List<String> foodList;




    public AnimalParametrizedTest(String typeOfAnimal, List<String> foodList) {
        this.typeOfAnimal = typeOfAnimal;
        this.foodList = foodList;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                { "Травоядное", Arrays.asList("Трава", "Различные растения")},
                { "Хищник", Arrays.asList("Животные", "Птицы", "Рыба")}

        });
    }

    @Test
    public void getFoodReturnsListFood() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(typeOfAnimal);
        List<String> expected = foodList;
        assertEquals(actual, expected);

    }




}
