public class GoodItem {
    int article,price,count,amount;
    String goodName;

    GoodItem(int a,String n,int p,int c){
        article=a;
        goodName=n;
        price=p;
        count=c;
        amount=c*p;
    }
    void decreaseCount(int c){
        count=count-c;
        amount=count*price;
    }
    void increaseCount(int c){
        count=count+c;
        amount=count*price;
    }
    void setCount(int c){
        count=c;
        amount=count*price;
    }
}
