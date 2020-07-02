package com.venu.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.venu.fragmentexample.utils.inTrasaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.inTrasaction {
            //remove(ListFragment())
            add(R.id.fl1,ListFragment())
        }

        supportFragmentManager.inTrasaction {
            add(R.id.fl2,DetailFragment())
        }

    }
}