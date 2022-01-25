import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class ButtonTest {
    static Button a, b;

    @BeforeAll
    public static void setUp(){
        a = new Button("button-a");
        b = new Button("button-b");

    }

    @Test
    void actionPerformed() {
        a.doClick();
        assertEquals("this", a.getLabel_text());
        assertEquals("button-b", b.getLabel_text());

    }

    @Test
    void setLabel_text() {
        a.setLabel_text("button-a-changed");
        assertEquals("button-a-changed", a.getLabel_text()); //check if a changed
        assertEquals("button-b", b.getLabel_text()); //make sure b did not change.
    }

    @Test
    void getLabel_text() {
        assertEquals("button-a", a.getLabel_text());
    }
}