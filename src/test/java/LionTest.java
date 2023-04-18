import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionTest {

    @Test
    public void shouldBePredatorWhenGetFood() throws Exception{
        Lion lion = new Lion(new Feline());
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(lion.getFood(), food);
    }

    @Test
    public void shouldReturnOneKittenWhenGetKittens(){
        Lion lion = new Lion(new Feline());
        Assert.assertEquals(lion.getKittens(), 1);
    }

    @Test(expected = Exception.class)
    public void assertHaveManeWhenDoesHaveManeCallNotCorrect() throws Exception {
        Lion lion = new Lion("100500");

    }
}
