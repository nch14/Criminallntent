package com.chenh.criminallntent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by chenh on 2016/5/29.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private ArrayList<Crime> mCrimes;
    private Context mAppContext;

    private CrimeLab(Context appComtext){
        mAppContext=appComtext;
        mCrimes=new ArrayList<>();

        for (int i=0;i<100;i++){
            Crime c=new Crime();
            c.setmTitle("Crime#"+i);
            c.setmSolved(i%2==0);
            mCrimes.add(c);
        }
    }

    public static CrimeLab get(Context c){
        if (sCrimeLab==null){
            sCrimeLab=new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }
    public ArrayList<Crime> getCrimes(){
        return mCrimes;
    }
    public Crime getCrime(UUID id){
        for (Crime c:mCrimes){
            if (c.getmId().equals(id)){
                return c;
            }
        }
        return null;
    }
}
