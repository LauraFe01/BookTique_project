package com.example.booktique

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.booktique.databinding.FragmentCatalogoLettiBinding

class CatalogoLetti : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentCatalogoLettiBinding>(inflater,
            R.layout.fragment_catalogo_letti,container,false)
        return binding.root
    }

}