package engineTest;

import org.lwjgl.opengl.Display;
import renderEngine.DisplayManager;

public class MainGameLoop {

    public static void main(String[] args) {

        DisplayManager.CreateDisplay();

        while (!Display.isCloseRequested()) {

            //game logic
            //render
            DisplayManager.UpdateDispaly();
        }

        DisplayManager.CloseDisplay();
    }
}
