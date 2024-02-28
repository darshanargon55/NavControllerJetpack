package com.example.navcontroller

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPage(onClick : (String)->Unit) {
    var name by rememberSaveable{
        mutableStateOf("")
    }
    var password by rememberSaveable{
        mutableStateOf("")
    }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(300.dp, 300.dp)
                    .padding(8.dp)
            ) {
                Column {
                    Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Login Page",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 25.sp,
                            modifier = Modifier.padding(5.dp)
                        )
                    }
                    Spacer(modifier = Modifier.padding(8.dp))
                    OutlinedTextField(value = name, onValueChange = {name = it},
                        modifier = Modifier.padding(),
                        label = { Text(text = "Name") })
                    OutlinedTextField(value = password, onValueChange = {password = it},
                        modifier = Modifier.padding(),
                        label = { Text(text = "Password") })
                    Spacer(modifier = Modifier.padding(8.dp))
                    Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                        OutlinedButton(onClick = {
                            onClick(name)
                        }) {
                            Text(text = "Login")
                        }
                    }
                }
            }
        }
    }
}

