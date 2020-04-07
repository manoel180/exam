package br.exam.questions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import br.exam.R;

/**
 * 2. Check words with jumbled letters :
 * Our brain can read texts even if letters are jumbled, like the following sentence:  “Yuo
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


    public static Question2 newInstance() {
        return new Question2();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.question2_fragment, container, false);
    }



}
