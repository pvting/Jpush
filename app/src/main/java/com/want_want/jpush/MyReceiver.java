package com.want_want.jpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.json.JSONObject;

import cn.jpush.android.api.JPushInterface;


/**
 * Created by 00282738 on 2015/11/25.
 */
public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (JPushInterface.ACTION_NOTIFICATION_OPENED.equals(intent.getAction())) {
            intent = new Intent(context,MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }
    }
}
