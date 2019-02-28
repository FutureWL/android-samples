package io.github.futurewl.broadcastbestpractice2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.github.futurewl.broadcastbestpractice2.R;
import io.github.futurewl.broadcastbestpractice2.activity.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button forceOffline = findViewById(R.id.force_offline);
        forceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("io.github.futurewl.broadcastbestpractice2.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });
    }
}
