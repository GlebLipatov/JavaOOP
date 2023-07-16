package HomeWorks.HW3.Services;

import java.util.List;

public interface iPersonService<T> {
    List<T> getAll();
    void create(String firstName, String lastName, int age);
}
