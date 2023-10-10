package fileupload;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileUploadTest extends BaseTest {

    String testFileDirectory = "/Users/aaron/Repos/tau-selenium-java/src/main/resources/test-files/";

    @Test
    @DisplayName("Can upload a text file")
    public void uploadTextFileTest(){
        String testFile = "test.txt";
        var fileUploaderPage = homePage.clickFileUploader();
        assertEquals("File Uploader", fileUploaderPage.getTitle(), "File uploader page title is wrong.");
        fileUploaderPage.uploadFile(testFileDirectory + "/" + testFile);

        assertEquals("File Uploaded!", fileUploaderPage.getTitle(), "File was not uploaded");
        assertEquals(fileUploaderPage.getUploadMessage(), testFile, "Uploaded file name is incorrect");
    }
}
