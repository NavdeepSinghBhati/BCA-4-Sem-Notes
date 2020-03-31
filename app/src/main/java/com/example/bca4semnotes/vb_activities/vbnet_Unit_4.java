package com.example.bca4semnotes.vb_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bca4semnotes.R;
import com.github.barteksc.pdfviewer.PDFView;

public class vbnet_Unit_4 extends AppCompatActivity {
PDFView pdf_vb_unit4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vbnet__unit_4);
        pdf_vb_unit4 = findViewById(R.id.pdf_vb_unit4);
        pdf_vb_unit4.fromAsset("VB_Unit_4.pdf").load();
    }
}
