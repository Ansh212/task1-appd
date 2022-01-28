package com.example.appd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button=findViewById(R.id.btn_button)
       btn.setOnClickListener(View.OnClickListener {
           Toast.makeText( this,"Congrats you may go to college soon :)",Toast.LENGTH_SHORT).show()

       })



    }
}