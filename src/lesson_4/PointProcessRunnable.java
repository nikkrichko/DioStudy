package lesson_4;

public class PointProcessRunnable extends Thread {

    private Point point;

    private final int item;

    private boolean isAlive = true;

    public PointProcessRunnable(Point point, int item) {
        this.point = point;
        this.item = item;
    }

    @Override
    public void run() {
        while (isAlive) {
            point = point.setX(item);
            point = point.setY(item);
            yield();
        }
//        point.setY(item);
    }

    public void stopThread() {
        isAlive = false;
    }

}
