package view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable


fun SegundaTela(nome: String ,idade : String, navController: NavController){


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(
            text = "Segunda Tela",
            fontSize = 20.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.padding(20.dp))

        Text(
            text = "Nome: $nome",
            fontSize = 18.sp,
            color = Color.Black
        )

        Text(
            text = "Idade: $idade",
            fontSize = 18.sp,
            color = Color.Black,
            textAlign = TextAlign.Start
        )

        Button(
            onClick = {
                navController.navigate("Home")
            },
            modifier = Modifier.fillMaxWidth().padding(20.dp,0.dp)
        ){
            Text(
                text = "Voltar",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold)
        }

    }


}