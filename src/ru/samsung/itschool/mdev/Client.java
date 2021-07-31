package ru.samsung.itschool.mdev;

class Client extends Thread {
    SynchronizedLogic.Account account;

    public Client(SynchronizedLogic.Account acc) {
        account = acc;
    }

    @Override
    public void run() {
//		synchronized (account) {
        if (account.money - 70 > 0) {
            try {
                // иммитируем задержку банкомата
                sleep((long) (1000 * Math.random()));
            } catch (InterruptedException e) {}
            account.money -= 70;
            System.out.println(account.money);
        }
        else System.out.println("there are not enough funds on your account");
//		}
    }
}
