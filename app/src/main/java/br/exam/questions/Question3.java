package br.exam.questions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import br.exam.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link Question3#newInstance} factory method to
 * create an instance of this fragment.
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
