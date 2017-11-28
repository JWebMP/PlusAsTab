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
package za.co.mmagon.jwebswing.plugins.plusastab;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * @author GedMarc
 * @since 07 Feb 2017
 */
@ComponentInformation(name = "Plus As Tab", description = "Allows you to automatically move to the next input field based on a key press", url = "https://github.com/joelpurra/plusastab")
public class PlusAsTabFeature extends Feature<JavaScriptPart, PlusAsTabFeature>
		implements IPlusAsTab
{

	private static final long serialVersionUID = 1L;
	private Integer key;

	public PlusAsTabFeature()
	{
		super("PlusAsTab");

	}

	public static <T extends ComponentHierarchyBase> T setFromComponent(T component)
	{
		component.addAttribute("data-plus-as-tab", "true");
		return component;
	}

	public static <T extends ComponentHierarchyBase> T setNotOnComponent(T component)
	{
		component.addAttribute("data-plus-as-tab", "false");
		return component;
	}

	public IPlusAsTab asMe()
	{
		return this;
	}

	@Override
	public Integer getKey()
	{
		return key;
	}

	@Override
	public PlusAsTabFeature setKey(Integer key)
	{
		this.key = key;
		return this;
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		StringBuilder sb = new StringBuilder().append("JoelPurra.PlusAsTab.setOptions({").append("key: ")
				                   .append(key == null ? "13" : key)
				                   .append("});").append(getNewLine());
		addQuery(sb);

		addQuery("JoelPurra.PlusAsTab.plusAsTab($('body'));" + getNewLine());
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof PlusAsTabFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		PlusAsTabFeature that = (PlusAsTabFeature) o;

		return getKey().equals(that.getKey());
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
