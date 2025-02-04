package net.staxx;

import net.staxx.core.EngineManager;
import net.staxx.core.WindowManager;
import net.staxx.core.utils.Consts;
import net.staxx.test.TestGame;

public class Launcher {

    private static WindowManager window;
    private static TestGame game;

    public static void main(String[] args) {
        window = new WindowManager(Consts.WINDOW_TITLE, 1600, 900, false);
        game = new TestGame();
        EngineManager engine = new EngineManager();

        try {
            engine.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WindowManager getWindow() {
        return window;
    }

    public static TestGame getGame() {
        return game;
    }

}