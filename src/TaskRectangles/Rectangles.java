package TaskRectangles;

import java.util.ArrayList;

/**
 * Created by Eugene on 01.05.17.
 */
public class Rectangles {
    ArrayList <Rectangle> rectangles = new ArrayList ();

    public void createRectangle (Rectangle rec) {
        rectangles.add(rec);
    }

    public double countingArea () {
        double area = 0;
        for (Rectangle allRectangles: rectangles) {
            area += allRectangles.countingArea();
        }
        return area;
    }

    public double countingPerimetr () {
        double perimeter = 0;
        for (Rectangle allRectangles: rectangles) {
            perimeter += allRectangles.countingPerimeter();
        }
        return perimeter;
    }

}
