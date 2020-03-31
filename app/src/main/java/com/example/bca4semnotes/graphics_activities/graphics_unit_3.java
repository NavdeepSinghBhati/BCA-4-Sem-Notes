package com.example.bca4semnotes.graphics_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bca4semnotes.R;
import com.github.barteksc.pdfviewer.PDFView;

public class graphics_unit_3 extends AppCompatActivity {
PDFView pdf_graphics_unit3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphics_unit_3);
        pdf_graphics_unit3 = findViewById(R.id.pdf_graphics_unit3);
        pdf_graphics_unit3.fromAsset("Graphics_Unit_3.pdf").load();
    }
}
