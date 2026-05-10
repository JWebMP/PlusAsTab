package com.jwebmp.plugins.plusastab;

import com.jwebmp.core.Page;
import com.jwebmp.core.generics.WebReference;
import org.junit.jupiter.api.Test;

public class PlusAsTabPageConfiguratorTest

{
	@Test
	public void configure()
	{
		Page<?> p = new Page();
		System.out.println(p.toString(0));

		System.out.println(p.renderJavascript());
	}

	@Test
	public void configureMin()
	{
		Page<?> p = new Page();
		WebReference.setUseMinAtEndOfExtension(true);
		System.out.println(p.toString(0));
	}
}
