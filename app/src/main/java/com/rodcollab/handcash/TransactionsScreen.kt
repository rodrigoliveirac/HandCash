package com.rodcollab.handcash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TransactionsScreen() {

}
@Preview
@Composable
fun TransactionsScreenPreview() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.padding(16.dp)) {
            HeaderTotalBalancePreview()
            Spacer(modifier = Modifier.size(8.dp))
            Text(style = MaterialTheme.typography.titleLarge,fontSize = 24.sp,textAlign = TextAlign.Center, modifier = Modifier.align(Alignment.CenterHorizontally).fillMaxWidth(),text = "Transactions")
            TransactionListPreview()
        }
    }
}