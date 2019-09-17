package io.github.futurewl.uilayouttest;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
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
        Button buttonLinearLayoutWeight = findViewById(R.id.button_linear_layout_weight);
        buttonLinearLayoutWeight.setOnClickListener(this);
        Button buttonRelativeLayout = findViewById(R.id.button_relative_layout);
        buttonRelativeLayout.setOnClickListener(this);
        Button buttonRelativeParentLayout = findViewById(R.id.button_relative_parent_layout);
        buttonRelativeParentLayout.setOnClickListener(this);
        Button buttonPercentFrameParentLayout = findViewById(R.id.button_percent_frame_parent_layout);
        buttonPercentFrameParentLayout.setOnClickListener(this);
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
            case R.id.button_linear_layout_weight:
                activityClass = LinearLayoutWeightActivity.class;
                break;
            case R.id.button_relative_layout:
                activityClass = RelativeActivity.class;
                break;
            case R.id.button_relative_parent_layout:
                activityClass = RelativeParentActivity.class;
                break;
            case R.id.button_percent_frame_parent_layout:
                activityClass = PercentFrameActivity.class;
                break;
            default:
                break;
        }
        Intent intent = new Intent(MainActivity.this, activityClass);
        startActivity(intent);
    }
}
