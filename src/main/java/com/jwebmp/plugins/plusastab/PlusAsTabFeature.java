package com.jwebmp.plugins.plusastab;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * @author GedMarc
 * @since 07 Feb 2017
 */
@ComponentInformation(name = "Plus As Tab",
		description = "Allows you to automatically move to the next input field based on a key press",
		url = "https://github.com/joelpurra/plusastab")
public class PlusAsTabFeature
		extends Feature<PlusAsTabFeature, JavaScriptPart<?>, PlusAsTabFeature>
		implements IPlusAsTab
{
	private Integer key;

	public PlusAsTabFeature(IComponentHierarchyBase<?,?> component)
	{
		super("PlusAsTabFeature");
		setComponent(component);
	}

	public static <T extends IComponentHierarchyBase<?,?>> T setFromComponent(T component)
	{
		component.asAttributeBase().addAttribute("data-plus-as-tab", "true");
		return component;
	}

	public static <T extends IComponentHierarchyBase<?,?>> T setNotOnComponent(T component)
	{
		component.asAttributeBase().addAttribute("data-plus-as-tab", "false");
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
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public StringBuilder renderJavascript()
	{
		StringBuilder sb = new StringBuilder().append("JoelPurra.PlusAsTab.setOptions({")
		                                      .append("key: ")
		                                      .append(key == null ? "13" : key)
		                                      .append("});")
		                                      .append(getNewLine());
		sb.append("JoelPurra.PlusAsTab.plusAsTab($('body'));")
		  .append(getNewLine());
		return sb;
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		StringBuilder sb = new StringBuilder().append("JoelPurra.PlusAsTab.setOptions({")
		                                      .append("key: ")
		                                      .append(key == null ? "13" : key)
		                                      .append("});")
		                                      .append(getNewLine());
		addQuery(sb);
		addQuery("JoelPurra.PlusAsTab.plusAsTab($('body'));" + getNewLine());
	}
}
