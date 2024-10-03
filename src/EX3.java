import java.util.Arrays;

public class EX3 {
    public static String [] sortString(String[] s) {
        try {
            if (s == null || s.length == 0){
                return new String[0];
            }
            Arrays.sort(s);
            return s;
            } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    }
