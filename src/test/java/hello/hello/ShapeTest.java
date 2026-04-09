package hello.hello;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests d'intégration des formes")
class ShapeTest {
    
    @Test
    @DisplayName("Doit gérer plusieurs formes ensemble")
    void testMultipleShapes() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4.0, 6.0));
        shapes.add(new Circle(5.0));
        shapes.add(new Square(3.0));
        
        assertEquals(3, shapes.size());
        assertTrue(shapes.stream().allMatch(s -> s.getArea() > 0));
        assertTrue(shapes.stream().allMatch(s -> s.getPerimeter() > 0));
    }
    
    @Test
    @DisplayName("Doit vérifier que le rectangle est une instance de Shape")
    void testRectangleIsShape() {
        Shape rect = new Rectangle(5.0, 3.0);
        assertInstanceOf(Rectangle.class, rect);
        assertInstanceOf(Shape.class, rect);
    }
    
    @Test
    @DisplayName("Doit vérifier que le cercle est une instance de Shape")
    void testCircleIsShape() {
        Shape circle = new Circle(5.0);
        assertInstanceOf(Circle.class, circle);
        assertInstanceOf(Shape.class, circle);
    }
    
    @Test
    @DisplayName("Doit vérifier que le carré est une instance de Shape")
    void testSquareIsShape() {
        Shape square = new Square(5.0);
        assertInstanceOf(Square.class, square);
        assertInstanceOf(Shape.class, square);
    }
    
    @Test
    @DisplayName("Doit comparer les aires de différentes formes")
    void testCompareAreas() {
        Rectangle rect = new Rectangle(5.0, 5.0);
        Square square = new Square(5.0);
        
        assertEquals(rect.getArea(), square.getArea(), 0.001);
    }
}
