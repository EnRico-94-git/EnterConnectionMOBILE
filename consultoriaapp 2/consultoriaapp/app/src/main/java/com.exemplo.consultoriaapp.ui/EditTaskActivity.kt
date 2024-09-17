package com.exemplo.consultoriaapp.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.consultoriaapp.R

class EditTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_task)


        val editText = findViewById<EditText>(R.id.edit_company_name)
        val buttonSave = findViewById<Button>(R.id.button_save)

        buttonSave.setOnClickListener {
            val companyName = editText.text.toString()

            if (companyName.isNotEmpty()) {

                Toast.makeText(this, "Empresa '$companyName' salva com sucesso!", Toast.LENGTH_SHORT).show()

            } else {
              
                Toast.makeText(this, "Por favor, insira o nome da empresa.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
