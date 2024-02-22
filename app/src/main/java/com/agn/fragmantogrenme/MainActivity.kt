package com.agn.fragmantogrenme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.agn.fragmantogrenme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binndig:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binndig=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binndig.root)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
    }
}