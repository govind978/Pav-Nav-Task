package com.example.paynavtask;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class myadapter extends FragmentPagerAdapter {

    private Context mycontext;
    int totalTabs;

    public myadapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public myadapter(@NonNull FragmentManager fm, Context mycontext, int totalTabs) {
        super(fm);
        this.mycontext = mycontext;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return_payment returnPayment = new return_payment();
                return returnPayment;
            case 1:
                receive_payment receivePayment = new receive_payment();
                return receivePayment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
