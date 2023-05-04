package org.wruthless;

public class Main {
    public static void main(String[] args) {

        Box box = new Box();
        box.kick();
        box.open();

        /**
         * sealedBox is implemented using the KickInterface below.
         */
        // Box sealedBox = new SealedBox();
        // sealedBox.kick();

        /**
         * Violates LSP. The SealedBox class overrides the open() method
         * with an implementation that throws an exception. When a SealedBox
         * object replaces a Box object, the program does not continue
         * to behave as we expect.
         */
        //sealedBox.open();

        /**
         * sealedBox.open() is not possible. SealedBox does not implement
         * the OpenInterface interface. We are basing our implementations
         * off of abstractions. This adheres to dependency version.
         */
          KickInterface sealedBox = new SealedBox();
          sealedBox.kick();

          BurnInterface openSealedBox = new SealedBox();
          openSealedBox.burn();

    }
}