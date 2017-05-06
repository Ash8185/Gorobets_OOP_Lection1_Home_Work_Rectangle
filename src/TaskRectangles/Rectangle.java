package TaskRectangles;

/**
 * Created by Eugene on 01.05.17.
 */
class Rectangle {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.width = width;
        this.height = height;
    }

    double countingPerimeter () {
        double perimeter = (height + width) * 2;
        return perimeter;
    }

    double countingArea () {
        double area = height * width;
        return area;
        }


}


