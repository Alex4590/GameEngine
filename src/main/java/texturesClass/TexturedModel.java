package texturesClass;

import lombok.Data;
import lombok.NoArgsConstructor;
import renderEngine.RawModel;

/**
 *  Модель с текстурой
 */
@Data
@NoArgsConstructor
public class TexturedModel {

    /**
     * Необработанная модель
     */
    private RawModel rawModel;

    /**
     * Текстура модели
     */
    private  ModelTexture texture;

    public TexturedModel(RawModel model, ModelTexture texture) {
        this.rawModel = model;
        this.texture = texture;
    }
}
