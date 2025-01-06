package org;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateOrgTest {
@Test
public void createOrg()
{
	Reporter.log("Org created",true);
}

@Test
public void createOrgWithDate()
{
	Reporter.log("Org Created with date",true);
}

@Test
public void createOrgWithName()
{
	Reporter.log("Org created with name",true);
}
}
