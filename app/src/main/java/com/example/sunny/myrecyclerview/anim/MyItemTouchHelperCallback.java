package com.example.sunny.myrecyclerview.anim;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

public class MyItemTouchHelperCallback extends ItemTouchHelper.Callback {

    //Callback回调监听时先调用的，用来判断当前是什么动作，
    //比如说判断方向（意思就是我要监听哪个方向的拖动）
    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        //方向：up，down，left，right
        //常量：
        int up = ItemTouchHelper.UP;// 1  0x0001
        int down = ItemTouchHelper.DOWN;//2  0x0010
        int left = ItemTouchHelper.LEFT;//4  0x0100
        int right = ItemTouchHelper.RIGHT;//8  0x1000

        /**
         * return 0x0011 //向上和向下
         *
         * if(0x0011 & 0x0001){//向上
         *     0x0001
         * }
         * if(0x0011 & 0x0010){//向下
         *     0x0010
         * }
         * 0x0011&
         * 0x0001
         * ------
         * 0x0001
         */
        //我要监听的拖拽方向是哪两个方向
        int dragFlags = ItemTouchHelper.UP|ItemTouchHelper.DOWN;
        //我要监听的swipe侧滑方向是哪个方向
        int swipeFlags = 0;

        int flags = makeMovementFlags(dragFlags, swipeFlags);
        return flags;
    }

    //是否允许长按拖拽
    @Override
    public boolean isLongPressDragEnabled() {
        return true;
    }

    //当移动的时候回调的方法--拖拽
    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return true;
    }

    //侧滑的时候回调的
    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

    }
}
