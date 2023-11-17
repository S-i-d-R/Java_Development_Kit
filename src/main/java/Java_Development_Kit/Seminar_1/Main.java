package Java_Development_Kit.Seminar_1;

import Java_Development_Kit.Seminar_1.client.ClientView;
import Java_Development_Kit.Seminar_1.server.ServerView;

public class Main {
    public static void main(String[] args) {
        ServerView serverView = new ServerView();
        new ClientView(serverView);
        new ClientView(serverView);
    }
}