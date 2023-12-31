package com.example.kattabozortask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kattabozortask.presentation.ui.screen.CategoryProductsScreen

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.main_activity, CategoryProductsScreen.newInstance()).commit()
    }
}