package com.example.bca4semnotes.syllabus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bca4semnotes.R;
import com.github.barteksc.pdfviewer.PDFView;

public class os_syll extends AppCompatActivity {
PDFView pdf_os_syll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_syll);
        pdf_os_syll = findViewById(R.id.pdf_os_syll);
        pdf_os_syll.fromAsset("os_syllabus.pdf").load();
    }
}
