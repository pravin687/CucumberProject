package ui.utility;

import java.io.IOException;

import ui.base.TestBase;
import ui.pageObject.PageObjectManager;

public class World {

	public TestBase tb;
	public PageObjectManager po;
	
	public World() throws IOException {
		tb=new TestBase();
		po=new PageObjectManager(tb.launchDriver());
	}
	
}
