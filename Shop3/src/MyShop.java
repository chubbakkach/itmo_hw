import java.text.SimpleDateFormat;
import java.util.*;

public class MyShop {

    private static void printUsage() {
        System.out.println("Полный список комманд:");
        System.out.println("Вывести полный список комманд: help");
        System.out.println("Регистрация: registration");
        System.out.println("Авторизация: login");
        System.out.println("Проверка счета: deposite");
        System.out.println("Пополнение счета: addmoney");
        System.out.println("Просмотр товаров: products");
        System.out.println("Добавление товара в заказ: choose");
        System.out.println("Просмотр заказа: cart");
        System.out.println("Удаление товара из заказа: delete");
        System.out.println("Изменение количества заказанного товара: changeCount");
        System.out.println("Оплата: buy");
        System.out.println("Выход: logout");
    }

    private static void printForAuthorizedUser() {
        System.out.println ( "Добро пожаловать, " + currentUser );
        System.out.println("Вывести полный список комманд: help");
        System.out.println("Проверка счета: deposite");
        System.out.println("Пополнение счета: addmoney");
        System.out.println("Просмотр товаров: products");
        System.out.println("Добавление товара в заказ: choose");
        System.out.println("Просмотр заказа: cart");
        System.out.println("Удаление товара из заказа: delete");
        System.out.println("Изменение количества заказанного товара: changeCount");
        System.out.println("Оплата: buy");
        System.out.println("Выход: logout");
    }

    private static final String REGISTRATION = "registration";
    private static final String LOGIN = "login";
    private static final String LOGOUT = "logout";
    private static final String SHOWPRODUCTS = "products";
    private static final String SHOWCART = "cart";
    private static final String SHOWMONEY = "deposite";
    private static final String ADDMONEY = "addmoney";
    private static final String CHOOSEPRODUCTS = "choose";
    private static final String BUYPRODUCTS = "buy";
    private static final String HELP = "help";
    private static final String DELETEFROMCART = "delete";
    private static final String CHANGECOUNTINCART = "changeCount";

    private static final String TRANSACTIONS = "transactions";

    private static final String SEPARATOR_1 = " ";

    static String currentUser;
    static int transactionCount;


    public static void main ( String[] args ) {
        Map <String, User> usersList = new HashMap <> ();
        User admin = new User("admin");
        admin.setPassword ( "admin" );
        usersList.put ( "admin",admin );
        //транзакции
        transactionCount=1;
        ArrayList <Transaction> transactions=new ArrayList <> (  );
        //товары
        GoodItem good1 = new GoodItem ( 1, "good1", 100, 10 );
        GoodItem good2 = new GoodItem ( 2, "good2", 200, 20 );
        GoodItem good3 = new GoodItem ( 3, "good3", 300, 30 );
        GoodItem good4 = new GoodItem ( 4, "good4", 400, 40 );
        Map <String, GoodItem> goodList = new HashMap <> ();
        goodList.put ( "1", good1 );
        goodList.put ( "2", good2 );
        goodList.put ( "3", good3 );
        goodList.put ( "4", good4 );
        //первый вход
        System.out.println("Регистрация: registration");
        System.out.println("Авторизация: login");
        Scanner scanner = new Scanner ( System.in );
        MyShop messeges = new MyShop ();
        while (true) {
            String line = scanner.nextLine ().trim ();
            if (REGISTRATION.equals ( line )) {
                System.out.println ( "Введите имя пользователя" );
                String l = scanner.nextLine ();
                while (usersList.containsKey ( l )) {
                    System.out.println ( "Имя занято, попробуйте другое" );
                    l = scanner.nextLine ();
                }
                User newUser = new User ( l );
                usersList.put ( l, newUser );
                System.out.println ( "Введите пароль" );
                String p = scanner.nextLine ();
                newUser.setPassword ( p );
                newUser.cart = new HashMap <> ();
                System.out.println ( "Пользователь " + l + " успешно зарегистрирован");
                System.out.println();
                System.out.println("Авторизация: login");
            }
            if (LOGIN.equals ( line )) {
                System.out.println ( "Введите имя пользователя" );
                String l = scanner.nextLine ();
                if (!usersList.containsKey ( l )) {
                    System.out.println ( "Пользователь не найден");
                    System.out.println("Регистрация: registration");
                    System.out.println("Авторизация: login");
                } else {
                    System.out.println ( "Введите пароль" );
                    String p = scanner.nextLine ();
                    while (!usersList.get ( l ).password.equals ( p )) {
                        System.out.println ( "Пароль неверный. Попробуйте еще раз." );
                        p = scanner.nextLine ();
                    }
                    currentUser = l;
                    if (!currentUser.equals ( "admin" )) {
                        printForAuthorizedUser ();
                    } else {
                        System.out.println ( "Просмотр транзакций: transactions" );
                    }
                }
            }
            if (LOGOUT.equals ( line )) {
                currentUser = null;
                System.out.println ( "До свидания");
            }
            if (SHOWMONEY.equals ( line )) {
                System.out.println ( "Ваш счет " + usersList.get ( currentUser ).deposite );
                System.out.println("Пополнение счета: addmoney");
            }
            if (ADDMONEY.equals ( line )) {
                System.out.println ( "Введите сумму для пополнения счета. Например: 200" );
                int m = scanner.nextInt ();
                usersList.get ( currentUser ).addMoney ( m );
                System.out.println ( "Счет пополнен" );
            }
            if (SHOWPRODUCTS.equals ( line )) {
                Iterator <Map.Entry <String, GoodItem>> iterator = goodList.entrySet ().iterator ();
                while (iterator.hasNext ()) {
                    Map.Entry <String, GoodItem> pair = iterator.next ();
                    int article = pair.getValue ().article;
                    String goodName = pair.getValue ().goodName;
                    int price = pair.getValue ().price;
                    int count = pair.getValue ().count;
                    System.out.println ( "Артикул: " + article + ", Название: " + goodName + ", Цена: " + price + ", Доступное количество: " + count );
                }
                System.out.println();
                System.out.println("Добавление товара в заказ: choose");
            }
            if (SHOWCART.equals ( line )) {
                if (usersList.get ( currentUser ).cart.size () < 1) {
                    System.out.println ( "Нет заказанных товаров" );
                } else {
                    Iterator <Map.Entry <String, GoodItem>> iterator = usersList.get ( currentUser ).cart.entrySet ().iterator ();
                    while (iterator.hasNext ()) {
                        Map.Entry <String, GoodItem> pair = iterator.next ();
                        int article = pair.getValue ().article;
                        String goodName = pair.getValue ().goodName;
                        int price = pair.getValue ().price;
                        int count = pair.getValue ().count;
                        int pAmount = pair.getValue ().amount;
                        System.out.println ( "Артикул: " + article + ", Название: " + goodName + ", Цена: " + price + ", Заказанное количество: " + count + ", Сумма: " + pAmount );
                    }
                    System.out.println();
                    System.out.println("Просмотр товаров: products");
                    System.out.println("Добавление товара в заказ: choose");
                    System.out.println("Удаление товара из заказа: delete");
                    System.out.println("Изменение количества заказанного товара: changeCount");
                }
            }
            if (CHOOSEPRODUCTS.equals ( line )) {
                System.out.println ( "Введите артикул и количество товара для заказа через пробел" );
                System.out.println ( "Например: '1 2'" );
                String str = scanner.nextLine ();
                String[] goodSplit = str.split ( SEPARATOR_1 );
                while (goodSplit.length < 2) {
                    System.out.println ( "Введите артикул и количество товара для заказа через пробел" );
                    System.out.println ( "Например: '1 2'" );
                    str = scanner.nextLine ();
                    goodSplit = str.split ( SEPARATOR_1 );
                }
                int c = Integer.parseInt ( goodSplit[1] );
                String k = goodSplit[0];
                while (( !goodList.containsKey ( k ) ) || ( goodList.get ( k ).count < c )) {
                    System.out.println ( "Выбран несуществующий товар или количество больше доступного" );
                    System.out.println ( "Введите артикул и количество товара для заказа через пробел" );
                    System.out.println ( "Например: '1 2'" );
                    str = scanner.nextLine ();
                    goodSplit = str.split ( SEPARATOR_1 );
                    c = Integer.parseInt ( goodSplit[1] );
                    k = goodSplit[0];
                }
                int p = goodList.get ( k ).price;
                String gn = goodList.get ( k ).goodName;
                int a = Integer.parseInt ( k );
                GoodItem userItem = new GoodItem ( a, gn, p, c );
                usersList.get ( currentUser ).addGood ( k, userItem );
                goodList.get ( k ).decreaseCount ( c );
                System.out.println ( "Товар добавлен" );
                System.out.println ();
                System.out.println("Просмотр заказа: cart");
                System.out.println("Оплата: buy");
            }
            if (BUYPRODUCTS.equals ( line )) {
                int cartSum = 0;
                Iterator <Map.Entry <String, GoodItem>> iterator = usersList.get ( currentUser ).cart.entrySet ().iterator ();
                while (iterator.hasNext ()) {
                    Map.Entry <String, GoodItem> pair = iterator.next ();
                    // считаем сумму по корзине
                    int pAmount = pair.getValue ().amount;
                    cartSum += pAmount;
                    }
                //System.out.println ( cartSum );
                if (cartSum>usersList.get ( currentUser ).deposite){
                    System.out.println ( "Не достаточно средств на счете" );
                    System.out.println ( "Пополните счет или измените заказ" );
                    System.out.println("Пополнение счета: addmoney");
                    System.out.println("Просмотр заказа: cart");
                }
                if (cartSum <=usersList.get ( currentUser ).deposite){
                    // заполняем транзакцию
                    Iterator <Map.Entry<String,GoodItem>> iterator2 = usersList.get ( currentUser ).cart.entrySet ().iterator ();
                    while (iterator2.hasNext ()){
                        Map.Entry <String, GoodItem> pair = iterator2.next ();
                        String a = pair.getKey ();
                        int c = pair.getValue ().count;
                        int pa = pair.getValue ().amount;
                        Transaction newTransaction = new Transaction ( currentUser, a, c, pa);
                        newTransaction.setTransactionNumber ( transactionCount );
                        long curTime = System.currentTimeMillis();
                        String transactionDate = new SimpleDateFormat ("dd.MM.yyyy HH:MM").format(curTime);
                        newTransaction.setTransationDate ( transactionDate );
                        transactions.add ( newTransaction );
                    }
                    transactionCount++;
                    //проводим покупку
                    usersList.get(currentUser).subtractMoney ( cartSum );
                    usersList.get(currentUser).cart.clear ();
                    System.out.println ( "Оплата произведена" );
                }
                }
                if (DELETEFROMCART.equals ( line )){
                    System.out.println ( "Укажите артикул товара для удаления из заказа" );
                    String k=scanner.nextLine ();
                    while (!usersList.get ( currentUser ).cart.containsKey ( k )){
                        System.out.println ( "Укажите артикул товара для удаления из заказа" );
                        k=scanner.nextLine ();
                    }
                    int c=usersList.get(currentUser).cart.get(k).count;
                    goodList.get ( k ).increaseCount ( c );
                    usersList.get(currentUser).deleteGood ( k );
                    System.out.println ( "Товар удален из заказа" );
                    System.out.println();
                    System.out.println("Просмотр заказа: cart");
                }
                if (CHANGECOUNTINCART.equals ( line )){
                    System.out.println ( "Укажите артикул товара для изменения количества" );
                    String k=scanner.nextLine ();
                    while (!usersList.get ( currentUser ).cart.containsKey ( k )){
                        System.out.println ( "Укажите артикул товара для изменения количества" );
                        k=scanner.nextLine ();
                    }
                    int c=usersList.get(currentUser).cart.get(k).count;
                    goodList.get ( k ).increaseCount ( c );
                    System.out.println ( "Укажите новое количество товара" );
                    c = scanner.nextInt ();
                    while (c>goodList.get ( k ).count){
                        System.out.println ("Указанное клоичество больше доступного");
                        c = scanner.nextInt ();
                    }
                    usersList.get ( currentUser ).changeGoodCount ( k,c );
                    goodList.get ( k ).decreaseCount ( c );
                    System.out.println ("Изменение количества выполнено");
                    System.out.println();
                    System.out.println("Просмотр заказа: cart");
                }
                if (HELP.equals ( line )){
                    printUsage();
                }
                if (TRANSACTIONS.equals ( line )){
                    if (currentUser.equals ( "admin" )) {
                        if (transactions.isEmpty ()) {
                            System.out.println ( "Покупок еще не было" );
                        } else {
                            for (int i = 0; i < transactions.size (); i++) {
                                System.out.println ( "Транзакция: " + transactions.get ( i ).transactionNumber + ", Время: " + transactions.get ( i ).transationDate + ", Пользователь: " + transactions.get ( i ).userName + ", Артикул: " + transactions.get ( i ).productArticle + ", Количество: " + transactions.get ( i ).productCount + ", Сумма: " + transactions.get ( i ).productAmount );
                            }
                        }
                    } else {
                        System.out.println ( "Команда доступна только администратору" );
                    }
                }
            }
        }
    }