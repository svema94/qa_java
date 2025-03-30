import com.example.Animal;
import org.junit.Test;
import java.util.List;
import java.util.Arrays;
import java.lang.Exception;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void testGetFamilyReturnsCorrectString() {
        String expectedString = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualString = new Animal().getFamily();

        assertEquals("Некорректный перечень семейств", expectedString, actualString);
    }

    @Test(expected = Exception.class)
    public void testGetFoodThrowsExceptionForEmptyInput() throws Exception {
        new Animal().getFood("");
    }

    @Test(expected = Exception.class)
    public void testGetFoodThrowsExceptionForInvalidInput() throws Exception {
        new Animal().getFood("Незнакомое животное");
    }

    @Test
    public void testGetFoodReturnsHerbivoreFood() throws Exception {
        List<String> expectedFood = Arrays.asList("Трава", "Различные растения");
        List<String> actualFood = new Animal().getFood("Травоядное");

        assertEquals("Неправильная еда для травоядного", expectedFood, actualFood);
    }

    @Test
    public void testGetFoodReturnsPredatorFood() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFood = new Animal().getFood("Хищник");

        assertEquals("Неправильная еда для хищника", expectedFood, actualFood);
    }
}
