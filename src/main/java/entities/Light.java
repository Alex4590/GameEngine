package entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.lwjgl.util.vector.Vector3f;

@Data
@NoArgsConstructor
public class Light {

    private Vector3f position;

    private Vector3f colour;

    public Light(Vector3f position, Vector3f colour) {
        this.position = position;
        this.colour = colour;
    }
}
