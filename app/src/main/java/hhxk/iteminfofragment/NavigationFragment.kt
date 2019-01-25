package hhxk.insurancefragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hhxk.tcsl.R

/**
 * 地图导航
 */
class NavigationFragment : Fragment() {
    private var v: View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_navigation, container, false)
        initView()
        return v
    }

    private fun initView() {

    }
}