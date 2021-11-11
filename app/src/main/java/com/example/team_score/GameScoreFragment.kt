package com.example.team_score

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.team_score.databinding.FragmentGameScoreBinding


class GameScoreFragment : Fragment() {
    private var _binding: FragmentGameScoreBinding? = null
    val binding get() = _binding
    private val viewmodel: ScoreViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater,R.layout.fragment_game_score ,container, false)
        return _binding?.root
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("GameFragment", "GameFragment destroyed!")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.scoreviewmodel = viewmodel
        binding?.lifecycleOwner = viewLifecycleOwner


        binding?.Buttonplusone?.setOnClickListener {
            viewmodel.Plus()
        }
        binding?.buttonplus4?.setOnClickListener {
            viewmodel.plus2()

        }
        binding?.buttonsubtracttwo?.setOnClickListener {
            viewmodel.subtract()

        }

    }




}