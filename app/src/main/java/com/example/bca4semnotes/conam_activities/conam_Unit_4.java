package com.example.bca4semnotes.conam_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bca4semnotes.R;
import com.github.barteksc.pdfviewer.PDFView;

public class conam_Unit_4 extends AppCompatActivity {
PDFView pdf_conam_unit4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conam__unit_4);
        pdf_conam_unit4 = findViewById(R.id.pdf_conam_unit4);
        pdf_conam_unit4.fromAsset("CONAM_Unit_4.pdf").load();
    }
}
