package engineTest;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;


public class Main {

    public static void main(String[] args) throws LWJGLException {
        Display.create();
        while (!Display.isCloseRequested()) {
            Display.update();
        }
        Display.destroy();
    }
}
