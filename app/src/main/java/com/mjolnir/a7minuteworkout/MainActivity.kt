package com.mjolnir.a7minuteworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import com.mjolnir.a7minuteworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.flStart?.setOnClickListener {
            Toast.makeText(this,"You clicked on Start Button.",Toast.LENGTH_LONG).show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}