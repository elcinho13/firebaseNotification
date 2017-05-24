package com.example.elcio.organizenotification;

import android.util.Log;

import com.firebase.jobdispatcher.JobService;


public class FirebaseJobService extends JobService {

    private static final String TAG = "FirebaseJobService";

     @Override
    public boolean onStartJob(com.firebase.jobdispatcher.JobParameters job) {
        Log.d( TAG , " Execução da tarefa de execução longa no trabalho agendado " );
        // TODO (desenvolvedor): adicione tarefa de execução longa aqui.
        return  false ;
    }

    @Override
    public boolean onStopJob(com.firebase.jobdispatcher.JobParameters job) {
        return false;
    }
}
