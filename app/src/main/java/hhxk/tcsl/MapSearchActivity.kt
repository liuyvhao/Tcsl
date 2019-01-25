package hhxk.tcsl

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.amap.api.maps.AMap
import com.amap.api.maps.AMapOptions
import com.amap.api.maps.model.MyLocationStyle
import kotlinx.android.synthetic.main.activity_map_search.*

/**
 * 地图查找
 */
class MapSearchActivity : AppCompatActivity() {
    private var aMap: AMap?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map_search)
        mapView.onCreate(savedInstanceState)
        initView()
    }

    private fun initView(){
        back.setOnClickListener { finish() }

        if (aMap==null)
            aMap=mapView.map

        var myLocationStyle= MyLocationStyle()
        myLocationStyle.interval(2000)
        myLocationStyle.myLocationType(MyLocationStyle.LOCATION_TYPE_LOCATION_ROTATE_NO_CENTER)
        myLocationStyle.showMyLocation(true)
        aMap!!.myLocationStyle=myLocationStyle
        aMap!!.uiSettings.zoomPosition= AMapOptions.LOGO_MARGIN_RIGHT
        aMap!!.isMyLocationEnabled=true
        aMap!!.uiSettings.isMyLocationButtonEnabled = true
        aMap!!.setOnMyLocationChangeListener {
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        mapView.onSaveInstanceState(outState)
    }
}
