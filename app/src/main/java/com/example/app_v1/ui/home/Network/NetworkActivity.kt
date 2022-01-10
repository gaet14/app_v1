package com.example.app_v1.ui.home.Network

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.carrier.CarrierIdentifier
import com.example.app_v1.R
import com.example.app_v1.databinding.ActivityNetworkBinding
import com.example.app_v1.databinding.ActivityScanBinding
import com.example.app_v1.ui.home.scanActivity.ApiService
import com.example.app_v1.ui.home.scanActivity.ScanActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NetworkActivity : AppCompatActivity() {

    companion object{
        private const val PI_IDENTIFIER = "PI_IDENTIFIER"

        fun getStartIntent(context: Context, piIdentifier: String): Intent {
            return Intent(context, NetworkActivity::class.java).apply {
                putExtra(PI_IDENTIFIER, piIdentifier)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan)


        // --> indique que l'on utilise le ViewBinding
        //binding = ActivityNetworkBinding.inflate(layoutInflater)
        //setContentView(binding.root)


    }

    /*fun getIdentifier(): String? {
        return Intent.getStringExtra(PI_IDENTIFIER)
    }

    private lateinit var binding: ActivityNetworkBinding
    private lateinit var ledStatus:

    // Récupération de l'état depuis le serveur
            private fun getStatus() {
        CoroutineScope(Dispatchers.IO).launch {
            runCatching {
                ledStatus = ApiService.instance.readStatus(getIdentifier())
                setVisualState()
            }
        }
    }

    fun setVisualState(){
        if (ledStatus.status){
            // allumé
        }
        else{
            //eteint
        }
    }*/
}
