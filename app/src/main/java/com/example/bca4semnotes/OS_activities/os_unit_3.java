package com.example.bca4semnotes.OS_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bca4semnotes.R;
import com.github.barteksc.pdfviewer.PDFView;

public class os_unit_3 extends AppCompatActivity {
PDFView pdf_os_unit3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_unit_3);

        pdf_os_unit3 = findViewById(R.id.pdf_os_unit3);
        pdf_os_unit3.fromAsset("OS_Unit_3.pdf").load();
    }
}
