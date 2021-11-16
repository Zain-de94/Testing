package com.example.testing.Forms

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun Insurance() {

    Column {

        Text(text = "Text Inputs", style = typography.h6, modifier = Modifier.padding(8.dp))
        var text by remember { mutableStateOf(TextFieldValue("")) }

        TextField(value = text,
            onValueChange = { newValue -> text = newValue },
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            label = { Text("label") },
            placeholder = { Text("placeholder") }
        )

        OutlinedTextField(
            value = text,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            label = { Text(text = "Password") },
            placeholder = { Text(text = "123343") },
            visualTransformation = PasswordVisualTransformation(),
            onValueChange = {
                text = it
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        OutlinedTextField(value = text,
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = null) },
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            label = { Text(text = "Email Address") },
            placeholder = { Text(text = "Your Email") },
            onValueChange = {
                text = it
            })

        OutlinedTextField(value = text,
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = null) },
            trailingIcon = { Icon(imageVector = Icons.Default.Edit, contentDescription = null) },
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            label = { Text(text = " Email Address") },
            placeholder = { Text(text = "your Email") },
            onValueChange = {
                text = it
            })
        var numberText by remember { mutableStateOf(TextFieldValue("")) }

        OutlinedTextField(value = numberText, modifier = Modifier.padding(8.dp).fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text(text = "Phone number") }, onValueChange = {
                numberText = it
            })


    }


}