import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionTestParametrized {

    private final String sex;
    private final boolean Mane;

    public LionTestParametrized(String sex, boolean Mane) {
        this.sex = sex;
        this.Mane = Mane;
    }
    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void assertHaveManeWhenCallDoesHaveMane()throws Exception{
        Lion lion = new Lion(sex);
        Assert.assertEquals(lion.doesHaveMane(), Mane);

    }


}
