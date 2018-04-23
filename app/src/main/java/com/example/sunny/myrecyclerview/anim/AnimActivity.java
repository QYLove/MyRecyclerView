package com.example.sunny.myrecyclerview.anim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.example.sunny.myrecyclerview.R;

import java.util.List;

public class AnimActivity extends AppCompatActivity implements StartDragListener{

    private RecyclerView recyclerView;
    private ItemTouchHelper itemTouchHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim);

        recyclerView = ((RecyclerView) findViewById(R.id.main_recyclerView));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<QQMessage> list = DataUtils.init();
        QQAdapter adapter = new QQAdapter(list,this);
        recyclerView.setAdapter(adapter);
        //条目触摸帮助类
        ItemTouchHelper.Callback callback = new MyItemTouchHelperCallback();
        itemTouchHelper = new ItemTouchHelper(callback);
        itemTouchHelper.attachToRecyclerView(recyclerView);

    }

    @Override
    public void onStartDrag(RecyclerView.ViewHolder viewHolder){
        itemTouchHelper.startDrag(viewHolder);
    }
}
