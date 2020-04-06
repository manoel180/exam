package br.exam.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import br.exam.questions.Question1;
import br.exam.questions.Question2;
import br.exam.questions.Question3;

public class TabPagerAdapter extends FragmentStateAdapter {

    public TabPagerAdapter(@NonNull Fragment fm) {
        super(fm);
    }

    private static final int CARD_ITEM_SIZE = 3;

    @NonNull @Override public Fragment createFragment(int position) {
        switch (position ) {
            case 1:
                return Question2.newInstance();
            case 2:
                return Question3.newInstance();
            default:
                return Question1.newInstance();
        }

    }


    @Override public int getItemCount() {
        return CARD_ITEM_SIZE;
    }

}
