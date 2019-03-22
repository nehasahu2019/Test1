package Utility;
import PageObjectModel.*;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;	


public class Screenshot {
	
	public static void Screen(String name){
	
	TakesScreenshot sh = (TakesScreenshot)BrowserFactory.d;
	File src = sh.getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(src,new File("./Screenshot/"+name+".png"));
		System.out.println("Screenshot has taken!!!!");
	} catch (IOException e) {
		System.out.println("Unable to take screenshpot");
	}
	
	}
}
