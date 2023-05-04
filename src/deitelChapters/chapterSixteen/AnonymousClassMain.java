package deitelChapters.chapterSixteen;

public class AnonymousClassMain {
    public static void main(String[] args) {
        car car = new car() {
            @Override
            public void stop() {
                System.out.println("stopping");
            }

            @Override
            public void move() {
                System.out.println("moving");
            }
        };

    }

}
