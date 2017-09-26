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

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

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
		pluginLastUpdatedDate = "2017/03/04"
)
public class PlusAsTabPageConfigurator extends PageConfigurator
{

	private static final long serialVersionUID = 1L;
	
	private JavascriptReference jsReference = new JavascriptReference("EmulateTab", 1.0, "bower_components/emulatetab.joelpurra/index.js");
	private JavascriptReference jsReferenceActual = new JavascriptReference("PlusAsTab", 1.0, "bower_components/jquery-plusastab/src/plusastab.joelpurra.js");
	
	/**
	 * Sets the component to be included in the plus as tab option
	 *
	 * @param component
	 */
	public static void setOnComponent(ComponentHierarchyBase component)
	{
		component.addAttribute("data-plus-as-tab", "true");
	}
	
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
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			page.getBody().getJavascriptReferences().add(jsReference);
			page.getBody().getJavascriptReferences().add(jsReferenceActual);
			page.getBody().addFeature(new PlusAsTabFeature());
		}
		return page;
	}
}
