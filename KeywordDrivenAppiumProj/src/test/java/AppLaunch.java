import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import keyword.engine.KeywordEngine;
import keyword.utility.BaseClass;

public class AppLaunch extends BaseClass{

@Test
public void appLaunchAndWork() throws EncryptedDocumentException, IOException, InterruptedException
{
KeywordEngine keyword=new KeywordEngine();
keyword.startExecution("Sheet1", driver);
}

}
