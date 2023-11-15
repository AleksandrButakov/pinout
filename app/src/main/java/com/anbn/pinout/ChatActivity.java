package com.anbn.pinout;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    public static String st;

    // нарисуем экран
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        // для стрелки назад в ActionBar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // add animation on the button
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.button_fading);

        // click imageButton btnSend
        ImageButton btnSend = findViewById(R.id.btnSend);
        btnSend.setEnabled(false);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // adding animation of the button when pressed
                view.startAnimation(animAlpha);
                showDialog();

                EditText editText = (EditText) findViewById(R.id.editText);
                editText.setText("");
            }
        });


        // listener for editText
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                SetImageButtonProperty(s);
            }
        });
    }

    // button properties depending on the presence of text in editText
    public void SetImageButtonProperty(CharSequence s) {
        ImageButton btnSend = findViewById(R.id.btnSend);
        String sText = String.valueOf(s);
        if (sText.length() == 0) {
            btnSend.setImageResource(R.drawable.icon_send_disable);
            btnSend.setEnabled(false);
        } else {
            btnSend.setImageResource(R.drawable.icon_send_enable);
            btnSend.setEnabled(true);
        }
    }

    // для стрелки назад в ActionBar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // для стрелки назад в ActionBar
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    // show Alert Dialog on screen
    public void showDialog() {
        CustomDialogFragment dialog = new CustomDialogFragment();
        dialog.show(getSupportFragmentManager(), "Message");
    }


}
