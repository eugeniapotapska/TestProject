package com.example.testproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(
            application, "5c0bdb41-4736-41fe-8150-1e724be8cff8",
            Analytics::class.java, Crashes::class.java
        )
    }
}
