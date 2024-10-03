public class EX4 {
    public static double findAverage(int [] arr) {
        try {
            if (arr == null || arr.length == 0) {
                return Double.NaN;
            }
            int sum = 0;
            for (int j : arr) {
                sum += j;
            }
            return sum / arr.length;
        } catch (Exception e) {
            System.out.println("Ошибка");
            return Double.NaN;
        }
    }
}
