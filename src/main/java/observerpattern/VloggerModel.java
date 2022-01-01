package main.java.observerpattern;

public class VloggerModel {
    //This class also demonstrates how builder pattern is useful, when it comes to building models
    // Here there are 4 params, user might get confused with the order of params, if we start injecting them in constructor
    // Hence each of the setter methods are returning the self reference, using which you can build a chain of setters.
    // Please refer Vlogger.java line no.30, to understand how builder pattern helps

    String vloggerName;
    String vloggerId;
    String videoName;
    String videoLink;

    public String getVloggerName() {
        return vloggerName;
    }

    public VloggerModel setVloggerName(String vloggerName) {
        this.vloggerName = vloggerName;
        return this;
    }

    public String getVloggerId() {
        return vloggerId;
    }

    public VloggerModel setVloggerId(String vloggerId) {
        this.vloggerId = vloggerId;
        return this;
    }

    public String getVideoName() {
        return videoName;
    }

    public VloggerModel setVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public VloggerModel setVideoLink(String videoLink) {
        this.videoLink = videoLink;
        return this;
    }
}
