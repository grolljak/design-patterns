package presentation.decorator;

import java.awt.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class Camera {

    private final Function<Color, Color> filter;

    public Camera(Function<Color, Color>... filters) {
        this.filter = Stream.of(filters).reduce(Function.identity(), Function::andThen);
    }

    public Color snap(Color input) {
        return filter.apply(input);
    }

}
