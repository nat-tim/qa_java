import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParametrizedTest {

    private final String sex;
    private final boolean mane;

    public LionParametrizedTest(String sex, boolean mane) {
        this.sex = sex;
        this.mane = mane;

    }
    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void assertHaveManeWhenCallDoesHaveMane() throws Exception{
        Lion lion = new Lion(sex, new Feline());
        Assert.assertEquals(lion.doesHaveMane(), mane);

    }


}
