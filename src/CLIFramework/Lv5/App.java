package CLIFramework.Lv5;

public abstract class App {
    Menu menu;
    public App() {}

    public void init(int menuSize) {
        menu = new Menu(menuSize);
//        createMenu(menu);
    }



}
