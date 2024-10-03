public class EX2 {
    public static boolean isPalidrom(String s) {
        try {
            String s1 = s.toLowerCase().replace(" ", "");
            boolean isPalidrom = true;
            for (int i = 0; i < s1.length()/2; i++) {
                if (s1.charAt(i) != s1.charAt(s1.length() - i - 1)) {
                    isPalidrom = false;
                    break;
                }
            }
            return isPalidrom;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
