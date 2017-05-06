package TaskRectangles;

/**
 * Created by Eugene on 01.05.17.
 */
public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,3);
        Rectangle rectangle2 = new Rectangle(3,4);
        Rectangle rectangle3 = new Rectangle(4,5);

        System.out.println("Площадь rec3 = " + rectangle3.countingArea());
        System.out.println("Периметр rec3 = " + rectangle3.countingPerimeter());
        System.out.println("Площадь rec2 = " + rectangle2.countingArea());
        System.out.println("Периметр rec2 = " + rectangle2.countingPerimeter());
        System.out.println("Площадь rec1 = " + rectangle1.countingArea());
        System.out.println("Периметр rec1 = " + rectangle1.countingPerimeter());

        Rectangles rectangles = new Rectangles();

        rectangles.createRectangle(rectangle1);
        rectangles.createRectangle(rectangle2);
        rectangles.createRectangle(rectangle3);

        System.out.println("Общая площадь прямоугольников = " + rectangles.countingArea());
        System.out.println("Общий периметр прямоугольников = " + rectangles.countingPerimetr());

    }
}
