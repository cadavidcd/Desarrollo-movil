package com.jairoesc.miprimeraaplicacinparaborrar

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity(), View.OnClickListener {

    var hiddenWord: String = ""
    var undercoverWord: String = ""
    var counterNumber: Int = 0
    var counterFails: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("Level", "On Create!")
        setBtn()

    }

    override fun onClick(v: View) {

        when (v.id) {

            R.id.buttonA -> {
                buttonA.isEnabled = false
                checkWord("a")
            }
            R.id.buttonB -> {
                val intent = Intent(this, SecondActivity::class.java).apply {
                    putExtra("data", "Información relevante")
                }
                startActivity(intent)
            }
            R.id.buttonC -> {
                buttonC.isEnabled = false
                checkWord("c")
            }
            else -> {
                Toast.makeText(this, "Otro",
                        Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun doGame(v: View) {
        btnNewGameEasy.visibility = View.INVISIBLE
        btnNewGameMedium.visibility = View.INVISIBLE
        btnNewGameHard.visibility = View.INVISIBLE

        water.visibility = View.VISIBLE
        horizontalScrollView.visibility = View.VISIBLE
        tablet.visibility = View.VISIBLE
        fails.visibility = View.VISIBLE
        counter.visibility = View.VISIBLE
        LabelTries.visibility = View.VISIBLE
        LabelFails.visibility = View.VISIBLE

        when (v.id) {

            R.id.btnNewGameEasy -> {
                doGameWordEasy()
            }
            R.id.btnNewGameMedium -> {
                doGameWordMedium()
            }
            R.id.btnNewGameHard -> {
                doGameWordHard()
            }

        }

        tablet.text = undercoverWord

    }

    fun checkWord(letter: String){
        for (item in hiddenWord.indices) {
            if (hiddenWord[item].toString() == letter){
                //undercoverWord = hiddenWord[item].toString()
            }else{

            }
        }

        counterNumber++
        counter.text = counterNumber.toString()

        counterFails++
        fails.text = counterFails.toString()

        tablet.text = undercoverWord
    }

    fun doGameWordEasy() {
        hiddenWord = "ajo"
        undercoverWord = "___"
    }

    fun doGameWordMedium() {
        hiddenWord = "cuatro"
        undercoverWord = "_____"
    }

    fun doGameWordHard() {
        hiddenWord = "murcielago"
        undercoverWord = "_________"
    }

    override fun onStart() {
        super.onStart()
        Log.v("Level", "On Start!")
    }

    override fun onResume() {
        super.onResume()
        Log.v("Level", "On Resume!")
    }

    override fun onStop() {
        super.onStop()
        Log.v("Level", "On Stop!")
    }

    override fun onPause() {
        super.onPause()
        Log.v("Level", "On Pause!")
    }

    fun setBtn() {
        buttonA.setOnClickListener(this)
        buttonB.setOnClickListener(this)
        buttonC.setOnClickListener(this)
        buttonD.setOnClickListener(this)
        buttonE.setOnClickListener(this)
        buttonF.setOnClickListener(this)
        buttonG.setOnClickListener(this)
        buttonH.setOnClickListener(this)
        buttonI.setOnClickListener(this)
        buttonJ.setOnClickListener(this)
        buttonK.setOnClickListener(this)
        buttonL.setOnClickListener(this)
        buttonM.setOnClickListener(this)
        buttonN.setOnClickListener(this)
        buttonO.setOnClickListener(this)
        buttonP.setOnClickListener(this)
        buttonQ.setOnClickListener(this)
        buttonR.setOnClickListener(this)
        buttonS.setOnClickListener(this)
        buttonT.setOnClickListener(this)
        buttonU.setOnClickListener(this)
        buttonV.setOnClickListener(this)
        buttonW.setOnClickListener(this)
        buttonX.setOnClickListener(this)
        buttonY.setOnClickListener(this)
        buttonZ.setOnClickListener(this)
        buttonNN.setOnClickListener(this)
    }
}
