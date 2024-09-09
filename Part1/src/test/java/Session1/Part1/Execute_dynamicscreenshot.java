package Session1.Part1;

public class Execute_dynamicscreenshot extends Dynamic_code {

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		takescreenshot("chorme browser launched");
		
		hiturl("https://www.amazon.in/");
		takescreenshot("amazon webpage");

	}

}
