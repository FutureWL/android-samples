package com.example.listview_smapleadapter_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListViewSimpleAdapterTests extends AppCompatActivity {

    private List<Map<String, Object>> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_simple_adapter_tests);
        initData();
        ListView listView = findViewById(R.id.list_view2);
        // 参数 1 this
        // 参数 2 数据源
        // 参数 3 每一项布局
        String[] from = {"img", "name", "country"};
        int[] to = {R.id.qq_img, R.id.qq_name, R.id.qq_country};

        SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.listview_item, from, to);
        listView.setAdapter(adapter);
    }

    public void initData() {
        Map<String, Object> map1 = new HashMap<>();
        map1.put("img", R.mipmap.caocao);
        map1.put("name", "曹操");
        map1.put("country", "魏国");
        Map<String, Object> map2 = new HashMap<>();
        map2.put("img", R.mipmap.huangyueying);
        map2.put("name", "黄月英");
        map2.put("country", "蜀国");
        Map<String, Object> map3 = new HashMap<>();
        map3.put("img", R.mipmap.weiyan);
        map3.put("name", "魏延");
        map3.put("country", "蜀国");
        data.add(map1);
        data.add(map2);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
        data.add(map3);
    }

}