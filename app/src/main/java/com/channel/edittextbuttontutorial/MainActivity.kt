package com.channel.edittextbuttontutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_main)


        login.setOnClickListener {
         if(etusername.text.toString().equals("")){

             Toast.makeText(applicationContext,"Username required",Toast.LENGTH_SHORT).show()
         }


            else if(etpin.text.toString().equals("")){

                Toast.makeText(applicationContext,"Password required",Toast.LENGTH_SHORT).show()
            }
            else{

             printtext.setText("Success")
         }

        }




    }
}