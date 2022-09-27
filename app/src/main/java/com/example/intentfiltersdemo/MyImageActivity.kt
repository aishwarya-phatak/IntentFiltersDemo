package com.example.intentfiltersdemo

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentfiltersdemo.databinding.MyImageActivityBinding

class MyImageActivity : AppCompatActivity(){

    private lateinit var binding: MyImageActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MyImageActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

       /* var path = intent!!.getStringExtra("path")
        binding.img.setImageURI(
            Uri.parse("file://$path")
        )*/

      binding.img.setImageURI(intent.data)
    }
}