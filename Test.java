public class Test {
    static class PhysicalThread extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

        public static void main(String[] args) {
            PhysicalThread p1 = new PhysicalThread();
            p1.start();
        }


}
