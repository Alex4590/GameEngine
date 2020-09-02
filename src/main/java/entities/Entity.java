package entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.lwjgl.util.vector.Vector3f;
import texturesClass.TexturedModel;

/**
 * Основной объект
 */
@Data
@NoArgsConstructor
public class Entity {

    /**
     * Модель текстуры
     */
    private TexturedModel model;

    /**
     * Позиция
     */
    private Vector3f position;

    /**
     * Вращение по Оси X
     */
    private float rotationX;

    /**
     * Вращение по Оси Y
     */
    private float rotationY;

    /**
     * Вращение по Оси Z
     */
    private float rotationZ;

    /**
     * Масштабирование
     */
    private float scale;

    public Entity(TexturedModel model, Vector3f position, float rotationX, float rotationY, float rotationZ, float scale) {
        this.model = model;
        this.position = position;
        this.rotationX = rotationX;
        this.rotationY = rotationY;
        this.rotationZ = rotationZ;
        this.scale = scale;
    }

    /**
     * Увеличение позиции
     */
    public void increasePosition(float dx, float dy, float dz) {
        this.position.x += dx;
        this.position.y += dy;
        this.position.z += dz;
    }

    /**
     * Увеличение вращения
     */
    public void increaseRotation(float dx, float dy, float dz) {
        this.rotationX += dx;
        this.rotationY += dy;
        this.rotationZ += dz;
    }
}
