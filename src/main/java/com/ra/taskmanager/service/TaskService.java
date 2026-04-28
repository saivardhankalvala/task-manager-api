package com.ra.taskmanager.service;
import com.ra.taskmanager.model.Task;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private List<Task> tasks = new ArrayList<>();

    // GET all tasks
    public List<Task> getAllTasks() {
        return tasks;
    }

    // ADD new task
    public Task addTask(Task task) {
        tasks.add(task);
        return task;
    }

public Task updateTask(int id, Task updatedTask) {
    for (Task task : tasks) {
        if (task.getId() == id) {
            task.setTitle(updatedTask.getTitle());
            task.setDescription(updatedTask.getDescription());
            task.setStatus(updatedTask.getStatus());
            return task;
        }
    }
    return null;
}
public String deleteTask(int id) {
    tasks.removeIf(task -> task.getId() == id);
    return "Task deleted";
}
}