package com.example.praticaquadrantes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.praticaquadrantes.ui.theme.ComposeQuadrantTheme

class PraticaQuadrantes : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                ComposeQuadrantTheme {
                    Surface (
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ){
                        QuadrantesApp();
                    }
                }
        }
    }
}

@Composable
fun QuadrantesApp() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Quadrante(
            backgroundColor = Color(0xFFEADDFF),
            modifier = Modifier.weight(1f),
            title = stringResource(R.string.title_text_composable),
            description = stringResource(R.string.content_text_composable)
        )
        Quadrante(
            backgroundColor = Color(0xFFD0BCFF),
            modifier = Modifier.weight(1f),
            title = stringResource(R.string.title_row_composable),
            description = stringResource(R.string.content_row_composable)
        )
        Quadrante(
            backgroundColor = Color(0xFFB69DF8),
            modifier = Modifier.weight(1f),
            title = stringResource(R.string.title_column_composable),
            description = stringResource(R.string.content_column_composable)
        )
    }
}
@Composable
fun Quadrante(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantesAppPreview() {
    ComposeQuadrantTheme {
        QuadrantesApp()
    }
}
