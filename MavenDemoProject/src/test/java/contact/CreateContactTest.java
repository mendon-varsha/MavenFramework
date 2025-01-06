package contact;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContactTest {
@Test
public void createContact()
{
	Reporter.log("Contact created",true);
}

@Test
public void createContactWithDate()
{
	Reporter.log("Contact created with date",true);
}
}

