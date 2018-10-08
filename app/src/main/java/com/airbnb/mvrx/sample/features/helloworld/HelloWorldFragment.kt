package com.airbnb.mvrx.sample.features.helloworld

import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.airbnb.mvrx.BaseMvRxFragment
import com.airbnb.mvrx.sample.R
//import com.airbnb.mvrx.sample.views.Marquee
import kotlinx.android.synthetic.main.fragment_hello_world.*

class HelloWorldFragment : BaseMvRxFragment() {
//    private lateinit var marquee: Marquee

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_hello_world, container, false).apply {
            findViewById<Toolbar>(R.id.toolbar).setupWithNavController(findNavController())
//            marquee = findViewById(R.id.marquee)
//             toolbar.setupWithNavController(findNavController())
        }



    override fun invalidate() {
        marquee.setTitle("Hello World ,51bb8")
    }
}