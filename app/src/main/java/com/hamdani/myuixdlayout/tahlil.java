package com.hamdani.myuixdlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class tahlil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahlil);


        PDFView pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("tahlilan.pdf")
                .scrollHandle(new DefaultScrollHandle(this))
                .load();

    }
}