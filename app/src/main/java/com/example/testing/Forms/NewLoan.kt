package com.example.testing.Forms

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Checkbox
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp


@Composable
fun NewLoan() {

    Column(modifier = Modifier.fillMaxSize()) {

        Text(
            text = "Personal Details",
            Modifier.padding(10.dp),
            color = Color.Black
        )

        var nameText by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(value = nameText, modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text(text = "Full Name as per Govt ID") }, onValueChange = {
                nameText = it
            })

        Row {
            var mobileText by remember { mutableStateOf(TextFieldValue("")) }
            OutlinedTextField(value = mobileText, modifier = Modifier
                .padding(8.dp)
                .weight(.4f),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                label = { Text(text = "Mobile Number") }, onValueChange = {
                    mobileText = it
                })

            var pinCodeText by remember { mutableStateOf(TextFieldValue("")) }
            OutlinedTextField(value = pinCodeText, modifier = Modifier
                .padding(8.dp)
                .weight(.6f),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                label = { Text(text = "Full Name as per Govt ID") }, onValueChange = {
                    pinCodeText = it
                })
        }

        Spacer(modifier = Modifier.padding(5.dp))

        Text(text = "Do you have Aadhaar Card")

        SimpleCheckboxComponent()

        Text(text = "Do you have PAN Card")

        SimpleCheckboxComponent()

        Text(text = "Do you have Udyam aadhaar Number")

        SimpleCheckboxComponent()

        Text(text = "Referral Code")

        var referralText by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(value = referralText, modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text(text = "Referral Code") }, onValueChange = {
                nameText = it
            })


        nextButton()


    }
}

@Composable
fun nextButton(){

    val context = LocalContext.current
    Button(onClick = { Toast.makeText(context,"Saving",Toast.LENGTH_SHORT).show() } ,
    modifier = Modifier.fillMaxWidth()
        ) {

        Text(text = "Next")
        
    }



}

@Composable
fun SimpleCheckboxComponent() {
    // in below line we are setting
    // the state of our checkbox.
    val checkedState = remember { mutableStateOf(true) }
    // in below line we are displaying a row
    // and we are creating a checkbox in a row.
    Row {
        Checkbox(
            // below line we are setting
            // the state of checkbox.
            checked = checkedState.value,
            // below line is use to add padding
            // to our checkbox.
            modifier = Modifier.padding(8.dp),
            // below line is use to add on check
            // change to our checkbox.
            onCheckedChange = { checkedState.value = it },
        )
        // below line is use to add text to our check box and we are
        // adding padding to our text of checkbox
        Text(text = "Yes", modifier = Modifier.padding(8.dp))

        Checkbox(
            // below line we are setting
            // the state of checkbox.
            checked = checkedState.value,
            // below line is use to add padding
            // to our checkbox.
            modifier = Modifier.padding(8.dp),
            // below line is use to add on check
            // change to our checkbox.
            onCheckedChange = { checkedState.value = it },
        )
        // below line is use to add text to our check box and we are
        // adding padding to our text of checkbox
        Text(text = "No", modifier = Modifier.padding(8.dp))
    }
}


