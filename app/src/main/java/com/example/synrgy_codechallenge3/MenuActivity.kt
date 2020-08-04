package com.example.codechallengegamesuitsynrgy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.synrgy_codechallenge3.R
import com.example.synrgy_codechallenge3.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //deklarasi

    var inputComp = ""
    var inputPemain1 = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView (binding.root)

        val listGames = listOf("Batu", "Kertas", "Gunting")


        binding.ivBatu.setOnClickListener{
            inputPemain1 = "Batu"
            Log.d("Pilihan Pemain 1", inputPemain1)
            inputComp = listGames.random()

            binding.ivBatu.isClickable = false
            binding.ivGunting.isClickable = false
            binding.ivKertas.isClickable = false

            binding.ivBatu.setBackgroundResource(R.drawable.setonclick_bg)

            when (inputComp) {
                "Batu" -> {
                    binding.ivBatuCom.setBackgroundResource(R.drawable.setonclick_bg)
                    binding.ivVersus.setImageResource(R.drawable.draw)
                    Log.d("Hasil Suit", "DRAW" )
                }
                "Gunting" -> {
                    binding.ivGuntingCom.setBackgroundResource(R.drawable.setonclick_bg)
                    binding.ivVersus.setImageResource(R.drawable.pemain1_menang)
                    Log.d("Hasil Suit", "Pemain1 Menang")
                }
                "Kertas" -> {
                    binding.ivKertasCom.setBackgroundResource(R.drawable.setonclick_bg)
                    binding.ivVersus.setImageResource(R.drawable.com_menang)
                    Log.d("Hasil Suit", "COM Menang")
                }
            }
        }

        binding.ivGunting.setOnClickListener{
            inputPemain1 = "Gunting"
            Log.d("Pilihan Pemain1", inputPemain1)
            inputComp = listGames.random()

            binding.ivBatu.isClickable = false
            binding.ivGunting.isClickable = false
            binding.ivKertas.isClickable = false

            binding.ivGunting.setBackgroundResource(R.drawable.setonclick_bg)
            when (inputComp) {
                "Batu" -> {
                    binding.ivBatuCom.setBackgroundResource(R.drawable.setonclick_bg)
                    binding.ivVersus.setImageResource(R.drawable.com_menang)
                    Log.d("Hasil Suit", "COM Menang" )
                }
                "Gunting" -> {
                    binding.ivGuntingCom.setBackgroundResource(R.drawable.setonclick_bg)
                    binding.ivVersus.setImageResource(R.drawable.draw)
                    Log.d("Hasil Suit", "DRAW")
                }
                "Kertas" -> {
                    binding.ivKertasCom.setBackgroundResource(R.drawable.setonclick_bg)
                    binding.ivVersus.setImageResource(R.drawable.pemain1_menang)
                    Log.d("Hasil Suit", "Pemain1 Menang")
                }
            }
        }

        binding.ivKertas.setOnClickListener {
            inputPemain1 = "Kertas"
            Log.d("Pilihan Pemain1", inputPemain1)
            inputComp = listGames.random()

            binding.ivBatu.isClickable = false
            binding.ivGunting.isClickable = false
            binding.ivKertas.isClickable = false

            binding.ivKertas.setBackgroundResource(R.drawable.setonclick_bg)
            when (inputComp) {
                "Batu" -> {
                    binding.ivBatuCom.setBackgroundResource(R.drawable.setonclick_bg)
                    binding.ivVersus.setImageResource(R.drawable.pemain1_menang)
                    Log.d("Hasil Suit", "Pemain1 Menang")
                }
                "Gunting" -> {
                    binding.ivGuntingCom.setBackgroundResource(R.drawable.setonclick_bg)
                    binding.ivVersus.setImageResource(R.drawable.com_menang)
                    Log.d("Hasil Suit", "COM Menang")
                }
                "Kertas" -> {
                    binding.ivKertasCom.setBackgroundResource(R.drawable.setonclick_bg)
                    binding.ivVersus.setImageResource(R.drawable.draw)
                    Log.d("Hasil Suit", "DRAW")
                }
            }
        }

        binding.btnReturn.setOnClickListener{
            binding.ivBatu.isClickable = true
            binding.ivGunting.isClickable = true
            binding.ivKertas.isClickable = true

            binding.ivBatuCom.setBackgroundResource(R.drawable.setonclick_no_bg)
            binding.ivKertasCom.setBackgroundResource(R.drawable.setonclick_no_bg)
            binding.ivGuntingCom.setBackgroundResource(R.drawable.setonclick_no_bg)

            binding.ivBatu.setBackgroundResource(R.drawable.setonclick_no_bg)
            binding.ivKertas.setBackgroundResource(R.drawable.setonclick_no_bg)
            binding.ivGunting.setBackgroundResource(R.drawable.setonclick_no_bg)

            binding.ivVersus.setImageResource(R.drawable.ic_vs)
        }
    }
}