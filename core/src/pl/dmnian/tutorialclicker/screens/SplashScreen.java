package pl.dmnian.tutorialclicker.screens;

import com.badlogic.gdx.graphics.Texture;
import pl.dmnian.tutorialclicker.TutorialClickerGame;

/**
 * Created by lenus on 26.07.16.
 */
public class SplashScreen extends  AbstractScreen{

    private Texture splashImg;

    public SplashScreen(TutorialClickerGame game) {
        super(game);
        init();
    }

    private void init() {
        //TO DO implement better assets loading when game grows
        splashImg = new Texture("badlogic.jpg");
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        spriteBatch.begin();
        spriteBatch.draw(splashImg, 0, 0);
        spriteBatch.end();
    }
}
