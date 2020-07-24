package com.webarch.teamworks;

import android.nfc.tech.Ndef;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private int numofTabs;
    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numofTabs = numofTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new tab1();
            case 1:
                return new tab2();
            case 2:
                return new tab3();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public long getItemId(int position) {
        return POSITION_NONE;
    }
}
