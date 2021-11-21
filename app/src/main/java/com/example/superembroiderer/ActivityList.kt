package com.example.superembroiderer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_ITEM = "LAST_SELECTED_ITEM"

class ActivityList : AppCompatActivity() {

    private lateinit var bottomNavigationMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        bottomNavigationMenu = findViewById(R.id.bottom_menu)

        bottomNavigationMenu.setOnItemSelectedListener { item ->

            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.level -> {
                    fragment = LevelFragment()

                }
                R.id.add -> {
                    fragment = AddFragment()
                }
                R.id.info -> {
                    fragment = InfoFragment()
                }
            }
            replaceFragment(fragment!!)
            true
        }
        bottomNavigationMenu.selectedItemId =
            savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.level




    }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM, bottomNavigationMenu.selectedItemId)
        super.onSaveInstanceState(outState)
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container,fragment)
            .addToBackStack(null)
            .commit()

    }
}