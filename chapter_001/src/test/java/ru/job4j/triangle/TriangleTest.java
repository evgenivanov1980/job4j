package ru.job4j.triangle;

import org.junit.Test;
import ru.job4j.condition.Point;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {
    /**
     * Проверка вычисления площади если треугольник существует.
     */
     @Test
        public void whenAreaSetThreePointsThenTriangleArea() {
            // Создаем объект треугольник.
            Triangle triangle = new Triangle();
            // Вычисляем площадь.
            double result = triangle.area(0, 0, 0, 2, 2, 0);
            // Задаем ожидаемый результат.
            double expected = 2D;
            //Проверяем результат и ожидаемое значение.
            assertThat(result, closeTo(expected, 0.1));
        }
    }
