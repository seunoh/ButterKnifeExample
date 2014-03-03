package com.butterknife.example;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * @author seunoh on 2014. 3. 4..
 */
public class MainFragment extends Fragment {

    @InjectView(R.id.textView)
    TextView mTextView;
    @InjectView(R.id.button)
    Button mButton;
    @InjectView(R.id.radioButton)
    RadioButton mRadioButton;
    @InjectView(R.id.checkBox)
    CheckBox mCheckBox;
    @InjectView(R.id.imageView)
    ImageView mImageView;

    /**
     * Called to have the fragment instantiate its user interface view.
     * This is optional, and non-graphical fragments can return null (which
     * is the default implementation).  This will be called between
     * {@link #onCreate(android.os.Bundle)} and {@link #onActivityCreated(android.os.Bundle)}.
     * <p/>
     * <p>If you return a View from here, you will later be called in
     * {@link #onDestroyView} when the view is being released.
     *
     * @param inflater           The LayoutInflater object that can be used to inflate
     *                           any views in the fragment,
     * @param container          If non-null, this is the parent view that the fragment's
     *                           UI should be attached to.  The fragment should not add the view itself,
     *                           but this can be used to generate the LayoutParams of the view.
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     *                           from a previous saved state as given here.
     * @return Return the View for the fragment's UI, or null.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);
        ButterKnife.inject(this, view);


        mTextView.setText("MainFragment");
        mButton.setText("MainFragment");
        mRadioButton.setText("MainFragment");
        mCheckBox.setText("MainFragment");
        mImageView.setBackgroundColor(Color.parseColor("#19F"));


        return view;
    }
}
