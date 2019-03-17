package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.triangle.Triangle;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenZeroAndTenThenTen() {
        // Создаем объект треугольник
        Triangle triangle = new Triangle();
        // Вычисляем площадь треугольника
        double result = triangle.area(0, 0, 0, 2, 2, 0);
        // Задаем ожидаемый  результат
        double expected = 2D;
        // Проверяем результат и ожидаемое значение
        assertThat(result, closeTo(expected, 0.1));
    }
}
