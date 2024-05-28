/**
 * Test class to test the MyLine class.
 */
public class TestMyLine {
    public static void main(String[] args) {
        // Create an instance of MyLine
        MyLine line = new MyLine(1, 2, 3, 4);

        // Test getBegin and getEnd methods
        System.out.println(line.getBegin());  // Expected output: (1, 2)
        System.out.println(line.getEnd());    // Expected output: (3, 4)

        // Test getBeginX, getBeginY, getEndX, getEndY methods
        System.out.println(line.getBeginX());  // Expected output: 1
        System.out.println(line.getBeginY());  // Expected output: 2
        System.out.println(line.getEndX());    // Expected output: 3
        System.out.println(line.getEndY());    // Expected output: 4

        // Test setBegin and setEnd methods
        line.setBegin(5, 6);
        line.setEnd(7, 8);
        System.out.println(line.getBegin());  // Expected output: (5, 6)
        System.out.println(line.getEnd());    // Expected output: (7, 8)

        // Test setBeginX, setBeginY, setEndX, setEndY methods
        line.setBeginX(9);
        line.setBeginY(10);
        line.setEndX(11);
        line.setEndY(12);
        System.out.println(line.getBegin());  // Expected output: (9, 10)
        System.out.println(line.getEnd());    // Expected output: (11, 12)

        // Test getLength method
        System.out.println(line.getLength());  // Expected output: distance between (9, 10) and (11, 12)

        // Test toString method
        System.out.println(line);  // Expected output: MyLine[begin=(9, 10), end=(11, 12)]
    }
}
