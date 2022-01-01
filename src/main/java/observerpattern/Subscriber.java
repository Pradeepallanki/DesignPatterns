package main.java.observerpattern;

public class Subscriber implements ISubscriber{
    String subscriberName;
    String userId;

    public Subscriber(String name, String userId) {
        this.subscriberName = name;
        this.userId = userId;
    }

    @Override
    public void notify(Object o) {
         VloggerModel vloggerModel = (VloggerModel) o;
         System.out.println("Dear "+ subscriberName +", "+ vloggerModel.getVloggerName() +" has uploaded a new video,titled `"+ vloggerModel.getVideoName() +"` please click here to view "+ vloggerModel.getVideoLink());
    }
}
