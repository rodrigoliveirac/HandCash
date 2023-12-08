package com.rodcollab.handcash

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TransactionItem() {

}

@Preview(showBackground = true)
@Composable
fun TransactionItemPreview(
    iconTypeTransaction: ImageVector = Icons.Default.KeyboardArrowDown,
    category: String = "Alimentação",
    description: String = "Compras no mercadinho",
    value: String = "100,00"
) {
    Card(modifier = Modifier.padding(8.dp),shape = RoundedCornerShape(12.dp)) {
        Column(modifier = Modifier.padding(16.dp)) {
            Box(modifier = Modifier.border(1.dp, Color.Black, RoundedCornerShape(4.dp))) {
                Text(modifier = Modifier.padding(8.dp),text = category)
            }
            Spacer(modifier = Modifier.size(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = iconTypeTransaction, contentDescription = null)
                Spacer(modifier = Modifier.size(8.dp))
                Text(modifier = Modifier.weight(1f),text = description)
                Text(text = "R$$value")
            }
        }
    }
}