import org.junit.Test;

public class valPassTest {

    @Test
    public void testValPass() {
        assert(ValidatePassword.valPass("Password123"));
    }

    @Test
    public void testValPass2() {
        assert(!ValidatePassword.valPass("password123"));
    }

    @Test
    public void testValPass3() {
        assert(!ValidatePassword.valPass("Password"));
    }
}
