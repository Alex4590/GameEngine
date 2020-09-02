package entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.lwjgl.util.vector.Vector3f;

/**
 * Освещение
 */
@Data
@NoArgsConstructor
public class Light {

    /**
     * Позиция
     */
    private Vector3f position;

    /**
     * Цвет
     */
    private Vector3f colour;

    public Light(Vector3f position, Vector3f colour) {
        this.position = position;
        this.colour = colour;
    }
}
