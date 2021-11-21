package com.example.superembroiderer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputEditText

class AddFragment : Fragment() {
    private var counter: Int = 0
    private lateinit var textInputEditText: TextInputEditText
    private lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_add, container, false)

        val saveButton: Button = view.findViewById(R.id.save_button)
        textInputEditText = view.findViewById(R.id.text_input_edit)
        textView = view.findViewById(R.id.text_result_view)

        saveButton.setOnClickListener {
            val number: String = textInputEditText.text.toString()
            val result: Int = counter + number.toInt()
            counter = result
            textView.text = counter.toString()
        }
        return view
    }

}





