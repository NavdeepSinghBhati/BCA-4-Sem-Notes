package com.example.bca4semnotes.OS_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bca4semnotes.R;
import com.github.barteksc.pdfviewer.PDFView;

public class os_unit_1 extends AppCompatActivity {
  PDFView pdf_os_unit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_unit_1);
        pdf_os_unit1 = findViewById(R.id.pdf_os_unit1);
        pdf_os_unit1.fromAsset("OS_Unit_1.pdf").load();
    }
}
