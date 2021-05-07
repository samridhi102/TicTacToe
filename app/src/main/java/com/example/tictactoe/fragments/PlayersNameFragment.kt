package com.example.tictactoe.fragments
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tictactoe.R
import com.example.tictactoe.databinding.FragmentPlayersNameBinding
import com.example.tictactoe.util.AppHeaders
import com.example.tictactoe.util.autoCleared

class PlayersNameFragment:Fragment(R.layout.fragment_players_name) {

    private var binding by autoCleared<FragmentPlayersNameBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPlayersNameBinding.bind(view)

        binding.btnSubmit.setOnClickListener {

            if(binding.edTxtFirstPlayer.text.toString().isEmpty()||binding.edTxtSecondPlayer.text.toString().isEmpty()){
                Toast.makeText(context, "Provide a valid name", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
                findNavController().navigate(PlayersNameFragmentDirections.actionPlayersNameFragmentToGamesFragment(binding.edTxtFirstPlayer.text.toString(),binding.edTxtSecondPlayer.text.toString()))
        }
    }
}