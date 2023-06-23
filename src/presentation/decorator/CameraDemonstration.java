package presentation.decorator;

import java.awt.*;

public class CameraDemonstration {

    private static void print(Camera camera) {
        System.out.println(camera.snap(new Color(33, 112, 32)));
    }

    public static void main(String[] args) {
        print(new Camera());
        print(new Camera(Color::darker));
        print(new Camera(Color::darker, Color::darker));
    }
}
