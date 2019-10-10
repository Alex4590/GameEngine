package engineTest;

import org.lwjgl.opengl.Display;
import renderEngine.DisplayManager;
import renderEngine.Loader;
import renderEngine.RawModel;
import renderEngine.Renderer;

public class MainGameLoop {

    public static void main(String[] args) {


        DisplayManager.CreateDisplay();

        Loader loader = new Loader();
        Renderer renderer = new Renderer();

        float[] vertices = {
            -0.5f, 0.5f, 0f,  // V0
            -0.5f, -0.5f, 0f, // V1
            0.5f, -0.5f, 0f,  // V2
            0.5f, 0.5f, 0f,   // V3
        };

        int[] indices = {
            0, 1, 3, // Top Left triangle (V0, V2, V3)
            3, 1, 2 // Top Left triangle (V3, V1, V2)
        };

        RawModel  model = loader.loadToVao(vertices, indices);

        while (!Display.isCloseRequested()) {

            renderer.prepare();

            renderer.render(model);

            //game logic
            //render
            DisplayManager.UpdateDispaly();
        }

        // vao and dao
        loader.cleanUp();
        DisplayManager.CloseDisplay();


    }
}
