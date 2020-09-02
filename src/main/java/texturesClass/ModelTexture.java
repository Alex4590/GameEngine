package texturesClass;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Текстура модели
 */
@Data
@NoArgsConstructor
public class ModelTexture {

    /**
     * Идентификатор текстуры
     */
    private  int textureID;

    public ModelTexture (int id) {
        this.textureID = id;
    }
}
