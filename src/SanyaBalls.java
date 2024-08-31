import java.util.Random;

public class SanyaBalls {
    public void getBalls() {
        for (int i = 1; i < 4; i++) {
            System.out.print("Кусок вылетел со скоростью ");
            if (i==1) {
                System.out.print("7 метров в секунду.\n");
            } else if (i==2) {
                System.out.print("12 метров в секунду.\n");
            } else if (i==3) {
                System.out.println("15 метров в секунду.\n");
            }
        }
    }

    public void playBalls() {
        int count = 0;
        while (true) {
            int right_ball = new Random().nextInt(1, 50);
            count++;
            if (right_ball==30) {
                System.out.println("Бердаменчик без яйца. Для этого потребовалось " + count + " попыток");
                break;
            }
        }
    }

    public void countBalls() {
        int sum = 0;
        for (int i = 222; i < 445; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
