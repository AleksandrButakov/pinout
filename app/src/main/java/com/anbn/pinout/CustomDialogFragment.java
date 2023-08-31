package com.anbn.pinout;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.annotation.NonNull;


// created class for alert dialog

public class CustomDialogFragment extends DialogFragment {

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        return builder
                .setTitle("Информация отправлена разработчику. Спасибо!")
                .setIcon(android.R.drawable.ic_menu_send)
                .setPositiveButton("OK", null)
                .create();
    }

}
