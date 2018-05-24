public class Rectangle {
    double bokA;
    double bokB;
    double obwod;

    Rectangle(double A, double B) {
        bokA = A;
        bokB = B;
        obwod = (2 * A) + (B * 2);


    }
    double obwod (){
        double obwod1 = (2*bokB)+(2*bokA);
        return obwod1;

    }
}
