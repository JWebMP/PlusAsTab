package za.co.mmagon.jwebswing.plugins.plusastab;


import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.generics.WebReference;

public class PlusAsTabPageConfiguratorTest extends BaseTestClass
{
	@Test
	public void configure()
	{
		Page p = getInstance();
		System.out.println(p.toString(0));
		
		System.out.println(p.renderJavascript());
	}
	
	@Test
	public void configureMin()
	{
		Page p = getInstance();
		WebReference.setUseMinAtEndOfExtension(true);
		
		System.out.println(p.toString(0));
		
	}
}
