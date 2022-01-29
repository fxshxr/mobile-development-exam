package com.example.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exam.databinding.ActivityMainBinding


interface ActivityFunctions {
    fun cartEvent(e: String)
    fun likeEvent(e: String)
}

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PersonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        adapter = PersonAdapter(object : ActivityFunctions{
            override fun cartEvent(e: String) {

            }
            override fun likeEvent(e: String){

            }
        })

        val layoutManager = LinearLayoutManager(this)
        binding.apply {
            rcView.layoutManager = layoutManager
            rcView.adapter = adapter
        }
    }
}