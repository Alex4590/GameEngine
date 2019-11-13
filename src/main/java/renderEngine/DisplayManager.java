package renderEngine;

import org.lwjgl.opengl.*;

public class DisplayManager {

    private static final int WIDTH = 720;
    private static final int HEIGHT = 450;
    private static final int FPS_CAP = 120;


    public static void CreateDisplay() {

        ContextAttribs attribs = new ContextAttribs(3,2, ContextAttribs.CONTEXT_COMPATIBILITY_PROFILE_BIT_ARB);
        attribs.withForwardCompatible(true);
        attribs.withProfileCore(true);

        try {
            Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
            Display.create(new PixelFormat(), attribs);
            Display.setResizable(false);
            Display.setTitle("Display launcher");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        GL11.glViewport(0, 0, WIDTH, HEIGHT);

    }

    public static void updateDisplay() {

        Display.sync(FPS_CAP);
        Display.update();
    }

    public static void CloseDisplay() {

        Display.destroy();
    }
}
