package com.example.appcenter_project_2_fix

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.appcenter_project_2_fix.databinding.DialPhoneBinding

class PhoneDial : Fragment() {
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DialPhoneBinding.inflate(inflater, container, false)
        binding.oneBtn.setOnClickListener{
            binding.dial.text = binding.dial.text.toString() + "1"
        }
        binding.twoBtn.setOnClickListener{
            binding.dial.text = binding.dial.text.toString() + "2"
        }
        binding.threeBtn.setOnClickListener{
            binding.dial.text = binding.dial.text.toString() + "3"
        }
        binding.fourBtn.setOnClickListener{
            binding.dial.text = binding.dial.text.toString() + "4"
        }
        binding.fiveBtn.setOnClickListener{
            binding.dial.text = binding.dial.text.toString() + "5"
        }
        binding.sixBtn.setOnClickListener{
            binding.dial.text = binding.dial.text.toString() + "6"
        }
        binding.sevenBtn.setOnClickListener{
            binding.dial.text = binding.dial.text.toString() + "7"
        }
        binding.eightBtn.setOnClickListener{
            binding.dial.text = binding.dial.text.toString() + "8"
        }
        binding.nineBtn.setOnClickListener{
            binding.dial.text = binding.dial.text.toString() + "9"
        }
        binding.starBtn.setOnClickListener{
            binding.dial.text = binding.dial.text.toString() + "*"
        }
        binding.zeroBtn.setOnClickListener{
            binding.dial.text = binding.dial.text.toString() + "0"
        }
        binding.deleteBtn.setOnClickListener{
            val length = binding.dial.text.length
            if(length > 0)
                binding.dial.text = binding.dial.text.substring(0, length - 1)
        }

        binding.callBtn.setOnClickListener {
            Toast.makeText(it.context, "error!", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }
}