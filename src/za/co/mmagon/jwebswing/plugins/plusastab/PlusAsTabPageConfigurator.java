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
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 *
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

    @Override
    public Page configure(Page page)
    {
        return page;
    }

}
