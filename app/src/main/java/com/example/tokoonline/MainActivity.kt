package com.example.tokoonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.tokoonline.fragment.AkunFragment
import com.example.tokoonline.fragment.HomeFragment
import com.example.tokoonline.fragment.KeranjangFragment

class MainActivity : AppCompatActivity() {

    private val fragmentHome: Fragment = HomeFragment()
    private val fragmentAkun: Fragment = AkunFragment()
    private val fragmentKeranjang: Fragment = KeranjangFragment()
    private val fm: FragmentManager = supportFragmentManager
    private var active: Fragment = fragmentHome

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fm.beginTransaction().add(R.id.container, fragmentHome).show(fragmentHome).commit()
        fm.beginTransaction().add(R.id.container, fragmentAkun).hide(fragmentAkun).commit()
        fm.beginTransaction().add(R.id.container, fragmentKeranjang).hide(fragmentKeranjang).commit()

    }
}