/*
 * Copyright (C) 2017 GedMarc
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

import com.jwebmp.core.Page;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 */
@PluginInformation(pluginName = "Plus As Tab",
		pluginUniqueName = "plus-as-tab",
		pluginDescription = "Plus As Tab allows you to assign any key to mimic the same behaviour as pushing the 'tab' button. It will automatically trigger submit buttons",
		pluginVersion = "0.2.2",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "plus-as-tab",
		pluginSubtitle = "Make web and mobile pages 'enter'-friendly ",
		pluginGitUrl = "https://github.com/joelpurra/plusastab.git",
		pluginSourceUrl = "https://github.com/GedMarc/JWebMP-JQueryPlusAsTabPlugin",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-JQueryPlusAsTabPlugin/wiki",
		pluginOriginalHomepage = "https://github.com/joelpurra/plusastab",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/JQueryPlusAsTabPlugin.jar/download",
		pluginIconUrl = "bower_components/jquery-plusastab/logo.png",
		pluginIconImageUrl = "bower_components/jquery-plusastab/logo.png",
		pluginLastUpdatedDate = "2017/03/04")
public class PlusAsTabPageConfigurator
		implements IPageConfigurator<PlusAsTabPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;
	private JavascriptReference jsReference = new JavascriptReference("EmulateTab", 1.0, "emulatetab.joelpurra/emulateTab.min.js");
	private JavascriptReference jsReferenceActual = new JavascriptReference("PlusAsTab", 1.0, "jquery-plusastab/src/plusastab.joelpurra.min.js");

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return PlusAsTabPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		PlusAsTabPageConfigurator.enabled = mustEnable;
	}

	/**
	 * Skips the plus as tab option for the given field
	 *
	 * @param component
	 */
	@SuppressWarnings("unused")
	public static void setSkipComponent(ComponentHierarchyBase component)
	{
		component.addAttribute("data-plus-as-tab", "false");
	}

	@NotNull
	@Override
	@SuppressWarnings("unchecked")
	public Page configure(Page page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.getBody()
			    .getJavascriptReferences()
			    .add(jsReference);
			page.getBody()
			    .getJavascriptReferences()
			    .add(jsReferenceActual);
			page.getBody()
			    .addFeature(new PlusAsTabFeature(page.getBody()));
			page.getBody()
			    .addAttribute("data-plus-as-tab", "true");
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return PlusAsTabPageConfigurator.enabled;
	}
}
