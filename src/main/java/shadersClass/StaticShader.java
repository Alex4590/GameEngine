package shadersClass;

public class StaticShader extends ShaderProgram {

    private static final String VERTEX_FILE = "C:\\Users\\aleksandr.polyakov\\IdeaProjects\\GD\\target\\classes\\shaders\\vertexShader";
    private static final String FRAGMENT_FILE = "C:\\Users\\aleksandr.polyakov\\IdeaProjects\\GD\\target\\classes\\shaders\\fragmentShader";

    public StaticShader() {
        super(VERTEX_FILE, FRAGMENT_FILE);
    }

    @Override
    protected void bindAttributes () {
        super.bindAttribute(0, "position");
    }
}
