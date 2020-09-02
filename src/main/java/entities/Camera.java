package entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.lwjgl.input.Keyboard;
import org.lwjgl.util.vector.Vector3f;

/**
 * Камера
 */
@Data
@NoArgsConstructor
public class Camera {

    /**
     * Начальная позиция камеры
     */
    private Vector3f position = new Vector3f(0, 0, 0);

    /**
     * Угол наклона
     */
    private float pitch;

    /**
     * Смещение
     */
    private float yaw;

    /**
     * Перемещение
     */
    private float roll;

    /**
     * Движение
     */
    public void move() {
        if (Keyboard.isKeyDown(Keyboard.KEY_S)) {
            position.z += 0.02f;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
            position.z -= 0.02f;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
            position.x += 0.02f;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_A)) {
            position.x -= 0.02f;
        }
    }
}
