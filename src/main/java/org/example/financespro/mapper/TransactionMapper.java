package org.example.financespro.mapper;

import java.math.BigDecimal;
import org.example.financespro.dto.response.TransactionResponseDto;
import org.example.financespro.model.Transaction;

public class TransactionMapper {

  private TransactionMapper() {}

  public static TransactionResponseDto toResponseDTO(
      Transaction transaction, BigDecimal remainingBalance) {
    TransactionResponseDto response = new TransactionResponseDto();
    response.setTransactionType(transaction.getType());
    response.setTransactionAmount(transaction.getAmount());
    response.setTransactionCost(transaction.getTransactionCost());
    response.setRemainingBalance(remainingBalance);
    return response;
  }
}
