package com.home.sunke.homemanager.task;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by sunke on 19-5-21.
 */
public class TaskManager {
    private static volatile TaskManager instance;
    private List<Task> mTasks = new ArrayList<>();
    private TaskManager() {
    }

    public static TaskManager getInstance(){
        if(instance == null){
            synchronized (TaskManager.class){
                instance = new TaskManager();
            }
        }
        return instance;
    }

    public void addTaskToList(Task task){
        mTasks.add(task);
    }

    public Task getTaskFromList(UUID id){
        for(Task task: mTasks){
            if(task.getUUID().equals(id)){
                return task;
            }
        }
        return null;
    }
}
