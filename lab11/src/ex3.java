import java.util.ArrayList;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Иванов", 3));
        list1.add(new Student("Петров", 1));
        list1.add(new Student("Сидаров", 2));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Федотов", 4));
        list2.add(new Student("Еще кто-то", 5));

        List<Student> mergedList = mergeSort(list1, list2);

        System.out.println("Объединенный и отсортированный список студентов:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            Student student1 = list1.get(i);
            Student student2 = list2.get(j);

            if (student1.getId() < student2.getId()) {
                mergedList.add(student1);
                i++;
            } else {
                mergedList.add(student2);
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
