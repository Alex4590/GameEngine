package texturesClass;

import renderEngine.RawModel;

public class TexsturedModel {
    private RawModel rawModel;
    private  ModelTexture texture;

    public TexsturedModel (RawModel model, ModelTexture texture) {
        this.rawModel = model;
        this.texture = texture;
    }

    public RawModel getRawModel() {
        return rawModel;
    }

    public ModelTexture getTexture() {
        return texture;
    }

}
