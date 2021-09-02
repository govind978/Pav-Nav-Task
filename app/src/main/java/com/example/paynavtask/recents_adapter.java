package com.example.paynavtask;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;

public class recents_adapter extends ArrayAdapter<recents_modelClass> {
    public recents_adapter(@NonNull Context context, ArrayList<recents_modelClass> list) {
        super(context,0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.name_image, parent, false);
        }
        Context mContext = listitemView.getContext();
        recents_modelClass gridview = getItem(position);
        TextView courseTV = listitemView.findViewById(R.id.gdv_name);
        courseTV.setText(gridview.getName());
        listitemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = courseTV.getText().toString();
                mContext.startActivity(new Intent(mContext, friends_screen.class).putExtra("name",name));

//                MyBottomSheetFragment fragment = new MyBottomSheetFragment();
//                fragment.show(((FragmentActivity)mContext).getSupportFragmentManager(), "TAG");
            }
        });

        return listitemView;
    }
}
