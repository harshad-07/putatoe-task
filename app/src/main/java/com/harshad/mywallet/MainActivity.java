package com.harshad.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button tm, add, cr, bank, tmSubmit, add2, crSubmit, crCancel, bankAdd, acAdd;
    Dialog dl1,dl2,dl3,dl4,dl5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dl1 = new Dialog(this);
        dl1.setContentView(R.layout.transfer_money_dialog);
        dl1.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dl1.getWindow().getAttributes().windowAnimations = R.style.animation;

        dl2 = new Dialog(this);
        dl2.setContentView(R.layout.add_money_dialog);
        dl2.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dl2.getWindow().getAttributes().windowAnimations = R.style.animation;

        dl3 = new Dialog(this);
        dl3.setContentView(R.layout.credit_dialog);
        dl3.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dl3.getWindow().getAttributes().windowAnimations = R.style.animation;

        dl4 = new Dialog(this);
        dl4.setContentView(R.layout.bank_dialog);
        dl4.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dl4.getWindow().getAttributes().windowAnimations = R.style.animation;

        dl5 = new Dialog(this);
        dl5.setContentView(R.layout.add_ac_dialog);
        dl5.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dl5.getWindow().getAttributes().windowAnimations = R.style.animation;

        tm = findViewById(R.id.transferMoney);
        add = findViewById(R.id.rupee);
        cr = findViewById(R.id.credit);
        bank = findViewById(R.id.bank);

        tmSubmit = dl1.findViewById(R.id.tmSubmit);
        add2 = dl2.findViewById(R.id.add_money_btn);
        crSubmit = dl3.findViewById(R.id.cr_submit);
        crCancel = dl3.findViewById(R.id.cr_cancel);
        bankAdd = dl4.findViewById(R.id.add_bac);


        tm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dl1.show();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dl2.show();
            }
        });

        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dl3.show();
            }
        });

        bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dl4.show();
            }
        });

        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dl2.dismiss();
            }
        });

        crSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dl3.dismiss();
            }
        });

        crCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dl3.dismiss();
            }
        });

        bankAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dl5.show();
            }
        });

    }
}