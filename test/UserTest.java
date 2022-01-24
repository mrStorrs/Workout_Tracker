import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UserTest {
    static User a, b;

    @BeforeAll
    public static void setUp(){
        a = new User("cj");
        b = new User("bob");
    }

    @Test
    void setName() {
        a.setName("not_cj");
        assertEquals("not_cj", a.getName());
    }

    @Test
    void getName() {
        assertEquals("cj", a.getName());
    }

    @Test
    void getId() {
        assertEquals(0, a.getId()); //check if single object id is correct
        assertEquals(1, b.getId()); //check if second object id is correct
    }
}