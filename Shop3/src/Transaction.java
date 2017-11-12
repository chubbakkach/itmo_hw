public class Transaction {
    String userName, productArticle,transationDate;
    int transactionNumber, productCount,productAmount;
    Transaction (String n, String a, int c, int pa){
        userName=n;
        productArticle=a;
        productCount=c;
        productAmount=pa;
    }

    void setTransactionNumber (int n){
        transactionNumber=n;
    }

    void setTransationDate (String d){
        transationDate=d;
    }
    //String transationDate = new SimpleDateFormat("dd.MM.yyyy").format(curTime);
}
