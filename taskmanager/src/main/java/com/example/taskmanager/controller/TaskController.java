package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.model.TaskStatus;
import com.example.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // ADMIN ONLY: Create and assign a task
    @PostMapping("/admin/create")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        return ResponseEntity.ok(taskService.createTask(task));
    }

    // ANY LOGGED IN USER: View tasks assigned to them using their User ID
    @GetMapping("/my-tasks/{userId}")
    public ResponseEntity<List<Task>> getMyTasks(@PathVariable String userId) {
        return ResponseEntity.ok(taskService.getTasksForUser(userId));
    }

    // ANY LOGGED IN USER: Update the status of their task
    @PutMapping("/{taskId}/status")
    public ResponseEntity<Task> updateStatus(@PathVariable String taskId, @RequestParam TaskStatus status) {
        return ResponseEntity.ok(taskService.updateTaskStatus(taskId, status));
    }
}