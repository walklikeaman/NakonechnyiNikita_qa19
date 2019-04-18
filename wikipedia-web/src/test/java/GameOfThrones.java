import org.testng.annotations.Test;

public class GameOfThrones extends TestBase {

    @Test
    public void testAddArticle() {
        validLogin();
        searchArticle("game of thrones");
        addToFavourites();

    }



}
