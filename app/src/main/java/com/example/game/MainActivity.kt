package com.example.game

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.game.Fragments.*
import com.example.game.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var flagsFragment: FlagsFragment? = null
    private var capitalsFragment: CapitalsFragment? = null
    private var placesFragment: PlacesFragment? = null
    private var highScoreFragment: HighScoreFragment? = null
    private var randomFragment: RandomFragment? = null
    private var sittingsFragment: SittingsFragment? = null
    private val fragmentManager: FragmentManager? = null
    private var fragmentTransaction: FragmentTransaction? = null
    private var mainBinding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)

        // setContentView(R.layout.activity_main);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        flagsFragment = FlagsFragment()
        capitalsFragment = CapitalsFragment()
        placesFragment = PlacesFragment()
        randomFragment = RandomFragment()
        highScoreFragment = HighScoreFragment()
        sittingsFragment = SittingsFragment()

    }
    fun onClickFlags(view: View?) {
        fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction!!.add(R.id.container, flagsFragment!!)
            .commit()
    }

    fun onClickCapitals(view: View?) {
        fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction!!.replace(R.id.container, capitalsFragment!!)
            .commit()
    }

    fun onClickPlaces(view: View?) {
        fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction!!.replace(R.id.container, placesFragment!!).commit()
    }


    fun onClickRandom(view: View?) {
        fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction!!.replace(R.id.container, randomFragment!!).commit()
    }

    fun onClickHighScore(view: View?) {
        fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction!!.replace(R.id.container, highScoreFragment!!).commit()
    }

    fun onClickSittings(view: View?) {
        fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction!!.replace(R.id.container, sittingsFragment!!)
            .commit()
    }
}