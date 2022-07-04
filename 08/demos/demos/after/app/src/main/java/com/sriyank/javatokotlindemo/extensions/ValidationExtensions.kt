package com.sriyank.javatokotlindemo.extensions

import com.google.android.material.textfield.TextInputLayout
import android.widget.EditText


fun EditText.isNotEmpty(textInputLayout: TextInputLayout): Boolean {

	return if (text.toString().isEmpty()) {
		textInputLayout.error = "Cannot be blank !"
		false
	} else {
		textInputLayout.isErrorEnabled = false
		true
	}
}
