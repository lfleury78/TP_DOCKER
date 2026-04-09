package hello.hello;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests Carré")
class SquareTest {
    
    @Test
    @DisplayName("Doit créer un carré avec un côté valide")
    void testValidSquareCreation() {
        Square square = new Square(5.0);
        assertNotNull(square);
        assertEquals(5.0, square.getSide());
    }
    
    @Test
    @DisplayName("Doit calculer l'aire correctement")
    void testSquareArea() {
        Square square = new Square(5.0);
        assertEquals(25.0, square.getArea(), 0.001);
    }
    
    @Test
    @DisplayName("Doit calculer le périmètre correctement")
    void testSquarePerimeter() {
        Square square = new Square(5.0);
        assertEquals(20.0, square.getPerimeter(), 0.001);
    }
    
    @Test
    @DisplayName("Doit retourner le bon nom")
    void testSquareName() {
        Square square = new Square(5.0);
        assertEquals("Square", square.getName());
    }
    
    @Test
    @DisplayName("Doit lever une exception pour un côté négatif")
    void testNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> new Square(-5.0));
    }
    
    @Test
    @DisplayName("Doit lever une exception pour un côté nul")
    void testZeroSide() {
        assertThrows(IllegalArgumentException.class, () -> new Square(0.0));
    }
    
    @Test
    @DisplayName("Doit fonctionner avec un côté décimal")
    void testDecimalSide() {
        Square square = new Square(2.5);
        assertEquals(6.25, square.getArea(), 0.001);
        assertEquals(10.0, square.getPerimeter(), 0.001);
    }
    
    @Test
    @DisplayName("Doit fonctionner avec un côté unitaire")
    void testUnitSquare() {
        Square square = new Square(1.0);
        assertEquals(1.0, square.getArea(), 0.001);
        assertEquals(4.0, square.getPerimeter(), 0.001);
    }
}
