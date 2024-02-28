package com.example.navcontroller

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistrationPage(navController: NavHostController) {
    var name by rememberSaveable{
        mutableStateOf("")
    }
    var lastname by rememberSaveable{
        mutableStateOf("")
    }
    var password by rememberSaveable{
        mutableStateOf("")
    }

    Surface(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .size(500.dp, 800.dp)
            .padding(8.dp)
            .fillMaxSize()) {
            Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Registration Page", fontSize = 25.sp, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(value = name, onValueChange = {name = it},
                    label = {
                        Text(text = "Name")
                    })
                OutlinedTextField(value = lastname, onValueChange = {lastname = it},
                    label = {
                        Text(text = "Lastname")
                    })
                OutlinedTextField(value = password, onValueChange = {password = it},
                    label = {
                        Text(text = "Password")
                    })
                Spacer(modifier = Modifier.height(5.dp))
                OutlinedButton(onClick = {
                    navController.navigate("login")
                }) {
                    Text(text = "Register")
                }
            }
        }
    }
}

