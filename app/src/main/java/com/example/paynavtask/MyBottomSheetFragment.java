package com.example.paynavtask;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.tabs.TabLayout;

public class MyBottomSheetFragment extends BottomSheetDialogFragment {

    TabLayout tabLayout;
    ViewPager viewPager;
    RecyclerView recyclerView;
    CardView cardView;
    LinearLayout hidden_layout;
    ImageView iv_arrow;


    @SuppressLint("RestrictedApi")
    @Override
    public void setupDialog(@NonNull Dialog dialog, int style) {
        super.setupDialog(dialog, style);

        View view = LayoutInflater.from(getContext()).inflate(R.layout.bottom_sheet_drawer, null);
        dialog.setContentView(view);

        tabLayout = view.findViewById(R.id.tab_tablayout);
        viewPager = view.findViewById(R.id.tab_viewpager);

        tabLayout.addTab(tabLayout.newTab().setText("Return"));
        tabLayout.addTab(tabLayout.newTab().setText("Receive"));

        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final myadapter myadapter = new myadapter(getChildFragmentManager(), getContext(), tabLayout.getTabCount());
        viewPager.setAdapter(myadapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        iv_arrow = view.findViewById(R.id.collapse_friends);
        cardView = view.findViewById(R.id.base_cardView);
        hidden_layout = view.findViewById(R.id.hidden_view);
        iv_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hidden_layout.getVisibility() == View.VISIBLE) {

                    // The transition of the hiddenView is carried out
                    //  by the TransitionManager class.
                    // Here we use an object of the AutoTransition
                    // Class to create a default transition.
                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hidden_layout.setVisibility(View.GONE);
                    iv_arrow.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hidden_layout.setVisibility(View.VISIBLE);
                    iv_arrow.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }
            }
        });

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerViewAdapter adapter = new recyclerViewAdapter(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

    }
}
