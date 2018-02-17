package com.example.cemil.kotlin_phone_call

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun phoneCall_Direk(view: View) {
        intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + telefonText.text.toString()));//Bu kod satırı aşağıdan farklı olarak direkt olarak arama yapmamıza oalnak sağlar
        startActivity(intent)
    }fun phoneCall(view: View) {
        val arama= Intent(Intent.ACTION_DIAL)//Bu kod satırımız bizi rehbere telefon numarası ile yönlendiri.
        arama.data= Uri.parse("tel:"+telefonText.text.toString())
        startActivity(arama)
    }
}
