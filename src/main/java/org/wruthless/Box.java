package org.wruthless;

public class Box implements OpenInterface, KickInterface {

    @Override
    public void kick() {
        System.out.printf("%s%n", "[+] Kicked the box!");
    }

    @Override
    public void open() {
        System.out.printf("%s%n", "[+] Opened the box!");
    }
}
