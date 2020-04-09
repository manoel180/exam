package br.exam.questions.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.StringCharacterIterator;

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
    private EditText editText1;
    private EditText editText2;
    private Button button;
    private TextView result;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters
     *
     * @return A new instance of fragment Question3.
     */
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

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        editText1 = view.findViewById(R.id.edtInput1);
        editText2 = view.findViewById(R.id.edtInput2);
        button = view.findViewById((R.id.btnProcess));
        button.setOnClickListener(buttonOnClickListener);
        result = view.findViewById(R.id.txtResult);
    }

    private View.OnClickListener buttonOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            result.setText(verifyTypos(editText1.getText().toString(),editText2.getText().toString()).toString());
        }
    };


    private Boolean verifyTypos(String text1, String text2){
        Boolean result = false;
        int count =0;
        int i =0;
        //Verify remove
        if(text1.contains(text2)){
            result = true;
        }else {

            while(i<text1.length())
            {
                String text1_tmp = text1;
                String text2_tmp = text2;
                text1_tmp = text1_tmp.substring(0, i) + text2_tmp.substring(i+1);
                i++;
                return verifyTypos(text1, text1_tmp);

            }
        }
        //Verify replace


        //Verify insert
        return result;
    }


}
