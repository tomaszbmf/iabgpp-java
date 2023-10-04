package com.mobilefuse.iabgpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mobilefuse.sdk.iab.gpp.encoder.GppModel

class MainActivity : AppCompatActivity() {

    private val testGppConsentString = "DBACNYA~CPXxRfAPXxRfAAfKABENB-CgAAAAAAAAAAYgAAAAAAAA~1YNN"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        simpleTest()
    }

    private fun simpleTest() {
        val gppModel =
            GppModel(testGppConsentString)
        Log.d("MF", "Decoded gpp string")
    }
}