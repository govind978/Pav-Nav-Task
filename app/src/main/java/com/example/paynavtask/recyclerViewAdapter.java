package com.example.paynavtask;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.viewHolder>{

    Context context;

    public recyclerViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.friends_layout,parent,false);
        viewHolder holder = new viewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = holder.tv.getText().toString();
                context.startActivity(new Intent(context, Activity_Friends.class).putExtra("name",name));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 15;
    }

    class viewHolder extends RecyclerView.ViewHolder {
        LinearLayout layout;
        TextView tv;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            layout = itemView.findViewById(R.id.layout_friends);
            tv = itemView.findViewById(R.id.tv_name_friends_layout);
        }
    }
}
