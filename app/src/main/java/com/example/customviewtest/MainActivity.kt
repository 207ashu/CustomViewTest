package com.example.customviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var custmView:CustomInvitePrompt?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        custmView=findViewById(R.id.customView)


    }

    fun greenClicked(view: View) {
       var a:Int=0
        custmView?.let {

            it.invText="Green Click Kare ho"
            it.bkgColor=R.color.colorAccent
            it.invTextColor=R.color.colorAccent
        }

    }
    fun blueClicked(view: View) {
        Toast.makeText(this,"BLUe kr diye",Toast.LENGTH_LONG).show();
    }



}
