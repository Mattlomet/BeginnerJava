package com.company;

public class TV {
    int channel;
    boolean isOn;

    public TV(int channelIn){
        this.channel = channelIn;
    }

    public boolean On(){
        this.isOn = true;
        return this.isOn;
    }
    public boolean Off(){
        this.isOn = false;
        return this.isOn;
    }


    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
