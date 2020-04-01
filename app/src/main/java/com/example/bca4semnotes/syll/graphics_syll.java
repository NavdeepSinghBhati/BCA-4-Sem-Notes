package com.example.bca4semnotes.syll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bca4semnotes.R;
import com.github.barteksc.pdfviewer.PDFView;

public class graphics_syll extends AppCompatActivity {
PDFView pdf_graphics_syll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphics_syll);
        pdf_graphics_syll = findViewById(R.id.pdf_graphics_syll);
        pdf_graphics_syll.fromAsset("graphics_syllabus.pdf").load();
    }
}
