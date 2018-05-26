package edu.danielhewitson.advancedjava;

/**
 * Hello world!
 *
 */
public class TShirt {

    private String size;
    private String color;
    private String style;

    /**
     * Constructor that creates a T-Shirt instance
     *
     * @param size                      The size of a t-shirt as a String
     * @param color                     The color of the t-shirt as a String
     * @param style                     The style of the T-Shirt as a String
     */

    public TShirt(String size, String color, String style){
        this.color = color;
        this.size = size;
        this.style = style;
    }

    /**
     *
     * @return the color of the t-shirt
     * @return the size of the t-shirt
     * @return the style of the t-shirt
     */
    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getStyle() {
        return style;
    }


    /**
     *
     * @return true if the t-shirt is white, false if otherwise
     */
    public boolean isWhite(){

        if(color.toLowerCase() == "white" )
            return true;
        else
            return false;
    }

    /**\
     *
     * @return true if t-shirt is size large, false if otherwise
     */
    public boolean isLarge() {

        if(size.toUpperCase() == "L")
            return true;
        else
            return false;
    }
}
