package models;

import play.data.validation.Constraints.Required;

import java.util.ArrayList;
import java.util.List;
import play.data.validation.Constraints.*;

public class Task {

    private Long   id;

    @Required
    private String label;

    public static List<Task> all() {
        return new ArrayList<Task>();
    }

    public static void create(Task task) {


    }

    public static void delete(Long id) {

    }
}
