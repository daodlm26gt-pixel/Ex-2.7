import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args) {
        // Kiểm thử các Constructor[cite: 1]
        MyLine l1 = new MyLine(1, 2, 4, 6);
        System.out.println("l1: " + l1); // MyLine[begin=(1,2),end=(4,6)][cite: 1]

        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);
        MyLine l2 = new MyLine(p1, p2);
        System.out.println("l2: " + l2);

        // Kiểm thử Getter và Setter[cite: 1]
        l1.setBeginX(2);
        l1.setBeginY(3);
        l1.setEndX(5);
        l1.setEndY(7);
        System.out.println("Sau khi setX/Y l1: " + l1);
        System.out.println("Begin X: " + l1.getBeginX() + ", Y: " + l1.getBeginY());
        System.out.println("End X: " + l1.getEndX() + ", Y: " + l1.getEndY());

        l1.setBeginXY(0, 0);
        l1.setEndXY(3, 4);
        System.out.println("Sau khi setXY l1: " + l1);
        System.out.println("Begin XY: " + Arrays.toString(l1.getBeginXY()));
        System.out.println("End XY: " + Arrays.toString(l1.getEndXY()));

        // Kiểm thử getLength() và getGradient()[cite: 1]
        System.out.println("Độ dài l1 (kỳ vọng 5.0): " + l1.getLength());
        System.out.printf("Độ dốc l1 (radian): %.4f%n", l1.getGradient());
    }
}