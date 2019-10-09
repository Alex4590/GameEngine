package engineTest;

import com.sun.media.jfxmediaimpl.platform.gstreamer.GSTPlatform;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
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
                // left bottom triangle
                -0.5f, 0.5f, 0f,
                -0.5f, -0.5f, 0f,
                0.5f, -0.5f, 0f,
                // right bottom triangle
                0.5f, -0.5f, 0f,
                0.5f, 0.5f, 0f,
                -0.5f, 0.5f, 0f,
        };

        RawModel  model = loader.loadToVao(vertices);

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
