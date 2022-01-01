package main.java.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Vlogger {

    private String vloggerName;
    private String vloggerId;

    private List<ISubscriber> subscriberList = new ArrayList<>();

    public Vlogger(String vloggerName, String vloggerId) {
        this.vloggerName = vloggerName;
        this.vloggerId = vloggerId;
    }

    public Vlogger addSubscriber(ISubscriber subscriber) {
        subscriberList.add(subscriber);
        return this;
    }

    public void notifySubscribers(VloggerModel vloggerModel) {
        for(ISubscriber subscriber: subscriberList) {
            subscriber.notify(vloggerModel);
        }
    }

    public void uploadNewVideo(String videoName, String videoLink) {
        VloggerModel vloggerModel = new VloggerModel().setVloggerId(vloggerId)
                .setVloggerName(vloggerName)
                .setVideoName(videoName)
                .setVideoLink(videoLink);

        notifySubscribers(vloggerModel);
    }
}
