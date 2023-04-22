import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Test
    public void shoudSayMeowWhenGetSound(){
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Mock
    Feline felineMocked = new Feline();
    @Test
    public void shoudBeWhenGetFood() throws Exception{
        Cat cat = new Cat(felineMocked);
        cat.getFood();
        Mockito.verify(felineMocked, Mockito.times(1)).eatMeat();
    }
}
