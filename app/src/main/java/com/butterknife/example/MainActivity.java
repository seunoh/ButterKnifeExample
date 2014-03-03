package com.butterknife.example;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends Activity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        mTextView.setText("MainActivity");
        mButton.setText("MainActivity");
        mRadioButton.setText("MainActivity");
        mCheckBox.setText("MainActivity");
        mImageView.setBackgroundColor(Color.parseColor("#F91"));


    }

    @OnClick(value = R.id.button)
    public void onButtonClick(View v) {
        Toast.makeText(this, "button click", Toast.LENGTH_SHORT).show();
    }


    @OnClick(value = R.id.textView)
    public void onTextClick(View v) {
        Toast.makeText(this, "textView click", Toast.LENGTH_SHORT).show();
    }


    @OnClick(value = R.id.imageView)
    public void onImageClick(View v) {
        Toast.makeText(this, "imageView click", Toast.LENGTH_SHORT).show();
    }
}
