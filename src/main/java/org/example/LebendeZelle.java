package org.example;

public class LebendeZelle implements Zelle {

    boolean heartbeat = true;

    @Override
    public boolean hasHeartbeat() {return heartbeat;}

    public void addLife() {
        heartbeat = true;
    }
}
