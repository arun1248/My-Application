package com.nilan.tech.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.nilan.tech.myapplication.databinding.ActivityConstraintLayoutBinding;

public class ConstraintLayoutActivity extends AppCompatActivity {

    private static final String TAG = "ConstraintLayoutActivit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityConstraintLayoutBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_constraint_layout);

        binding.btn2.setOnClickListener(v -> {
            binding.btn2.setText("from binding");

            Intent intent = new Intent(this, MainActivityKotlin.class);
            startActivity(intent);
        });

        binding.textField.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                Log.d(TAG, "afterTextChanged() called with: editable = [" + editable + "]");
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d(TAG, "beforeTextChanged() called with: charSequence = [" + charSequence + "], i = [" + i + "], i1 = [" + i1 + "], i2 = [" + i2 + "]");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d(TAG, "onTextChanged() called with: charSequence = [" + charSequence + "], i = [" + i + "], i1 = [" + i1 + "], i2 = [" + i2 + "]");
                binding.setName(charSequence.toString());

                if (binding.getName().contains("r")) {
                    binding.setIsPremiumUser(true);
                } else {
                    binding.setIsPremiumUser(false);
                }
            }
        });

    }
}