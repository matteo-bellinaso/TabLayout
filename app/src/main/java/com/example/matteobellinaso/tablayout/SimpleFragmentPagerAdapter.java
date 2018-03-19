package com.example.matteobellinaso.tablayout;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.matteobellinaso.tablayout.Fragment.Fragment1;
import com.example.matteobellinaso.tablayout.Fragment.Fragment2;
import com.example.matteobellinaso.tablayout.Fragment.Fragment3;


/**
 * Created by matteobellinaso on 07/03/18.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

        @Override
        public Fragment getItem(int position) {

            Fragment1 fragment1 = new Fragment1();
            Fragment2 fragment2 = new Fragment2();
            Fragment3 fragment3 = new Fragment3();

            if (position == 0) {
               return  fragment1;
            } else if (position == 1){
                return fragment2;
            } else if (position == 2){
                return fragment3;
            }else{
                return fragment1;
            }
        }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.tab_name_1);
            case 1:
                return mContext.getString(R.string.tab_name_2);
            case 2:
                return mContext.getString(R.string.tab_name_3);
            default:
                return null;
        }
    }

}
