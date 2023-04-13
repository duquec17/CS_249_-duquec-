package edu.realemj.assign06;
import edu.realemj.assign04.CharBoard;
//NOTE: CHANGE realemj to YOUR SITNETID!!!
import org.testng.annotations.Test;

public class Test_Drawable {

    private class DrawTest implements Drawable {
        public void draw(CharBoard map) {

        }
    }

    @Test()
    public void testDrawable() {
        Drawable drawableThing = new DrawTest();
        drawableThing.draw(new CharBoard(1,1,'.'));
    }
}
