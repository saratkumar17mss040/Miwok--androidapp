package com.example.android.miwok;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter
{

    String[] tabTitles = {"Numbers","Family","Colors","Phrases"};

//    private Context context;

    public SimpleFragmentPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return new NumbersFragment();
            case 1:
                return new FamilyFragment();
            case 2:
                return new ColorsFragment();
            case 3:
                return new PhrasesFragment();
            default:
                return null;
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {

        return tabTitles[position];

//        switch (position)
//        {
//            case 0:
//                return context.getString(R.string.category_numbers);
//            case 1:
//                return  context.getString(R.string.category_family);
//            case 2:
//                return context.getString(R.string.category_family);
//            case 3:
//                return context.getString(R.string.category_phrases);
//             default:
//                 return null;
//        }

    }

    //        if (position == 0) {
//            return new NumbersFragment();
//        } else if (position == 1){
//            return new FamilyFragment();
//        } else if(position==2){
//            return new ColorsFragment();
//        }else if(position==3){
//            return  new PhrasesFragment();
//        }
//        else {
//            return null;
//        }


    @Override
    public int getCount()
    {
        return 4;
    }

}
