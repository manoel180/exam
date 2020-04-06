package br.exam.questions;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.CompletionInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import br.exam.R;

public class Question1 extends Fragment {
    /*******************************************************************************************************************
     * 1.   Replacing characters in place:
     *     Given an array of characters, write a method to replace all the spaces with “&32”.
     *     You may assume that the array has sufficient slots at the end to hold the additional
     *     characters, and that you are given the “true” length of the array. (Please perform this
     *     operation in place with no other auxiliary structure).
     *     Example:
     *     Input: “User is not allowed      “, 19
     *     Output: “User&32is&32not&32allowed”
     *
     */

    public static Question1 newInstance() {
        Question1 fragment = new Question1();
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.question1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        EditText edtSizeVector = view.findViewById(R.id.edtSizeVector);
        EditText edtInput = view.findViewById(R.id.edtInput);
        Button btnProcess = view.findViewById(R.id.btnProcess);
        TextView textViewResult = view.findViewById(R.id.txtResult);


        edtSizeVector
                .addTextChangedListener(new TextWatcher()
                {
                    public void afterTextChanged(Editable s){
                        if(edtSizeVector.getText().length()>0) {
                            setEditTextMaxLength(edtInput, Integer.parseInt(String.valueOf(edtSizeVector.getText())));
                        }
                    }
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }
                });


        btnProcess.setOnClickListener(v -> {
            textViewResult.setText(edtInput.getText().toString().trim().replace(" ", "&32"));
        });
    }



     private void setEditTextMaxLength(EditText editText, int length) {
        InputFilter[] FilterArray = new InputFilter[1];
        FilterArray[0] = new InputFilter.LengthFilter(length);
        editText.setFilters(FilterArray);
    }


}
