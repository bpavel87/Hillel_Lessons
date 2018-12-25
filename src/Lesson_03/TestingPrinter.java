package Lesson_03;

public class TestingPrinter {

    public static void main(String[] args) {

        System.out.println("bla-bla");   //   send e-mail about start testing my Laser Printer

        testPrinter();

    }

    public static void testPrinter() {
        LaserPrinter.turnOn();
        LaserPrinter.setPageFormat("A5");
        LaserPrinter.testPage();

        LaserPrinter.setPageFormat("A4");
        LaserPrinter.testPage();

        LaserPrinter.setPageFormat("A3");
        LaserPrinter.testPage();

        LaserPrinter.turnOff();

    }
}
