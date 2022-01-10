package com.example.app_v1.ui.home

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.app_v1.R
import com.example.app_v1.databinding.ActivityHomeBinding
import com.example.app_v1.ui.home.Network.NetworkActivity
import com.example.app_v1.ui.home.scanActivity.LocalPreferences
import com.example.app_v1.ui.home.scanActivity.ScanActivity

class Home : AppCompatActivity() {

    // methode static pour éviter de dupliquer l'endroit ou on créer l'intent
    companion object{
        fun getStartIntent(context: Context): Intent {
            return Intent(context, Home::class.java)
        }
    }

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // --> indique que l'on utilise le ViewBinding
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.scanBleDevices.setOnClickListener {

            // permet de lancer l'activity ScanActivity
            startActivity(ScanActivity.getStartIntent(this))
        }

        binding.networkCommand.setOnClickListener {

            // permet de lancer l'activity Network
            if(LocalPreferences.getInstance(this).lastConnectedDeviceName()== null){
                Toast.makeText(this, getString(R.string.uuid_not_found), Toast.LENGTH_SHORT).show()
            }
            else{
                startActivity(NetworkActivity.getStartIntent(this, LocalPreferences.getInstance(this).lastConnectedDeviceName()!!))
            }
        }
    }


}