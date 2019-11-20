package solidSample.LPrinciple;

/****
 *   Created by Feng Chen on 11/5/2019
 */
public class Rectangle {

    protected long width;
    protected long height;

    public Rectangle(long width,long height){
        this.width = width;
        this.height = height;
    };

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }
}
