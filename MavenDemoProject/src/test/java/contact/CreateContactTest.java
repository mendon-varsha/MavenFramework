package contact;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContactTest {
	
@Test


public void createContact()
{
	String url = System.getProperty("url");
	String username = System.getProperty("username");
	String contact = System.getProperty("contact");
	Reporter.log("Contact created",true);
	System.out.println(url);
	System.out.println(username);
	System.out.println(contact);
	
}

@Test
public void createContactWithDate()
{
	Reporter.log("Contact created with date",true);
}

@Test
public void createContactWithIndustry()
{
	Reporter.log("Contact created with industry",true);
}

@Test
public void contactList()
{
	Reporter.log("All contacts are listed",true);
}
}

