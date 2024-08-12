package com.HelloSpartan.TransactionalHistory.Entity;

import java.sql.Timestamp;

public class TransactionHistory {
    private int id;
    private int userId;
    private int tableId;
    private int amount;
    private String chipType;
    private String crdr;
    private String status;
    private int gatewayId;
   // private int gatewayMode;
    private int paymentMode;
    private int transactionId;
    private String remarks;
    private String transactionType;
    private Timestamp modifiedOn;
    private long linuxModifiedOn;

    public TransactionHistory() {

    }

    public TransactionHistory(int userId, int tableId, float amount, String chipType, String crdr,
                              String status, int gatewayId,int paymentMode,int transactionId, String remarks, String transactionType,
                              Timestamp modifiedOn) {

        this.userId = userId;
        this.tableId = tableId;
        this.amount = (int) amount;
        this.chipType = chipType;
        this.crdr = crdr;
        this.status = status;
        this.gatewayId = gatewayId;
      //  this.gatewayMode = gatewayMode;
        this.paymentMode = paymentMode;
        this.remarks = remarks;
        this.transactionType = transactionType;
        this.modifiedOn = modifiedOn;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getChipType() {
        return chipType;
    }

    public void setChipType(String chipType) {
        this.chipType = chipType;
    }

    public String getCrdr() {
        return crdr;
    }

    public void setCrdr(String crdr) {
        this.crdr = crdr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(int gatewayId) {
        this.gatewayId = gatewayId;
    }

//   public int getGatewayMode() {
//    return gatewayMode;
//  }
//
//   public void setGatewayMode(int gatewayMode) {
//       this.gatewayMode = gatewayMode;
//   }

    public int getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(int paymentMode) {
        this.paymentMode = paymentMode;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public long getLinuxModifiedOn() {
        return linuxModifiedOn;
    }

    public void setLinuxModifiedOn(long linuxModifiedOn) {
        this.linuxModifiedOn = linuxModifiedOn;
    }

}
