package com.chenh.criminallntent;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/**
 * Created by chenh on 2016/5/29.
 */
public abstract class SingleFragmentActivity extends Activity {
    protected abstract Fragment creatFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getFragmentManager();
        //这里是通过fragmentContainer——此处为CrimeAcitity来获取资源的
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if (fragment == null) {
            fragment =creatFragment();

            //创建一个新的fragment事物，加入一个添加操作，然后提交该事物
            fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
        }
    }
}
