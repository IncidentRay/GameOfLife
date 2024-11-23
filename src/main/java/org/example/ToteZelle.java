package org.example;

public class ToteZelle implements Zelle {

    boolean heartbeat = false;

    @Override
    public boolean hasHeartbeat() {return heartbeat;}

    @Override
    public void addLife() {
        heartbeat = true;
    }
}
