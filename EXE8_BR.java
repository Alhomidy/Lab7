import java.awt.*;

public class EXE8_BR extends Rectangle {
        private double Perimeter;
        private double Area;

        public EXE8_BR(int width, int height) {
            super(width, height);
            Perimeter=2*(width+height);
            Area=width*height;
        }

        public double getPerimeter() {
            return Perimeter;
        }

        public double getArea() {
            return Area;
        }
}
