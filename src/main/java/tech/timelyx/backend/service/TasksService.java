package tech.timelyx.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.timelyx.backend.model.Tasks;
import tech.timelyx.backend.repository.TasksRepository;

import java.util.List;

@Service
public class TasksService {
    private final TasksRepository tasksRepository;

    @Autowired
    public TasksService(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    public List<Tasks> getAllTasks() {
        return tasksRepository.findAll();
    }

    public Tasks getTasksById(String id) {
        return tasksRepository.findById(id).orElse(null);
    }

    public Tasks createTasks(Tasks task) {
        return tasksRepository.save(task);
    }

    public Tasks updateTasks(String id, Tasks task) {
        Tasks existingTask = getTasksById(id);
        if (existingTask == null) {
            return null;
        }
        existingTask.setTaskId(task.getTaskId());
        existingTask.setCourseId(task.getCourseId());
        existingTask.setCourseLinked(task.isCourseLinked());
        existingTask.setData(task.getData());
        return tasksRepository.save(existingTask);
    }

    public boolean deleteTasks(String id) {
        Tasks existingTask = getTasksById(id);
        if (existingTask == null) {
            return false;
        }
        tasksRepository.delete(existingTask);
        return true;
    }
}
