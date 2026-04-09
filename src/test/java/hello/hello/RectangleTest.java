package hello.hello;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests Rectangle")
class RectangleTest {
    
    @Test
    @DisplayName("Doit créer un rectangle avec des dimensions valides")
    void testValidRectangleCreation() {
        Rectangle rect = new Rectangle(5.0, 3.0);
        assertNotNull(rect);
        assertEquals(5.0, rect.getLength());
        assertEquals(3.0, rect.getWidth());
    }
    
    @Test
    @DisplayName("Doit calculer l'aire correctement")
    void testRectangleArea() {
        Rectangle rect = new Rectangle(4.0, 6.0);
        assertEquals(24.0, rect.getArea(), 0.001);
    }
    
    @Test
    @DisplayName("Doit calculer le périmètre correctement")
    void testRectanglePerimeter() {
        Rectangle rect = new Rectangle(4.0, 6.0);
        assertEquals(20.0, rect.getPerimeter(), 0.001);
    }
    
    @Test
    @DisplayName("Doit retourner le bon nom")
    void testRectangleName() {
        Rectangle rect = new Rectangle(5.0, 3.0);
        assertEquals("Rectangle", rect.getName());
    }
    
    @Test
    @DisplayName("Doit lever une exception pour une longueur négative")
    void testNegativeLength() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5.0, 3.0));
    }
    
    @Test
    @DisplayName("Doit lever une exception pour une longueur nulle")
    void testZeroLength() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0.0, 3.0));
    }
    
    @Test
    @DisplayName("Doit lever une exception pour une largeur négative")
    void testNegativeWidth() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5.0, -3.0));
    }
    
    @Test
    @DisplayName("Doit lever une exception pour une largeur nulle")
    void testZeroWidth() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5.0, 0.0));
    }
    
    @Test
    @DisplayName("Doit fonctionner avec des dimensions décimales")
    void testDecimalDimensions() {
        Rectangle rect = new Rectangle(2.5, 3.5);
        assertEquals(8.75, rect.getArea(), 0.001);
        assertEquals(12.0, rect.getPerimeter(), 0.001);
    }
}
