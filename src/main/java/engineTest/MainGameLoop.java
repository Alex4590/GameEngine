package engineTest;

import entities.Entity;
import org.lwjgl.opengl.Display;
import org.lwjgl.util.vector.Vector3f;
import renderEngine.DisplayManager;
import renderEngine.Loader;
import renderEngine.RawModel;
import renderEngine.Renderer;
import shadersClass.StaticShader;
import texturesClass.ModelTexture;
import texturesClass.TexsturedModel;

public class MainGameLoop {

    public static void main(String[] args) {


        DisplayManager.CreateDisplay();

        Loader loader = new Loader();
        Renderer renderer = new Renderer();
        StaticShader shader = new StaticShader();

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

        float[] textureCoords = {
                0,0, // V0
                0,1, // V1
                1,1, // V2
                1,0  // V3
        };

        RawModel  model = loader.loadToVao(vertices, textureCoords, indices);
        ModelTexture texture = new ModelTexture(loader.loaderTexture("image"));
        TexsturedModel texsturedModel = new TexsturedModel(model, texture);

        Entity entity = new Entity(texsturedModel, new Vector3f(-1, 0 ,0), 0, 0, 0 ,1);

        //game logic
        //render
        while (!Display.isCloseRequested()) {
            entity.increasePosition(0.002f, 0, 0);
            entity.increaseRotation(0, 1, 0);
            renderer.prepare();
            shader.start();
            renderer.render(entity, shader);
            shader.stop();

            DisplayManager.UpdateDispaly();
        }


        shader.cleanUp();

        // vao and dao
        loader.cleanUp();
        DisplayManager.CloseDisplay();


    }
}
