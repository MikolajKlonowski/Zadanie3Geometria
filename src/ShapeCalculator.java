public class ShapeCalculator {
    double squareArea(Square square) {
        double pole = square.bokA*square.bokA;
        return pole;

    }

    double circleArea(Circle cirle) {
        return cirle.pole;
    }

    double trianglePerimeter(Triangle triangle) {
        return triangle.obwod;
    }

    double rectPerimeter(Rectangle rectangle) {
        return rectangle.obwod;
    }
}
