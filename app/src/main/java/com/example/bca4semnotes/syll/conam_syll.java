package com.example.bca4semnotes.syll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bca4semnotes.R;
import com.github.barteksc.pdfviewer.PDFView;

public class conam_syll extends AppCompatActivity {
PDFView pdf_conam_syll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conam_syll);
        pdf_conam_syll = findViewById(R.id.pdf_conam_syll);
        pdf_conam_syll.fromAsset("conam_syllabus.pdf").load();
    }
}
