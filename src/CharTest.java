/**
 * Created by User on 03.03.2017.
 */
public class CharTest {
    public static void main (String[] args){
        char c = 'A'; // 0 .. 2^16-1
        int b = (int) c;
        System.out.println(c);
        c++;
        System.out.println(b);
        System.out.println(c);
    }
}
