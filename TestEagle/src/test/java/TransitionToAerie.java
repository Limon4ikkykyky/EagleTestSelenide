import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransitionToAerie extends BaseTest{
    @Test
    public void transitionToAerie()
    {
        aeriePage.transitionToAerie();
        Assertions.assertTrue(aeriePage.aerieIconPresent(), "Aerie Icon  is not present");
    }
}
