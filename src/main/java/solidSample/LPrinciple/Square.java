package solidSample.LPrinciple;

/****
 *   Created by Feng Chen on 11/5/2019
 */
public class Square extends Rectangle{
    public Square(long width, long height) {
        super(width, height);
    }

    @Override
    public void setWidth(long width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(long height) {
        this.width = width;
        this.height = width;
    }
}
