package com.wellsandwhistles.crimewatch;

import android.support.v4.app.Fragment;
/**
 * Created by Owner on 5/10/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
