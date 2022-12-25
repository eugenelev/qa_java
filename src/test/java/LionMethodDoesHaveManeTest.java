import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionMethodDoesHaveManeTest {
    private String sex;
    private boolean isMane;
    private Feline feline;


    public LionMethodDoesHaveManeTest(String sex, boolean isMane) {
        this.sex = sex;
        this.isMane = isMane;
    }

    @Parameterized.Parameters
    public static Collection lions() {
        return Arrays.asList(new Object[][] {
                { "Самец", true},
                { "Самка", false}

        });
    }

    @Test
    public void doesHaveManeReturnsValidValue() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean expected = isMane;

        boolean actual = lion.doesHaveMane();

        assertEquals(expected, actual);

    }
}
