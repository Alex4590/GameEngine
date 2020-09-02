package entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.lwjgl.util.vector.Vector3f;
import texturesClass.TexturedModel;

@Data
@NoArgsConstructor
public class Entity {

    private TexturedModel model;

    private Vector3f position;

    private float rotX;

    private float rotY;

    private float rotZ;

    private float scale;

    public Entity(TexturedModel model, Vector3f position, float rotX, float rotY, float rotZ, float scale) {
        this.model = model;
        this.position = position;
        this.rotX = rotX;
        this.rotY = rotY;
        this.rotZ = rotZ;
        this.scale = scale;
    }

    public void increasePosition(float dx, float dy, float dz) {
        this.position.x += dx;
        this.position.y += dy;
        this.position.z += dz;
    }

    public void increaseRotation(float dx, float dy, float dz) {
        this.rotX += dx;
        this.rotY += dy;
        this.rotZ += dz;
    }
}
