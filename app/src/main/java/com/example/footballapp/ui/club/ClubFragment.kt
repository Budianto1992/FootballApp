package com.example.footballapp.ui.club

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.footballapp.R

class ClubFragment : Fragment() {

    private lateinit var clubViewModel: ClubViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        clubViewModel =
            ViewModelProviders.of(this).get(ClubViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_club, container, false)
        val textView: TextView = root.findViewById(R.id.text_club)
        clubViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}