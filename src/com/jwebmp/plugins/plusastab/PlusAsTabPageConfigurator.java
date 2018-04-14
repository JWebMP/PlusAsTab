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

import com.jwebmp.Page;
import com.jwebmp.PageConfigurator;
import com.jwebmp.base.ComponentHierarchyBase;
import com.jwebmp.base.references.JavascriptReference;
import com.jwebmp.plugins.PluginInformation;

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
		pluginSourceUrl = "https://github.com/GedMarc/JWebSwing-JQueryPlusAsTabPlugin",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryPlusAsTabPlugin/wiki",
		pluginOriginalHomepage = "https://github.com/joelpurra/plusastab",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/JQueryPlusAsTabPlugin.jar/download",
		pluginIconUrl = "bower_components/jquery-plusastab/logo.png",
		pluginIconImageUrl = "bower_components/jquery-plusastab/logo.png",
		pluginLastUpdatedDate = "2017/03/04")
public class PlusAsTabPageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	private JavascriptReference jsReference = new JavascriptReference("EmulateTab", 1.0, "emulatetab.joelpurra/emulateTab.min.js");
	private JavascriptReference jsReferenceActual = new JavascriptReference("PlusAsTab", 1.0, "jquery-plusastab/src/plusastab.joelpurra.min.js");

	/**
	 * Skips the plus as tab option for the given field
	 *
	 * @param component
	 */
	public static void setSkipComponent(ComponentHierarchyBase component)
	{
		component.addAttribute("data-plus-as-tab", "false");
	}

	@Override
	@SuppressWarnings("unchecked")
	public Page configure(Page page)
	{
		if (!page.isConfigured())
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
}
