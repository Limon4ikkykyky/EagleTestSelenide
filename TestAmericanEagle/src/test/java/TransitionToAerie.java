import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransitionToAerie extends BaseTest{
    @Test
    public void transitionToAerie()
    {
        aeriePage.switchToAerie();
        Assertions.assertTrue(aeriePage.isAerieIconPresent(), "Aerie Icon  is not present");
    }
}
