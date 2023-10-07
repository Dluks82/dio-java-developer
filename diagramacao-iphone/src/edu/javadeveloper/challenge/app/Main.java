package edu.javadeveloper.challenge.app;

import edu.javadeveloper.challenge.models.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Utilizando iPhone como um iPod:");
        iphone.selectMusic();
        iphone.play();
        iphone.pause();

        System.out.println("Utilizando iPhone como telefone:");
        iphone.call();
        iphone.answer();
        iphone.voicemail();

        System.out.println("Utilizando iPhone como navegador:");
        iphone.addNewTab();
        iphone.displayPage();
        iphone.refreshPage();
    }
}
