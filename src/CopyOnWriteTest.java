import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteTest {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add("string " + i);
        }
        new Thread(() -> {
            while (true) {
                if (list.size() > 0) {
                    String content = list.get(list.size() - 1);
                } else {
                    break;
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                if (list.size() <= 0) {
                    break;
                }
                list.remove(0);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
