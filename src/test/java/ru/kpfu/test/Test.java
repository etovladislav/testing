package ru.kpfu.test;

/**
 * Created by Vladislav Ulyanov on 03.04.18.
 * vk.com/etovladislav
 */

public class Test extends TestBase {
    private Registration registration;
    private Card card;
    private Board board;

    @org.testng.annotations.Test
    public void initPageObjects() {
        registration = new Registration("vxzsdd30123@gmail.com", "Джон Сноу", "12345John");
        card = new Card("Выйти за мать драконов");
        board = new Board("План по захвату королевства");
        appManager.getRegistrationHelper().openRegistrationPage();
        appManager.getRegistrationHelper().fillRegistrationForm(registration);
        appManager.getCreateCardHelper().createNewCard(card);
        appManager.getBoardHelper().createBoard(board);
    }

}
