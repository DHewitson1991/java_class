package edu.danielhewitson.advancedjava;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit tests for the TShirt class
 *
 * @author Daniel Hewitson
 */

public class TShirtTest {

    private String size;
    private String color;
    private String style;

    /**
     * Test Setup (runs before each test)
     */

    @Before
    public void setup() {
        color = "white";
        size = "L";
        style = "v-neck";
    }

    /**\
     * Test whether the TShirt was constructed correctly
     */

    @Test
    public void testTShirtConstruction() {
        TShirt tshirt = new TShirt("L", "white", "v-neck");


        assertEquals("The Size is Correct", tshirt.getSize(), size);
        assertEquals("the color is correct", tshirt.getColor(), color);
        assertEquals("The Style is Correct", tshirt.getStyle(), style);
    }

    /**
     * Positive and Negative isWhite Tests
     */

    @Test
    public void testIsWhitePositive() {
        TShirt tshirt = new TShirt("XL", "white", "crew");
        assertTrue("The T-Shirt is White", tshirt.isWhite() );
    }

    @Test
    public void testIsWhiteNegative() {
        TShirt tshirt = new TShirt("M", "blue", "v-neck");
        assertFalse("The T-Shirt is not White", tshirt.isWhite() );

    }

    /**
     * Positive and Negative isLarge Tests
     */

    @Test
    public void testIsLargePositive() {
        TShirt tshirt = new TShirt("L", "white", "v-neck");
        assertTrue("The T-Shirt is Large", tshirt.isLarge());

    }

    @Test
    public void testIsLargeNegative() {
        TShirt tshirt = new TShirt("S", "brown", "polo");
        assertFalse("The T-Shirt is not Large", tshirt.isLarge());
    }
}
