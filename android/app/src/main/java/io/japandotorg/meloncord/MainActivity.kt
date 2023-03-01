package io.japandotorg.meloncord

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.*

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView = findViewById<WebView>(R.id.webapp)

        loadWebViewWithURL(webView)
    }

    @SuppressLint("SetJavascriptEnabled")
    fun loadWebViewWithURL(
        webView: WebView
    ) {
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://discord.com/app")
        val webSettings = webView.getSettings()
        webSettings.setJavaScriptEnabled(true)
    }
}
