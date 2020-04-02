package com.example.bca4semnotes.syllabus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bca4semnotes.R;
import com.github.barteksc.pdfviewer.PDFView;

public class vb_syll extends AppCompatActivity {
PDFView pdf_vb_syll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_vb_syll);
        pdf_vb_syll = findViewById(R.id.pdf_vb_syll);
        pdf_vb_syll.fromAsset("vb_syllabus.pdf").load();

    }
}
