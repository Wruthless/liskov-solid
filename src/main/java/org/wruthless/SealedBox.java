package org.wruthless;

public class SealedBox extends Box implements OpenInterface, BurnInterface{


    @Override
    public void kick() {
        System.out.printf("%s%n", "[+] Kicked the box!");
    }

//    public void open() {
//        throw new UnsupportedOperationException("\n[-] Sealed box, cannot open.");
//    }

    @Override
    public void burn() {
        System.out.printf("%s%n", "[+] Burned the box, that'll \"open\" it!");
    }
}
