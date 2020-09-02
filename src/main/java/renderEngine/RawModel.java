package renderEngine;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Необработанная модель
 */
@Data
@NoArgsConstructor
public class RawModel {

    /**
     * Идентификатор VAO
     */
    private int vaoID;

    /**
     * Колличество вершин
     */
    private int vertexCount;

    public RawModel(int vaoID, int vertexCount) {
        this.vaoID = vaoID;
        this.vertexCount = vertexCount;
    }
}
