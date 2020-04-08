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
import br.exam.R;

/**
 * 2. Check words with jumbled letters :
 * Our brain can read texts even if letters are jumbled, like the following sentence: “Yuo
 * cna porbalby raed tihs esaliy desptie teh msispeillgns.” Given two strings, write a
 * method to decide if one is a partial­permutation of the other. Consider a
 * partial­permutation only if:
 * ­ The first letter hasn’t changed place
 * ­ If word has more than  3 letters, up to 2/3 of the letters have changed place
 *
 * Examples:
 * you, yuo ­> true
 * probably, porbalby ­> true
 * despite, desptie ­> true
 * moon, nmoo ­> false
 * misspellings, mpeissngslli ­> false
 */
public class Question2 extends Fragment {

    private EditText editText1;
    private EditText editText2;
    private Button button;
    private TextView result;
    public static Question2 newInstance() {
        return new Question2();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.question2_fragment, container, false);
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
            result.setText(verifedJumbled(editText1.getText().toString(),editText2.getText().toString()));
        }
    };

    private String verifedJumbled(String text1, String text2){

        String result = "Tamanho texto menor que 3";
        Integer count=0;
        if(text1.length() >= 2 || text1.length()==text2.length()){
            if(text1.equals(text2)){
                result = "Palavras iguais";
            }else{
                if(text1.charAt(0) == text2.charAt(0)){
                    for (int i = 0; i<text1.length(); i++){
                       Boolean res = text1.charAt(i)==text2.charAt(i);
                       if(res){
                           count++;
                       }
                    }

                }else{
                    result = "false";
                }
                if(Math.round((text1.length()/3)*2) == count){
                    result ="true";
                }else{
                    result = "false";
                }
            }
        }
        return result;

    }
}
