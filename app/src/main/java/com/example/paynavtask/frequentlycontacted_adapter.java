package com.example.paynavtask;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import java.util.ArrayList;
import java.util.List;

public class frequentlycontacted_adapter extends ArrayAdapter<FrequentlyContacted_modelclass_gridview> {
    public frequentlycontacted_adapter(@NonNull Context context, ArrayList<FrequentlyContacted_modelclass_gridview> arraylist) {
        super(context,0 , arraylist);
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
        FrequentlyContacted_modelclass_gridview gridview = getItem(position);
        TextView courseTV = listitemView.findViewById(R.id.gdv_name);
        listitemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = courseTV.getText().toString();
                mContext.startActivity(new Intent(mContext, friends_screen.class).putExtra("name",name));
            }
        });
        courseTV.setText(gridview.getName());
        return listitemView;
    }
}
