import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParametrizedTest {

    private final int countKittens;
    private final int countKittensExpected;

    public FelineParametrizedTest(int countKittens, int countKittensExpected) {
        this.countKittens = countKittens;
        this.countKittensExpected = countKittensExpected;
    }
    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {1, 1},
                {0, 0},
                {100500, 100500},
        };
    }

    @Test
    public void shouldGetCountKittensWhenGetKittens(){
        Feline feline = new Feline();
        Assert.assertEquals(countKittensExpected, feline.getKittens(countKittens));

    }


}

