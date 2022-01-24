import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User a = new User("cj"); //user object to be used for testing.

    @Test
    void setName() {
        a.setName("not_cj");
        assertEquals("not_cj", a.getName());
    }

    @Test
    void getName() {
        assertEquals("cj", a.getName());
    }
}