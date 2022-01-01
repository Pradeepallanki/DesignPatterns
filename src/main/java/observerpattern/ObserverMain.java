package main.java.observerpattern;

public class ObserverMain {
    public static void main(String[] args) {
        Vlogger dailyVlogger = new Vlogger("Prashanth", "uid1");
        Vlogger travelVlogger = new Vlogger("Praveen", "uid2");

        ISubscriber nandan = new Subscriber("Nandan", "uid3");
        ISubscriber nayan = new Subscriber("Nayan", "uid4");

        dailyVlogger.addSubscriber(nandan).addSubscriber(nayan);
        travelVlogger.addSubscriber(nandan).addSubscriber(nayan);

        dailyVlogger.uploadNewVideo("My apartment tour", "https://youtube.com/1");
        travelVlogger.uploadNewVideo("My journey to leh ladakh", "https://youtube.com/2");
    }
}
