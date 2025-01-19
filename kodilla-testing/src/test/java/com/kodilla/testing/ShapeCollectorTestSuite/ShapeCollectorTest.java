package com.kodilla.testing.ShapeCollectorTestSuite;
import com.kodilla.testing.shape.*;
import org.junit.jupiter.api.*;

public class ShapeCollectorTest {
    private static int testCounter = 0;
    @BeforeEach
    public void before() {
        testCounter++;
        System.out.println("Executing test " + testCounter);
    }
    @AfterEach
    public void after() {
        System.out.println("Test End");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("This is a beginning of all tests");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("All Test of Shape Collector finished");

    }
    @Test //1
    void AddFigureTest() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square(5);
        Shape circle = new Circle(5);
        //When
        collector.addFigure(square);
        collector.addFigure(circle);
        //Then
        Assertions.assertEquals(2 , collector.size());
    }
    @Test //2
    void RemoveFigureTest() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square(5);
        Shape circle = new Triangle(5, 5);
        //When
        collector.addFigure(square);
        collector.addFigure(circle);
        collector.removeFigure(square);
        //Then
        Assertions.assertEquals(1 , collector.size());
    }
    @Test //3
    void GetFigureTest() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square(5);
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(5, 5);
        Shape square2 = new Square(4);
        //When
        collector.addFigure(square);
        collector.addFigure(circle);
        collector.addFigure(triangle);
        collector.addFigure(square2);
        collector.getFigure(2);
        //Then
        Assertions.assertEquals(circle, collector.getFigure(1));
    }
    @Test //4
    void ShowFigureTest() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square(5);
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(5, 5);
        //When
        collector.addFigure(square);
        collector.addFigure(circle);
        collector.addFigure(triangle);
        //Then
        Assertions.assertEquals("Square Circle Triangle " , collector.showFigures());
    }
}