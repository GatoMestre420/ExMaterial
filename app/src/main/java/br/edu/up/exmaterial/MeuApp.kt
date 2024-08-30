package br.edu.up.exmaterial

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.edu.up.exmaterial.ui.screen.HomeScreen
import br.edu.up.exmaterial.ui.screen.SegundaScreen
import br.edu.up.exmaterial.ui.screen.TerceiraScreen
import br.edu.up.exmaterial.ui.theme.Purple80

@Preview(
    device = Devices.PIXEL
)
@Composable
fun Layout(){
    Column(modifier = Modifier.fillMaxSize()
        .background(Color(0xFFFFF9C5)),
        verticalArrangement = Arrangement.SpaceAround    ) {
        Text(
            "A",
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(100.dp).height(50.dp)
                .background(Color(0xFF89F9C5))
        )
        Text(
            "B",
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(100.dp).height(50.dp)
                .background(Color(0xFFF569C5))
        )
        Text(
            "C",
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(100.dp).height(50.dp)
                .background(Color(0xFFD0BCFF))
        )
    }
}


@Composable
fun Texto(){
    Column(modifier = Modifier.fillMaxSize()) {
        Text("Apenas um texto...",
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFF31C424)))
    }

}

@Composable
fun MeuApp(){
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        val tela = 2
        when(tela){
            1 -> HomeScreen(titulo = "Tela Principal",
                modifier = Modifier.padding(innerPadding))
            2 -> SegundaScreen(titulo = "Segunda Tela",
                modifier = Modifier.padding(innerPadding))
            3 -> TerceiraScreen(titulo = "Terceira Tela",
                modifier = Modifier.padding(innerPadding))
        }
    }
}
