package com.chenh.criminallntent;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/**
 * Created by chenh on 2016/5/29.
 */
public class CrimeListActivity extends SingleFragmentActivity {


    @Override
    protected Fragment creatFragment() {
        return new CrimeListFragment();
    }
}
