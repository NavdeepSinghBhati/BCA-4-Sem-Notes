package com.example.bca4semnotes.graphics_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bca4semnotes.R;
import com.github.barteksc.pdfviewer.PDFView;

public class graphics_unit_5 extends AppCompatActivity {
PDFView pdf_graphics_unit5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphics_unit_5);
        pdf_graphics_unit5 = findViewById(R.id.pdf_graphics_unit5);
        pdf_graphics_unit5.fromAsset("Graphics_Unit_5.pdf").load();
    }
}
