import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class FelineTest {

    @Test
    public void shouldBeCatWhenGetFamily(){
        Feline feline = new Feline();
        Assert.assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    public void shouldGetCountKittensWhenKittensWithoutArg(){
        Feline feline = new Feline();
        Feline felineSpy = Mockito.spy(feline);
        felineSpy.getKittens();
        Mockito.verify(felineSpy, Mockito.times(1)).getKittens();

    }
    @Test
    public void shouldBePredatorWhenEatMeat() throws Exception{
        Feline feline = new Feline();
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(feline.eatMeat(), food);
    }


}