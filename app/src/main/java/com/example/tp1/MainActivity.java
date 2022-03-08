package com.bentechprotv.android.tp01calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tp1.R;

public class MainActivity extends AppCompatActivity {


    Button _btnSom;
    Button _btnSou;
    Button _btnMul;
    Button _btnDiv;
    Button _btnMod;
    EditText _edtPremier,_edtSecond;
    TextView _txtResultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //liaison entre contrôles XML et variables Java
        _btnSom = findViewById(R.id.btnSom);
        _btnSou = findViewById(R.id.btnSou);
        _btnMul = findViewById(R.id.btnMul);
        _btnDiv = findViewById(R.id.btnDiv);
        _btnMod = findViewById(R.id.btnMod);
                _edtPremier = findViewById(R.id.edtPremier);
        _edtSecond = findViewById(R.id.edtSecond);
        _txtResultat = findViewById(R.id.txtResultat);
        // traitements
        _btnSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,somme;
                n1 = Integer.parseInt(_edtPremier.getText().toString());
                n2 = Integer.parseInt(_edtSecond.getText().toString());
                somme = n1 + n2;
                _txtResultat.setText("Le résultat est : " + String.valueOf(somme));
            }
        });
        _btnSou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,sous;
                n1 = Integer.parseInt(_edtPremier.getText().toString());
                n2 = Integer.parseInt(_edtSecond.getText().toString());
                sous = n1 - n2;
                _txtResultat.setText("Le résultat est : " + String.valueOf(sous));
            }
        });
        _btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,mul;
                n1 = Integer.parseInt(_edtPremier.getText().toString());
                n2 = Integer.parseInt(_edtSecond.getText().toString());
                mul = n1 * n2;
                _txtResultat.setText("Le résultat est : " + String.valueOf(mul));
            }
        });
        _btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,div;
                n1 = Integer.parseInt(_edtPremier.getText().toString());
                n2 = Integer.parseInt(_edtSecond.getText().toString());
                div = n1 / n2;
                _txtResultat.setText("Le résultat est : " + String.valueOf(div));
            }
        });
        _btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,mod;
                n1 = Integer.parseInt(_edtPremier.getText().toString());
                n2 = Integer.parseInt(_edtSecond.getText().toString());
                mod = n1 % n2;
                _txtResultat.setText("Le résultat est : " + String.valueOf(mod));
            }
        });

    }
}