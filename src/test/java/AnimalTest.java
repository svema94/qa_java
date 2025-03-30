import com.example.Animal;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void testGetFamilyReturnsCorrectString() {
        String expectedString = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualString = new Animal().getFamily();

        assertEquals("Некорректный перечень семейств", expectedString, actualString);
    }
}
