import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter size of collection, number N:");
        Integer sizeCollection = scanner1.nextInt();
        List<Integer> list = getIntegerList(sizeCollection);
        System.out.println(list);
        Integer min = getMinimum(list);
        System.out.println("Min number is " + min);

    }

    public static List<Integer> getIntegerList(Integer sizeCollection) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < sizeCollection; i++) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter number:");
            Integer number = scanner2.nextInt();
            list.add(number);
        }
        return list;
    }

    public static Integer getMinimum(List<Integer> list) {
        Integer min = list.get(0);
        for (Integer temp : list) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }
}
