package com.example.intentfiltersdemo

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentfiltersdemo.databinding.YourImageActivityBinding

class YourImageActivity : AppCompatActivity() {

    private lateinit var binding: YourImageActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = YourImageActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var path = intent!!.getStringExtra("path")
        binding.img.setImageURI(
            Uri.parse("file://$path")
        )
    }
}