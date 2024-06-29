package random;

public class RandomIndex {
    public static String getRandomIndex(){
        return String.valueOf((int)(Math.random()*100000000));
    }
}
