package com.example.bca4semnotes.conam_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bca4semnotes.R;
import com.github.barteksc.pdfviewer.PDFView;

public class conam_Unit_3 extends AppCompatActivity {
PDFView pdf_conam_unit3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conam__unit_3);
        pdf_conam_unit3 = findViewById(R.id.pdf_conam_unit3);
        pdf_conam_unit3.fromAsset("CONAM_Unit_3.pdf").load();
    }
}
