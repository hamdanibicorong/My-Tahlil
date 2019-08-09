package com.hamdani.myuixdlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class Doa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);

        PDFView pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("do'a.pdf")
                .scrollHandle(new DefaultScrollHandle(this))
                .load();

    }
}
