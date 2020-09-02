package texturesClass;

import lombok.Data;
import lombok.NoArgsConstructor;
import renderEngine.RawModel;

@Data
@NoArgsConstructor
public class TexturedModel {

    private RawModel rawModel;

    private  ModelTexture texture;

    public TexturedModel(RawModel model, ModelTexture texture) {
        this.rawModel = model;
        this.texture = texture;
    }
}
