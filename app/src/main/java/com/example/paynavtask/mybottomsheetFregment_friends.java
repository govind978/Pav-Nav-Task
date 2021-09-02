package com.example.paynavtask;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class mybottomsheetFregment_friends extends BottomSheetDialogFragment {

    @SuppressLint("RestrictedApi")
    @Override
    public void setupDialog(@NonNull Dialog dialog, int style) {
        super.setupDialog(dialog, style);

        View view = LayoutInflater.from(getContext()).inflate(R.layout.bottom_sheet_fragment_friends, null);
        dialog.setContentView(view);
    }
}
