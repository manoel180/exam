package br.exam.questions.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import br.exam.R;

/**
 * 3. Check words with typos:
 * There are three types of typos that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to
 * check if they are one typo (or zero typos) away.
 * Examples:
 * pale, ple ­> true
 * pales, pale ­> true
 * pale, bale ­> true
 * pale, bake ­> false
 */
public class Question3 extends Fragment {

    public Question3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters
     *
     * @return A new instance of fragment Question3.
     */
    // TODO: Rename and change types and number of parameters
    public static Question3 newInstance() {
        Question3 fragment = new Question3();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.question3_fragment, container, false);
    }




}
