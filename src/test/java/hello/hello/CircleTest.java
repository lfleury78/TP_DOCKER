package hello.hello;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests Cercle")
class CircleTest {
    
    private static final double EPSILON = 0.001;
    
    @Test
    @DisplayName("Doit créer un cercle avec un rayon valide")
    void testValidCircleCreation() {
        Circle circle = new Circle(5.0);
        assertNotNull(circle);
        assertEquals(5.0, circle.getRadius());
    }
    
    @Test
    @DisplayName("Doit calculer l'aire correctement")
    void testCircleArea() {
        Circle circle = new Circle(5.0);
        double expectedArea = Math.PI * 25;
        assertEquals(expectedArea, circle.getArea(), EPSILON);
    }
    
    @Test
    @DisplayName("Doit calculer le périmètre (circonférence) correctement")
    void testCirclePerimeter() {
        Circle circle = new Circle(5.0);
        double expectedPerimeter = 2 * Math.PI * 5.0;
        assertEquals(expectedPerimeter, circle.getPerimeter(), EPSILON);
    }
    
    @Test
    @DisplayName("Doit retourner le bon nom")
    void testCircleName() {
        Circle circle = new Circle(5.0);
        assertEquals("Circle", circle.getName());
    }
    
    @Test
    @DisplayName("Doit lever une exception pour un rayon négatif")
    void testNegativeRadius() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(-5.0));
    }
    
    @Test
    @DisplayName("Doit lever une exception pour un rayon nul")
    void testZeroRadius() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(0.0));
    }
    
    @Test
    @DisplayName("Doit fonctionner avec un rayon décimal")
    void testDecimalRadius() {
        Circle circle = new Circle(2.5);
        double expectedArea = Math.PI * 2.5 * 2.5;
        double expectedPerimeter = 2 * Math.PI * 2.5;
        assertEquals(expectedArea, circle.getArea(), EPSILON);
        assertEquals(expectedPerimeter, circle.getPerimeter(), EPSILON);
    }
    
    @Test
    @DisplayName("Doit calculer l'aire pour un cercle unitaire")
    void testUnitCircleArea() {
        Circle circle = new Circle(1.0);
        assertEquals(Math.PI, circle.getArea(), EPSILON);
    }
}
