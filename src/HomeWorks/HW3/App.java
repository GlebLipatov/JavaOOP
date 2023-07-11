package HomeWorks.HW3;

import HomeWorks.HW3.Creator.CreatorGroup;
import HomeWorks.HW3.Creator.CreatorSteam;
import HomeWorks.HW3.Creator.CreatorStudent;
import HomeWorks.HW3.StudetDomen.Student;
import HomeWorks.HW3.StudetDomen.StudentGroup;
import HomeWorks.HW3.StudetDomen.StudentSteam;

import java.util.Collections;
import java.util.concurrent.ForkJoinPool;

public class App {

    public static void main(String[] args) {
        // Это минимальные и максимальные значения для рандома в Creator... классах,
        // что бы не в ручную создавать экземляры студентов, групп и потоков
        int groupSizeMin = 5;
        int groupSizeMax = 10;
        int steamSizeMin = 5;
        int steamSizeMax = 10;

        // Создаем экземпляр класса CreatorSteam который может создать поток, группы и студентов автоматически
        CreatorSteam creatorSteam = new CreatorSteam(
                groupSizeMin, groupSizeMax,
                steamSizeMin, steamSizeMax);

        // Вызываем метод создания потока, групп и студентов
        StudentSteam studentSteam = creatorSteam.create();

        System.out.println("\n========== До сортировки ==========\n");
        // Проверяем как работает итератор груп в потоке
        for (var steam : studentSteam.getSteam()) {
            System.out.println(steam.toString());
        }

        // Сортируем группы по кол-ву и номеру группы
        Collections.sort(studentSteam.getSteam());

        System.out.println("\n\n========== После сортировки ==========\n\n");

        // проверяем как работает компоратор групп, и переопределенный toString() в потоке, группе и студенте
        System.out.println(studentSteam.toString());




    }
}
