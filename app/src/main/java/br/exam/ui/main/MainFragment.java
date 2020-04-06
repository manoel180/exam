package br.exam.ui.main;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import br.exam.R;
import br.exam.adapter.TabPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Objects;

public class MainFragment extends Fragment {

    private TabPagerAdapter tabPagerAdapter;
    private ViewPager2 pager;
    private Toolbar toolbar;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {




        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        toolbar = view.findViewById(R.id.toolbar);
        AppCompatActivity activity =  (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbar);

        // Display icon in the toolbar
        if(activity.getSupportActionBar() != null) {
            activity.getSupportActionBar().setDisplayShowHomeEnabled(true);
            activity.getSupportActionBar().setLogo(R.mipmap.ic_launcher);
            activity.getSupportActionBar().setDisplayUseLogoEnabled(true);
        }

        pager = view.findViewById(R.id.viewpager);
        TabLayout tabLayout = view.findViewById(R.id.tabs);

        tabPagerAdapter = new TabPagerAdapter(this);
        pager.setAdapter(tabPagerAdapter);

        new TabLayoutMediator(tabLayout, pager,
                (tab, position) -> tab.setText("Question " + (position  + 1))
        ).attach();

    }

}
