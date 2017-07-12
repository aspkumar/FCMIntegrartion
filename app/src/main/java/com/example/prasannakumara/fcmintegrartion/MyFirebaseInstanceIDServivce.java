package com.example.prasannakumara.fcmintegrartion;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by PrasannakumarA on 7/12/2017.
 */

public class MyFirebaseInstanceIDServivce extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        String recentToken= FirebaseInstanceId.getInstance().getToken();
        Log.d("regToken",recentToken);

    }
}
