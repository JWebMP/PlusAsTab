/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.plusastab;


import com.jwebmp.BaseTestClass;
import com.jwebmp.Page;
import com.jwebmp.generics.WebReference;
import org.junit.jupiter.api.Test;

public class PlusAsTabPageConfiguratorTest
		extends BaseTestClass
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
