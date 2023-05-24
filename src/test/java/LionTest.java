import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void shouldBePredatorWhenGetFood() throws Exception{
        Lion lion = new Lion(feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(food, lion.getFood());
    }

    @Test
    public void shouldReturnOneKittenWhenGetKittens(){
        Lion lion = new Lion(new Feline());
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test(expected = Exception.class)
    public void assertHaveManeWhenDoesHaveManeCallNotCorrect() throws Exception {
        Lion lion = new Lion("100500", new Feline());

    }
}
