import java.util.Random;

public class Terning {

    private static Random random = new Random();

    public static int trill(){
        return random.nextInt(6) + 1;
    }
}
