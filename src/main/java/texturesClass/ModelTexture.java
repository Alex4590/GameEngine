package texturesClass;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ModelTexture {

    private  int textureID;

    public ModelTexture (int id) {
        this.textureID = id;
    }
}
