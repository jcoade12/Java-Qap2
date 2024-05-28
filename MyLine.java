/**
 * The MyLine class models a line with a begin point and an end point.
 * It uses two MyPoint instances for its begin and end points.
 */
public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    /**
     * Constructor to initialize the line with the given coordinates.
     * @param x1 x-coordinate of the begin point.
     * @param y1 y-coordinate of the begin point.
     * @param x2 x-coordinate of the end point.
     * @param y2 y-coordinate of the end point.
     */
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    /**
     * Gets the begin point of the line.
     * @return Begin point.
     */
    public MyPoint getBegin() {
        return begin;
    }

    /**
     * Gets the end point of the line.
     * @return End point.
     */
    public MyPoint getEnd() {
        return end;
    }

    /**
     * Sets the begin point of the line.
     * @param x x-coordinate of the begin point.
     * @param y y-coordinate of the begin point.
     */
    public void setBegin(int x, int y) {
        this.begin.setXY(x, y);
    }

    /**
     * Sets the end point of the line.
     * @param x x-coordinate of the end point.
     * @param y y-coordinate of the end point.
     */
    public void setEnd(int x, int y) {
        this.end.setXY(x, y);
    }

    /**
     * Gets the x-coordinate of the begin point.
     * @return x-coordinate of the begin point.
     */
    public int getBeginX() {
        return begin.getX();
    }

    /**
     * Gets the y-coordinate of the begin point.
     * @return y-coordinate of the begin point.
     */
    public int getBeginY() {
        return begin.getY();
    }

    /**
     * Gets the x-coordinate of the end point.
     * @return x-coordinate of the end point.
     */
    public int getEndX() {
        return end.getX();
    }

    /**
     * Gets the y-coordinate of the end point.
     * @return y-coordinate of the end point.
     */
    public int getEndY() {
        return end.getY();
    }

    /**
     * Sets the x-coordinate of the begin point.
     * @param x x-coordinate of the begin point.
     */
    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    /**
     * Sets the y-coordinate of the begin point.
     * @param y y-coordinate of the begin point.
     */
    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    /**
     * Sets the x-coordinate of the end point.
     * @param x x-coordinate of the end point.
     */
    public void setEndX(int x) {
        this.end.setX(x);
    }

    /**
     * Sets the y-coordinate of the end point.
     * @param y y-coordinate of the end point.
     */
    public void setEndY(int y) {
        this.end.setY(y);
    }

    /**
     * Calculates the length of the line.
     * @return Length of the line.
     */
    public double getLength() {
        return begin.distance(end);
    }

    /**
     * Returns a string representation of the line.
     * @return String representation in the form MyLine[begin=(x1, y1), end=(x2, y2)].
     */
    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}
