package io.github.futurewl.uilayouttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonLinearLayoutVertical = findViewById(R.id.button_linear_layout_vertical);
        buttonLinearLayoutVertical.setOnClickListener(this);
        Button buttonLinearLayoutHorizontal = findViewById(R.id.button_linear_layout_horizontal);
        buttonLinearLayoutHorizontal.setOnClickListener(this);
        Button buttonLinearLayoutHorizontalGravity = findViewById(R.id.button_linear_layout_horizontal_gravity);
        buttonLinearLayoutHorizontalGravity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Class<?> activityClass = MainActivity.class;
        switch (v.getId()) {
            case R.id.button_linear_layout_vertical:
                activityClass = LinearLayoutVerticalActivity.class;
                break;
            case R.id.button_linear_layout_horizontal:
                activityClass = LinearLayoutHorizontalActivity.class;
                break;
            case R.id.button_linear_layout_horizontal_gravity:
                activityClass = LinearLayoutHorizontalGravityActivity.class;
                break;
            default:
                break;
        }
        Intent intent = new Intent(MainActivity.this, activityClass);
        startActivity(intent);
    }
}
