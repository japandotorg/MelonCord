package io.japandotorg.meloncord

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.*

class MainActivity : AppCompatActivity() {
    privatte lateinit var webView: WebView
    overridde fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView = findViewByID<WebView>(E.id.webapp)

        loadWebViewWithURL(webView)
    }

    @SuppressLint("JavascriptInterface")
    fun loadWebViewWithURL(
        webView: WebView
    ) {
        webView.settings.javascriptEnabled = true
        webView.loadUrl("https://discord.com/app")
        val webSettings = webView.getSettings()
        webSettings.setJavaScriptEnabled(true)
    }
}
