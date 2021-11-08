package com.everis.dar.junior.academy.ms.todo.list;

import java.util.List;
import java.util.Optional;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Class used to control the different requests related to
 * our tasks (get,post,put,delete).
 * @author everis.
 *
 */
@CrossOrigin(origins = "*")
@RestController
public class TaskController {


	/**
	 * Object used to access task data from the repository.
	 */
	@Autowired
	TaskRepository taskRepository;

	/**
	 * Service used to list all the tasks.
	 * @return All the tasks.
	 */
	@GetMapping("/tasks")
	public List<Task> getTasks() {
		return (List<Task>) taskRepository.findAll();
	}

	/**
	 * Service used to find one task in the database using its ID.
	 * @param id Task ID searched.
	 * @return Task Object.
	 */
	@GetMapping("/tasks/{id}")
	public Optional<Task> getTaskById(@PathVariable final Long id) {
		return taskRepository.findById(id);
	}

	/**
	 * Service used to create new tasks.
	 * @param task New task. ID param is not necesary.
	 * @return New task stored including the generated ID.
	 */
	@PostMapping("/tasks")
	public Task addTask(@RequestBody final Task task) {
		return taskRepository.save(task);
	}

	/**
	 * Service used to update an existing task.
	 * @param task existing task with the new data.
	 * @return Updated task stored including updated data.
	 */
	@PutMapping("/tasks")
	public Task updateTask(@RequestBody final Task task) {
		return taskRepository.save(task);
	}


	/**
	 * Service used to delete a task using its ID.
	 * @param id
	 */
	@DeleteMapping("/tasks")
	public void deleteTaskbyId(@RequestParam final Long id) {
		taskRepository.deleteById(id);
	}


	/**
	 * Service used for delete an existing Task.
	 * @param task Task to delete.
	 */
	@Hidden
	@DeleteMapping("/tasksD")
	public void deleteTask(@RequestBody final Task task) {
		taskRepository.delete(task);
	}

	/**
	 * Service used to delete all tasks from the repository.
	 */
	@Hidden
	@DeleteMapping("/allTasks")
	public void deleteAll() {
		taskRepository.deleteAll();
	}

}
