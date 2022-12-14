package mx.dev1.sticky.presentation.stickers

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import mx.dev1.sticky.MainActivity
import mx.dev1.sticky.R
import mx.dev1.sticky.databinding.FragmentStickerPackDetailBinding

class StickerPackDetailFragment : Fragment() {
    private var _binding: FragmentStickerPackDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStickerPackDetailBinding.inflate(inflater, container, false)
        (activity as AppCompatActivity).supportActionBar!!.title = "Detalle del pack"

        initListeners()
        return binding.root
    }

    private fun initListeners() {
        binding.btnAddToWhatsapp.setOnClickListener {
            val builder = AlertDialog.Builder(requireContext())
            builder.setTitle("Foo")
            builder.setMessage("Hello buttnuggets !!!")

            val alertDialog = builder.create()
            alertDialog.show()
        }
    }
}