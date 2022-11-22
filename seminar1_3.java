import java.util.Random;

public class seminar1_3 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(0,2);
            System.out.print(array[i]);
        }

        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1) count++;
            else {
                if(maxCount < count){maxCount= count; count = 0;}
            
        }
        System.out.println("\n"+maxCount);
    }
}
}