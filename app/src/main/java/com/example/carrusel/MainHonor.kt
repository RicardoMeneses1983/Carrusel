package com.example.carrusel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainHonor : AppCompatActivity() {

    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_honor)

        setViewHonor()
    }

    fun setViewHonor(){
        webView =findViewById(R.id.webHonor)
        webView.getSettings().setJavaScriptEnabled(true)
        webView.setWebViewClient(WebViewClient())
        webView.getSettings().setDomStorageEnabled(true);
        webView.loadUrl("https://www.att.com.mx/cellphone-all-cellphones/honor-vne-lx3.html?simpleplus=1")

    }


}