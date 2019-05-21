package com.home.sunke.homemanager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sunke on 19-5-21.
 */
public class TaskListActivity extends AppCompatActivity {
    private static final String FRAGMENT_TASK_LIST= "com.home.sunke.homemanager.TaskListFragment";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
        if(getSupportFragmentManager().findFragmentById(R.id.fragment_task_list_container) == null){
            getSupportFragmentManager().beginTransaction().add(new TaskListFragment(),FRAGMENT_TASK_LIST).commit();
        }
    }
}
