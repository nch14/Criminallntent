package com.chenh.criminallntent;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CrimeActivity extends SingleFragmentActivity {


    @Override
    protected Fragment creatFragment() {
        return new CrimeFragment();
    }
}
