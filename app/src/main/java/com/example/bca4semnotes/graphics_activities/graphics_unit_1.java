package com.example.bca4semnotes.graphics_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bca4semnotes.R;
import com.github.barteksc.pdfviewer.PDFView;

public class graphics_unit_1 extends AppCompatActivity {
PDFView pdf_graphics_unit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphics_unit_1);
        pdf_graphics_unit1 = findViewById(R.id.pdf_graphics_unit1);
        pdf_graphics_unit1.fromAsset("Graphics_Unit_1.pdf").load();
    }
}
