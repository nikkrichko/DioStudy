package lesson_4;


public class Main {

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        for (int i = 0; i < 10000; i++) {
//            Thread t = new Thread(new PointProcessRunnable(point, generateRandomInt(10000)));
            PointProcessRunnable t = new PointProcessRunnable(point, generateRandomInt(10000));
            PointProcessRunnable t2 = new PointProcessRunnable(point, generateRandomInt(10000));
            t.start();
//            t.run();
//            t.stop();

            t2.start();
            if (point.getX() != point.getY())
                System.out.println(point);
            t.stopThread();
            t2.stopThread();
        }
        System.out.println(point);
    }

    public static int generateRandomInt(int maxValue) {
        return (int)(Math.random()*(maxValue));
    }

}
