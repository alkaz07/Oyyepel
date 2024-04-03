public class Main {
    public static void main(String[] args) {
        int[] temp = inputData();
        int maxWarmDays = findMaxLenPositive(temp);
        System.out.println("ответ "+maxWarmDays);
    }

    public static int findMaxLenPositive(int[] temp) {
        int x = 0;       //текущий счетчик теплых дней
        int maxX = 0;   // максимальное значения счетчика теплых дней
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 0){
                x++;
            }
            else {
                if(x> maxX)
                    maxX = x;
                x = 0;
            }
        }
        if(x> maxX)
            maxX = x;
        return maxX;
    }

    public static int[] inputData() {
      // int[] x = {12, 3, 0, -9, 4, 7, 8, -9, 4, 7};
      //  int[] x = {0, 1, 4, 5, 7, 8, 9};
        int[] x = {12, 3, 0, -9, 4, 7, 8, -9, 4, 7, 4, 6, 7};
        return x;
    }
}