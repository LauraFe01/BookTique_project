package com.example.booktique

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.booktique.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(CatalogoHome())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {

                R.id.catalogoPulsante -> replaceFragment(CatalogoHome())
                R.id.scopriPulsante -> replaceFragment(Scopri())

                else -> {}
            }

            true
        }

    }

        private fun replaceFragment(fragment: Fragment){
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainerView,  fragment)
            fragmentTransaction.commit()

        }

        //provare con l'explicit intent

        /*
        bottomNavView = findViewById(R.id.bottomNavigationView)
        navController = findNavController(R.id.fragmentContainerView)
        bottomNavView.setupWithNavController(navController)

        bottomNavView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.catalogo-> {
                    navController.navigate(R.id.catalogoHome)
                    return@setOnItemSelectedListener true
                }
                R.id.scopriPulsante -> {
                    navController.navigate(R.id.action_catalogoHome_to_scopri)
                    return@setOnItemSelectedListener true
                }
                else -> return@setOnItemSelectedListener false
            }
        }*/



}