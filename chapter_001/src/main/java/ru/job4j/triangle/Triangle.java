package ru.job4j.triangle;


import ru.job4j.condition.Point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {





    /**
     * Метод вычисления периметра трепугольника по длинам сторон
     * <p>
     * Формула
     * <p>
     * (a+b+c)/3
     *
     * @param a расстояние между точками a b
     * @param b расстоягние между точками a c
     * @param c расстояние между точками b c
     * @return периметр
     */

    public double period(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }


    /**
     * Метод должен вычислить площадь треугольника
     * <p>
     * Формула
     * <p>
     * V p*(p-ab)*(p-ac)*(p-bc)
     * где V - корень квадратный, для извлечения корня используется метод Math.sqrt()
     * <p>
     * return вернуть площадь треугольника, если он существует или -1
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rs = -1;
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
        double p = this.period(a, b, c);
        if (this.exist(a, b, c)) {
            rs = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rs;
    }

    /**
     * Метод проверяет существование треугольника
     *
     * @param ab Расстояние от точки а до точки b
     * @param ac Расстояние от точки до точки c
     * @param bc Расстояние от точки b до точки c
     * @return true если треугольник существует
     */

    private boolean exist(double ab, double ac, double bc) {
        return ((ab + bc) > ac) && ((bc + ac) > ab) && ((ac + ab) > bc);

    }
}


