package com.example.bca4semnotes.syllabus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bca4semnotes.R;
import com.github.barteksc.pdfviewer.PDFView;

public class coa_syll extends AppCompatActivity {
PDFView pdf_coa_syll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coa_syll);
        pdf_coa_syll = findViewById(R.id.pdf_coa_syll);
        pdf_coa_syll.fromAsset("coa_syllabus.pdf").load();
    }
}
