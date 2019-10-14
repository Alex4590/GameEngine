package shaders;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ShaderProgram {

    private  int programID;
    private int vertexShaderID;
    private int fragmentShaderID;

    private  static  int loadShader(String file, int type) {
        StringBuilder shaderSource = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                shaderSource.append(line).append("\n");
            }

            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int shaderID = GL20.glCreateShader(type);
        GL20.glShaderSource(shaderID, shaderSource);
        GL20.glCompileShader(shaderID);

        if (GL20.glGetShaderi(shaderID, GL20.GL_COMPILE_STATUS) == GL11.GL_FALSE) {
           System.out.println(GL20.glGetShaderInfoLog(shaderID, 500));
           System.out.println("Could not compiled shader.");
           System.exit(-1);
        }

        return  shaderID;
    }

}
