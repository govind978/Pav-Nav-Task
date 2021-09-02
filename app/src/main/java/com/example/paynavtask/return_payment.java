package com.example.paynavtask;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class return_payment extends Fragment {

    PieChart pieChart;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.return_payment,container,false);

        pieChart = view.findViewById(R.id.piechart_return_payment);
        pieChart.addPieSlice(
                new PieModel(
                        "R",
                        93,
                        Color.parseColor("#FFA726")));
        pieChart.addPieSlice(
                new PieModel(
                        "Python",
                        5,
                        Color.parseColor("#66BB6A")));
        pieChart.addPieSlice(
                new PieModel(
                        "C++",
                        2,
                        Color.parseColor("#EF5350")));

        pieChart.startAnimation();

        return view;

    }
}
