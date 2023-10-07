package edu.javadeveloper.challenge.models;

import edu.javadeveloper.challenge.interfaces.MusicPlayer;
import edu.javadeveloper.challenge.interfaces.Phone;
import edu.javadeveloper.challenge.interfaces.WebBrowser;

public class Iphone implements MusicPlayer, Phone, WebBrowser {

    public Iphone() {
    }

    @Override
    public void play() {
        System.out.println("Música tocando...");
    }

    @Override
    public void pause() {
        System.out.println("Musica em pausa...");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecionando música...");
    }

    @Override
    public void call() {
        System.out.println("Fazendo uma ligação...");
    }

    @Override
    public void answer() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void voicemail() {
        System.out.println("Ouvindo correio de voz...");
    }

    @Override
    public void displayPage() {
        System.out.println("Exibindo uma página web...");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando a página...");
    }
}
