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
import com.jwebmp.core.base.angular.services.annotations.angularconfig.*;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
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
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.javascript/jwebmp-plus-as-tab",
		pluginIconUrl = "bower_components/jquery-plusastab/logo.png",
		pluginIconImageUrl = "bower_components/jquery-plusastab/logo.png",
		pluginLastUpdatedDate = "2017/03/04",
		pluginGroupId = "com.jwebmp.plugins.javascript",
		pluginArtifactId = "jwebmp-plus-as-tab",
		pluginModuleName = "com.jwebmp.plugins.plusastab",
		pluginStatus = PluginStatus.Released
		
)
@NgScript("emulatetab.joelpurra/emulateTab.min.js")
@NgScript("jquery-plusastab/src/plusastab.joelpurra.min.js")
public class PlusAsTabPageConfigurator
		implements IPageConfigurator<PlusAsTabPageConfigurator>
{
	//private static JavascriptReference jsReferenceEmulateTab = new JavascriptReference("EmulateTab", 1.0, "emulatetab.joelpurra/emulateTab.min.js");
	//private  static  JavascriptReference jsReferencePlusAsTab = new JavascriptReference("PlusAsTab", 1.0, "jquery-plusastab/src/plusastab.joelpurra.min.js");

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
	
	/**
	 * Skips the plus as tab option for the given field
	 *
	 * @param component
	 */
	@SuppressWarnings("unused")
	public static void setOnComponent(ComponentHierarchyBase component)
	{
		component.addAttribute("data-plus-as-tab", "true");
	}
	
	@NotNull
	@Override
	@SuppressWarnings("unchecked")
	 public Page<?> configure(Page<?> page)
	{
	
		return page;
	}
	
	@Override
	public boolean enabled()
	{
		return true;
	}
}
