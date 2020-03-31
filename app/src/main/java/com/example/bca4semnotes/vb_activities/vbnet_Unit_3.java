package com.example.bca4semnotes.vb_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bca4semnotes.R;
import com.github.barteksc.pdfviewer.PDFView;

public class vbnet_Unit_3 extends AppCompatActivity {
PDFView pdf_vb_unit3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vbnet__unit_3);
        pdf_vb_unit3 = findViewById(R.id.pdf_vb_unit3);
        pdf_vb_unit3.fromAsset("VB_Unit_3.pdf").load();
    }
}
