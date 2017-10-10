package com.palmtoploan.beans;

import java.util.List;

/**
 * Created by admin on 2017/2/8.
 */
public class BillBean {
    private String code;
    private String msg;
    private dataEntity data;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(dataEntity data) {
        this.data = data;
    }
    public dataEntity getData() {
        return data;
    }

    public static class dataEntity{
        private innerData data;
        public void setData(innerData data) {
            this.data = data;
        }
        public innerData getData() {
            return data;
        }

        public static class innerData{
            private String count;
            private List<listItem> list;

            public List<listItem> getList() {
                return list;
            }
            public void setList(List<listItem> list) {
                this.list = list;
            }


            public String getCount() {
                return count;
            }
            public void setCount(String count) {
                this.count = count;
            }

            public class listItem{
                private String alreadyAmount;
                private String payCard;
                private String delegateUrl;
                private String loanAmount;
                private String lendAmount;
                private String describle;
                private String lendTime;
                private String interest;
                private String creatTime;
                private String repayDate;
                private String repayAmount;
                private String overdueAmount;
                private String type;
                private String billState;
                private String red;
                private String orderId;

                public String getOrderId() {
                    return orderId;
                }

                public void setOrderId(String orderId) {
                    this.orderId = orderId;
                }

                public String getRed() {
                    return red;
                }

                public void setRed(String red) {
                    this.red = red;
                }

                public String getOverdueAmount() {
                    return overdueAmount;
                }

                public String getType() {
                    return type;
                }

                public String getBillState() {
                    return billState;
                }

                public void setOverdueAmount(String overdueAmount) {
                    this.overdueAmount = overdueAmount;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public void setBillState(String billState) {
                    this.billState = billState;
                }

                public String getAlreadyAmount() {
                    return alreadyAmount;
                }

                public String getPayCard() {
                    return payCard;
                }

                public String getDelegateUrl() {
                    return delegateUrl;
                }

                public String getLoanAmount() {
                    return loanAmount;
                }

                public String getLendAmount() {
                    return lendAmount;
                }

                public String getDescrible() {
                    return describle;
                }

                public String getLendTime() {
                    return lendTime;
                }

                public String getInterest() {
                    return interest;
                }

                public String getCreatTime() {
                    return creatTime;
                }

                public String getRepayDate() {
                    return repayDate;
                }

                public String getRepayAmount() {
                    return repayAmount;
                }

                public void setAlreadyAmount(String alreadyAmount) {
                    this.alreadyAmount = alreadyAmount;
                }

                public void setPayCard(String payCard) {
                    this.payCard = payCard;
                }

                public void setDelegateUrl(String delegateUrl) {
                    this.delegateUrl = delegateUrl;
                }

                public void setLoanAmount(String loanAmount) {
                    this.loanAmount = loanAmount;
                }

                public void setLendAmount(String lendAmount) {
                    this.lendAmount = lendAmount;
                }

                public void setDescrible(String describle) {
                    this.describle = describle;
                }

                public void setLendTime(String lendTime) {
                    this.lendTime = lendTime;
                }

                public void setInterest(String interest) {
                    this.interest = interest;
                }

                public void setCreatTime(String creatTime) {
                    this.creatTime = creatTime;
                }

                public void setRepayDate(String repayDate) {
                    this.repayDate = repayDate;
                }

                public void setRepayAmount(String repayAmount) {
                    this.repayAmount = repayAmount;
                }
            }
        }

    }
}
