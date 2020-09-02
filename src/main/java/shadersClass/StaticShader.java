package shadersClass;

import entities.Camera;
import entities.Light;
import org.lwjgl.util.vector.Matrix4f;
import toolbox.Maths;

/**
 * Класс работы со статическими шейдерами
 */
public class StaticShader extends ShaderProgram {

    /**
     * Путь к файлу вершинного шейдера
     */
    private static final String VERTEX_FILE = "src/main/shaders/vertexShader.glsl";

    /**
     * Путь к файлу фрагментного шейдера
     */
    private static final String FRAGMENT_FILE = "src/main/shaders/fragmentShader.glsl";

    private int location_transformationMatrix;

    private int location_projectionMatrix;

    private int location_viewMatrix;

    private int location_lightPosition;

    private int location_lightColour;

    public StaticShader() {
        super(VERTEX_FILE, FRAGMENT_FILE);
    }

    /**
     * Привязка атрибутов
     */
    @Override
    protected void bindAttributes() {
        super.bindAttribute(0, "position");
        super.bindAttribute(1, "textureCoordinates");
        super.bindAttribute(2, "normal");
    }

    /**
     * Получение всех унифицированных локаций
     */
    @Override
    protected void getAllUniformLocations() {
        location_transformationMatrix = super.getUniformLocation("transformationMatrix");
        location_projectionMatrix = super.getUniformLocation("projectionMatrix");
        location_viewMatrix = super.getUniformLocation("viewMatrix");
        location_lightPosition = super.getUniformLocation("lightPosition");
        location_lightColour = super.getUniformLocation("lightColour");
    }

    /**
     * Загрузка изменений матрицы
     *
     * @param matrix - матрица
     */
    public void loadTransformationMatrix(Matrix4f matrix) {
        super.loadMatrix(location_transformationMatrix, matrix);
    }

    /**
     * Загрузка освещения
     *
     * @param light - освещение
     */
    public void loadLight(Light light) {
        super.loadVector(location_lightPosition, light.getPosition());
        super.loadVector(location_lightColour, light.getColour());
    }

    /**
     * Загрузка матрицы просмтра(камеры)
     *
     * @param camera - камера
     */
    public void loadViewMatrix(Camera camera) {
        Matrix4f viewMatrix = Maths.createViewMatrix(camera);
        super.loadMatrix(location_viewMatrix, viewMatrix);
    }

    /**
     * Загрузка матрицы проекции
     *
     * @param projection - матрица проекции
     */
    public void loadProjectionMatrix(Matrix4f projection) {
        super.loadMatrix(location_projectionMatrix, projection);
    }
}