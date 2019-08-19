package com.example.studentinformationsystem

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class BottomNavigation : AppCompatActivity() {

    val manager = supportFragmentManager

    private lateinit var textMessage: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                textMessage.setText("Home")
                createFragmentOne()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                textMessage.setText("DashBoard")
                createFragmentTwo()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                textMessage.setText("Notifications")
                createFragmentThree()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        createFragmentOne()

        textMessage = findViewById(R.id.message)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }


    fun createFragmentOne() {
        val transaction = manager.beginTransaction()
        val fragment = FragmentOne()
        transaction.replace(R.id.fragmentholder,fragment)
            transaction.addToBackStack(null)
            transaction.commit()

        }
        fun createFragmentTwo() {
            val transaction = manager.beginTransaction()
            val fragment = FragmentTwo()
            transaction.replace(R.id.fragmentholder, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        fun createFragmentThree() {
            val transaction = manager.beginTransaction()
            val fragment = FragmentThree()
            transaction.replace(R.id.fragmentholder, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

