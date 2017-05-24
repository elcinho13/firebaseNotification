package com.example.elcio.organizenotification;


import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class InstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "InstanceIDService";

    @Override
    public void onTokenRefresh() {
        String refreshedToken =  FirebaseInstanceId.getInstance().getToken();
        Log. d ( TAG , "token"  + refreshedToken);

        sendRegistrationToServer(refreshedToken);

    }

    private void sendRegistrationToServer (String token){
        // TODO: Implementar este método para enviar o token para o servidor do app.
    }


}
