public class run {
    public static void main(String[] args) {
        stopWatch stop = new stopWatch(0, 0);

        System.out.println("Start " + stop.start());
        System.out.println("-----");
        System.out.println("-----");
        System.out.println("-----");
        System.out.println("-----");
        System.out.println("-----");
        System.out.println("-----");
        System.out.println("-----");
        System.out.println("-----");
        System.out.println("-----");
        System.out.println("-----");
        System.out.println("-----");
        System.out.println("Stop " + stop.stop());

        System.out.println("stop - start : " + stop.getElapsedTime());
    }
}
