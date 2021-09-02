package com.example.paynavtask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rl_bottomsheet;
    GridView gv,gv2;
    ImageView iv_showBottomSheet;
    LinearLayout show_recent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        gv = findViewById(R.id.gdv_frequently_contacted);
        gv2 = findViewById(R.id.gdv_recents);
        ArrayList<FrequentlyContacted_modelclass_gridview> list = new ArrayList<>();
        list.add(new FrequentlyContacted_modelclass_gridview("Govind"));
        list.add(new FrequentlyContacted_modelclass_gridview("Govind"));
        list.add(new FrequentlyContacted_modelclass_gridview("Govind"));
        list.add(new FrequentlyContacted_modelclass_gridview("Govind"));
        list.add(new FrequentlyContacted_modelclass_gridview("Govind"));
        list.add(new FrequentlyContacted_modelclass_gridview("Govind"));
        list.add(new FrequentlyContacted_modelclass_gridview("Govind"));

        frequentlycontacted_adapter adapter = new frequentlycontacted_adapter(this,list);
        gv.setAdapter(adapter);

        ArrayList<recents_modelClass> arrayList = new ArrayList<>();
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));
        arrayList.add(new recents_modelClass("Govind"));

        recents_adapter adapter1 = new recents_adapter(this,arrayList);
        gv2.setAdapter(adapter1);

        MyBottomSheetFragment fragment = new MyBottomSheetFragment();

        iv_showBottomSheet = findViewById(R.id.show_bottomsheet);
        show_recent = findViewById(R.id.layout_showRecent);
        iv_showBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (show_recent.getVisibility() == View.VISIBLE)
                {
                    fragment.show(getSupportFragmentManager(), "TAG");
                }else{
                    fragment.dismiss();
                }

            }
        });

        rl_bottomsheet = findViewById(R.id.layout_showBottomsheet);
        rl_bottomsheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment.show(getSupportFragmentManager(), "TAG");
            }
        });


    }
}