package com.company;

public class interfacecls {
    public static void main(String args[])
    {
     remote remote=new televison();
     remote.changechannel();
     remote.poweroff();
     remote.poweron();
     remote.voldown();
     remote.volup();
    }
}
interface remote
{
    void changechannel();
    void volup();
    void voldown();
    void poweroff();
    void poweron();
}
class televison implements remote
{

    @Override
    public void changechannel() {
        System.out.println("change channel");
    }

    @Override
    public void volup() {
        System.out.println("volume up");
    }

    @Override
    public void voldown() {
        System.out.println("volume down");
    }

    @Override
    public void poweroff() {
        System.out.println("power off");
    }

    @Override
    public void poweron() {
        System.out.println("power on");
    }
}
