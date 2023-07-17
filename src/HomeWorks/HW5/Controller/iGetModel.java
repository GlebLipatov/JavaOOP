package HomeWorks.HW5.Controller;

import HomeWorks.HW5.Model.Student;

import java.util.List;

public interface iGetModel {
    /**
     * Возвращает список студентов
     * @return список студентов
     */
    public List<Student> getAllStudents();

    /**
     * Удаляет студента из базы данных
     * @param idStudent идентификационный номер студента
     * @return true если удаление выполненно, false если такого студента нет
     */
    boolean delete(long idStudent);
}
