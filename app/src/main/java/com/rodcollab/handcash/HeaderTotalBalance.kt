package com.rodcollab.handcash

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeaderTotalBalance() {

}

@Preview(showBackground = true)
@Composable
fun HeaderTotalBalancePreview(
    totalBalance: String = "00,00",
    incomes: String = "00,00",
    outcomes: String = "00,00"
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .border(border = BorderStroke(1.dp, Color.LightGray), shape = RoundedCornerShape(6.dp))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(style = MaterialTheme.typography.titleMedium,text = "Total Balance: R$${totalBalance}", fontSize = 24.sp)
            Spacer(modifier = Modifier.size(8.dp))
            Row {
                Card(modifier = Modifier.weight(1f)) {
                    Column(
                        modifier = Modifier.padding(8.dp),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "R$${incomes}", fontSize = 16.sp)
                        Spacer(modifier = Modifier.size(8.dp))
                        Row {
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowUp,
                                contentDescription = null
                            )
                            Spacer(modifier = Modifier.size(8.dp))
                            Text(text = "incomes")
                        }
                    }
                }
                Spacer(modifier = Modifier.size(8.dp))
                Card(modifier = Modifier.weight(1f)) {
                    Column(
                        modifier = Modifier.padding(8.dp),
                    ) {
                        Text(text = "R$${outcomes}", fontSize = 16.sp)
                        Spacer(modifier = Modifier.size(8.dp))
                        Row {
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowUp,
                                contentDescription = null
                            )
                            Spacer(modifier = Modifier.size(8.dp))
                            Text(text = "outcomes")
                        }
                    }
                }
            }
        }
    }
}