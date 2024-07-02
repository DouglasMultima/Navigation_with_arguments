package view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable

fun Home(navController: NavController){

    var nome by remember {
        mutableStateOf("")
    }

    var idade by remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
      Text(
          text = "Primeira Tela",
          fontSize = 20.sp,
          color = Color.Black
      )

        Spacer(modifier = Modifier.padding(20.dp))

      OutlinedTextField(

          value =nome,
          onValueChange ={
              nome = it
          },
          label = {
              Text(text = "Nome")
          },
          colors = TextFieldDefaults.outlinedTextFieldColors(
              cursorColor = Color.Blue,
              focusedBorderColor = Color.Blue,
              focusedLabelColor = Color.Blue
          ),
          maxLines = 1,
          singleLine = true,
          modifier = Modifier.fillMaxWidth().padding(20.dp,0.dp,20.dp,0.dp),
          keyboardOptions = KeyboardOptions(
              keyboardType = KeyboardType.Text
          )
      )

        OutlinedTextField(

            value =idade,
            onValueChange ={
                idade = it
            },
            label = {
                Text(text = "Idade")
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                cursorColor = Color.Blue,
                focusedBorderColor = Color.Blue,
                focusedLabelColor = Color.Blue
            ),
            maxLines = 1,
            singleLine = true,
            modifier = Modifier.fillMaxWidth().padding(20.dp,10.dp,20.dp,0.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        )



        Spacer(modifier = Modifier.padding(20.dp))

      Button(
          onClick = {
              navController.navigate("SegundaTela/$nome/$idade")
          },
          modifier = Modifier.fillMaxWidth().padding(20.dp,0.dp)
      ){
          Text(
              text = "Salvar",
              fontSize = 20.sp,
              color = Color.White,
              fontWeight = FontWeight.Bold)
      }

    }

}