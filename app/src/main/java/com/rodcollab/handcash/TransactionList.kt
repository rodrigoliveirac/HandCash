package com.rodcollab.handcash

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TransactionList() {

}

data class TransactionModel(
    val iconTypeTransactionModel: ImageVector,
    val category: String,
    val description: String,
    val value: String
)

@Preview(showBackground = true)
@Composable
fun TransactionListPreview() {
    LazyColumn(contentPadding = PaddingValues(16.dp)) {
        items(List(5) {}) {
            TransactionItemPreview()
        }
    }
}