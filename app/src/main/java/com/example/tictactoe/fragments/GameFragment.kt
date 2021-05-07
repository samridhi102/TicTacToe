package com.example.tictactoe.fragments

import android.app.AlertDialog
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.tictactoe.R
import com.example.tictactoe.databinding.FragmentGameBinding
import com.example.tictactoe.util.autoCleared


class GameFragment: Fragment(R.layout.fragment_game) {
    var i=0
    var p1Score=0
    var p2Score=0
    var totalMatches=0
    var xArray= arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 0))
    var oArray= arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 0))
    var bArray= arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 0))
    private val args: GameFragmentArgs by navArgs()
    private val player1 by lazy {
        args.playerNameOne
    }
    private val player2 by lazy {
        args.playerNameTwo
    }
    private var binding by autoCleared<FragmentGameBinding>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentGameBinding.bind(view)
        ticTacToe()
        binding.txtPlayer1.text=player1+":"
        binding.txtPlayer2.text=player2+":"

    }
    private fun ticTacToe(){
        binding.score1.text= p1Score.toString()
        binding.score2.text=p2Score.toString()
        binding.totalMatch.text=totalMatches.toString()
        binding.box11.setOnClickListener {
            i++
            bArray[0][0]=1
            if(i%2==0){
                binding.zero11.isVisible=true
                oArray[0][0]=1
                is0Winner()
            }
            else{
                binding.cross11.isVisible=true
                xArray[0][0]=1
                isXWinner()
            }
            binding.box11.isClickable=false
        }
        binding.box12.setOnClickListener {
            i++
            bArray[0][1]=1
            if(i%2==0){
                binding.zero12.isVisible=true
                oArray[0][1]=1
                is0Winner()
            }
            else{
                binding.cross12.isVisible=true
                xArray[0][1]=1
                isXWinner()
            }
            binding.box12.isClickable=false
        }
        binding.box13.setOnClickListener {
            i++
            bArray[0][2]=1
            if(i%2==0){
                binding.zero13.isVisible=true
                oArray[0][2]=1
                is0Winner()
            }
            else{
                binding.cross13.isVisible=true
                xArray[0][2]=1
                isXWinner()
            }
            binding.box13.isClickable=false
        }
        binding.box21.setOnClickListener {
            i++
            bArray[1][0]=1
            if(i%2==0){
                binding.zero21.isVisible=true
                oArray[1][0]=1
                is0Winner()
            }
            else{
                binding.cross21.isVisible=true
                xArray[1][0]=1
                isXWinner()
            }
            binding.box21.isClickable=false
        }
        binding.box22.setOnClickListener {
            i++
            bArray[1][1]=1
            if(i%2==0){
                binding.zero22.isVisible=true
                oArray[1][1]=1
                is0Winner()
            }
            else{
                binding.cross22.isVisible=true
                xArray[1][1]=1
                isXWinner()
            }
            binding.box22.isClickable=false
        }
        binding.box23.setOnClickListener {
            i++
            bArray[1][2]=1
            if(i%2==0){
                binding.zero23.isVisible=true
                oArray[1][2]=1
                is0Winner()
            }
            else{
                binding.cross23.isVisible=true
                xArray[1][2]=1
                isXWinner()
            }
            binding.box23.isClickable=false
        }
        binding.box31.setOnClickListener {
            i++
            bArray[2][0]=1
            if(i%2==0){
                binding.zero31.isVisible=true
                oArray[2][0]=1
                is0Winner()
            }
            else{
                binding.cross31.isVisible=true
                xArray[2][0]=1
                isXWinner()
            }
            binding.box31.isClickable=false
        }
        binding.box32.setOnClickListener {
            i++
            bArray[2][1]=1
            if(i%2==0){
                binding.zero32.isVisible=true
                oArray[2][1]=1
                is0Winner()
            }
            else{
                binding.cross32.isVisible=true
                xArray[2][1]=1
                isXWinner()
            }
            binding.box32.isClickable=false
        }
        binding.box33.setOnClickListener {
            i++
            bArray[2][2]=1
            if(i%2==0){
                binding.zero33.isVisible=true
                oArray[2][2]=1
                is0Winner()
            }
            else{
                binding.cross33.isVisible=true
                xArray[2][2]=1
                isXWinner()
            }
            binding.box33.isClickable=false
        }
    }
    private fun isXWinner(){
        if(xArray[0][0]==1&&xArray[0][1]==1&&xArray[0][2]==1){
            winner(player1)
            return
        }
        else if(xArray[0][0]==1&&xArray[1][0]==1&&xArray[2][0]==1){
            winner(player1)
            return
        }
        else if(xArray[0][0]==1&&xArray[1][1]==1&&xArray[2][2]==1){
            winner(player1)
            return
        }
        else if(xArray[1][0]==1&&xArray[1][1]==1&&xArray[1][2]==1){
            winner(player1)
            return
        }
        else if(xArray[2][0]==1&&xArray[2][1]==1&&xArray[2][2]==1){
            winner(player1)
            return
        }
        else if(xArray[0][1]==1&&xArray[1][1]==1&&xArray[2][1]==1){
            winner(player1)
            return
        }
        else if(xArray[0][2]==1&&xArray[1][2]==1&&xArray[2][2]==1){
            winner(player1)
            return
        }
        else if(xArray[0][2]==1&&xArray[1][1]==1&&xArray[2][0]==1){
            winner(player1)
            return
        }
        else{
            isDraw()
        }
    }
    private fun is0Winner(){
        if(oArray[0][0]==1&&oArray[0][1]==1&&oArray[0][2]==1){
            winner(player2)
            return
        }
        else if(oArray[0][0]==1&&oArray[1][0]==1&&oArray[2][0]==1){
            winner(player2)
            return
        }
        else if(oArray[0][0]==1&&oArray[1][1]==1&&oArray[2][2]==1){
            winner(player2)
            return
        }
        else if(oArray[1][0]==1&&oArray[1][1]==1&&oArray[1][2]==1){
            winner(player2)
            return
        }
        else if(oArray[2][0]==1&&oArray[2][1]==1&&oArray[2][2]==1){
            winner(player2)
            return
        }
        else if(oArray[0][1]==1&&oArray[1][1]==1&&oArray[2][1]==1){
            winner(player2)
            return
        }
        else if(oArray[0][2]==1&&oArray[1][2]==1&&oArray[2][2]==1){
            winner(player2)
            return
        }
        else if(oArray[0][2]==1&&oArray[1][1]==1&&oArray[2][0]==1){
            winner(player2)
            return
        }
        else{
            isDraw()
        }
    }
    private fun winner(playerName: String){

        val builder1: AlertDialog.Builder = AlertDialog.Builder(context)
        builder1.setTitle("Yayyyy")
        builder1.setMessage(playerName + " won")
        builder1.setCancelable(false)
        builder1.setNeutralButton("Ok") { dialog, which ->
                startNewGame()
            }


        val alert11: AlertDialog = builder1.create()
        alert11.show()
        val positiveButton: Button = alert11.getButton(AlertDialog.BUTTON_NEUTRAL)
        val positiveButtonLL = positiveButton.getLayoutParams()
        positiveButtonLL.width = ViewGroup.LayoutParams.MATCH_PARENT
        positiveButton.setLayoutParams(positiveButtonLL)
        totalMatches++
        if(playerName==player1){
            p1Score++
        }
        else if(playerName==player2){
            p2Score++
        }

    }
    private fun startNewGame(){
        binding.cross11.isVisible=false
        binding.cross12.isVisible=false
        binding.cross13.isVisible=false
        binding.cross21.isVisible=false
        binding.cross22.isVisible=false
        binding.cross23.isVisible=false
        binding.cross31.isVisible=false
        binding.cross32.isVisible=false
        binding.cross33.isVisible=false
        binding.zero11.isVisible=false
        binding.zero12.isVisible=false
        binding.zero13.isVisible=false
        binding.zero21.isVisible=false
        binding.zero22.isVisible=false
        binding.zero23.isVisible=false
        binding.zero31.isVisible=false
        binding.zero32.isVisible=false
        binding.zero33.isVisible=false
         i=0
         for(i in 0..2){
             for(j in 0..2){
                 xArray[i][j]=0
             }
         }
        for(i in 0..2){
            for(j in 0..2){
                oArray[i][j]=0
            }
        }
        for(i in 0..2){
            for(j in 0..2){
                bArray[i][j]=0
            }
        }
        ticTacToe()

    }

    private fun isDraw(){
        if(bArray[0][0]==1&&bArray[0][1]==1&&bArray[0][2]==1&&bArray[1][0]==1&&bArray[1][1]==1&&bArray[1][2]==1&&bArray[2][0]==1&&bArray[2][1]==1&&bArray[2][2]==1){
            val builder1: AlertDialog.Builder = AlertDialog.Builder(context)
            builder1.setTitle("Oops")
            builder1.setMessage("Match Draw")
            builder1.setCancelable(false)
            builder1.setNeutralButton("Ok") { dialog, which ->
                startNewGame()
            }
            val alert11: AlertDialog = builder1.create()
            alert11.show()
            val positiveButton: Button = alert11.getButton(AlertDialog.BUTTON_NEUTRAL)
            val positiveButtonLL = positiveButton.getLayoutParams()
            positiveButtonLL.width = ViewGroup.LayoutParams.MATCH_PARENT
            positiveButton.setLayoutParams(positiveButtonLL)
            totalMatches++
        }
    }

}