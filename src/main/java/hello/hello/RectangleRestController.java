package hello.hello;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RectangleRestController {

    @GetMapping("/rectangles/area")
    public Map<String, Double> getRectangleArea(
            @RequestParam double length,
            @RequestParam double width) {
        Rectangle rectangle = new Rectangle(length, width);
        return Map.of("area", rectangle.getArea());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleIllegalArgument(IllegalArgumentException ex) {
        return Map.of("error", ex.getMessage());
    }
}
