package playground;

public class NullPointerMystery {

    public static String getValue() {
        return null;
    }

    public static void main(String[] args) {
        long time = System.currentTimeMillis();


        try {
            Exception previous = null;
            while (true) {

                try {
                    getValue().toUpperCase().toLowerCase();
                } catch (Exception e) {
                    e.printStackTrace();
                    if (e == previous) {
                        System.out.println("We have seen that before");
                        return;
                    }
                    previous = e;
                }
            }
        } finally {
            time = System.currentTimeMillis() - time;
            System.out.println("time = " + time + "ms");
        }

    }


}
