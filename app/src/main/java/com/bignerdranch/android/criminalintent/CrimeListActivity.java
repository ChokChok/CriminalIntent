package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by zchok_000 on 12.02.2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
