package com.example.carrusel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class AppleInfo : AppCompatActivity() {
    lateinit var webView:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apple_info)

        setAppleView()
    }


fun setAppleView(){
webView =findViewById(R.id.webApple)
webView.getSettings().setJavaScriptEnabled(true)
webView.setWebViewClient(WebViewClient())
webView.getSettings().setDomStorageEnabled(true);
webView.loadUrl("https://www.att.com.mx/apple/iphone15-pro.html")

}

}