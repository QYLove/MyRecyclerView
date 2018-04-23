package com.example.sunny.myrecyclerview.anim;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sunny.myrecyclerview.R;

import java.util.List;

public class QQAdapter extends RecyclerView.Adapter<QQAdapter.MyViewHolder> {

    private List<QQMessage> list;
    private StartDragListener listener;

    public QQAdapter(List<QQMessage> list, StartDragListener listener) {
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.anim_list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        QQMessage qqMessage = list.get(position);
        holder.iv_logo.setImageResource(qqMessage.getLogo());
        holder.tv_name.setText(qqMessage.getName());
        holder.tv_Msg.setText(qqMessage.getMsg());
        holder.tv_time.setText(qqMessage.getTime());

        //aauajcajkvcanvcaklvc

        holder.iv_logo.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    //传递触摸情况给Callback
                    listener.onStartDrag(holder);
                }
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private final ImageView iv_logo;
        private final TextView tv_name;
        private final TextView tv_Msg;
        private final TextView tv_time;

        public MyViewHolder(View itemView) {
            super(itemView);
            iv_logo = ((ImageView) itemView.findViewById(R.id.iv_logo));
            tv_name = ((TextView) itemView.findViewById(R.id.tv_name));
            tv_Msg = ((TextView) itemView.findViewById(R.id.tv_Msg));
            tv_time = ((TextView) itemView.findViewById(R.id.tv_time));
        }
    }

}
