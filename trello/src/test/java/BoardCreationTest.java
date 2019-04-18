import org.testng.annotations.Test;

public class BoardCreationTest extends TestBase {


    @Test
    public void createBoardTest() {
        initBoardCreationFromHeader();
        typeBoardTitle();
        submitBoardCreation();
    }


}


