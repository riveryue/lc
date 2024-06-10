public class ReverseString {

    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println(threadLocal.get());
            threadLocal.set("ab");
            threadLocal.set("cd");
            System.out.println(threadLocal.get());
        });
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String str = "dlrowolleh";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            res.append(str.charAt(i));
        }
        return res.toString();
    }

}
