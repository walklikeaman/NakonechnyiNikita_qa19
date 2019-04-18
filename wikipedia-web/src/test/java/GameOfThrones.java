import org.testng.annotations.Test;

public class GameOfThrones extends TestBase {

    @Test
    public void testAddArticle() {
        selectLanguage();
        initLogin();
        fillLoginForm("Whofarted1904", "Elton1904");
        confirmLogin();
        searchArticle("game of thrones");
        addToFavourites();

    }


}
