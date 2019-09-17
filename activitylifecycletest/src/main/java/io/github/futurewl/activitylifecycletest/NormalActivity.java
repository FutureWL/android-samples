package io.github.futurewl.activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
    }
}
