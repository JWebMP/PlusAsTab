package com.jwebmp.plugins.plusastab;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.*;
import com.jwebmp.core.base.angular.client.annotations.boot.*;
import com.jwebmp.core.base.angular.client.annotations.typescript.*;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.*;
import com.jwebmp.core.services.*;

/**
 * @author GedMarc
 */
@PluginInformation(pluginName = "Plus As Tab",
        pluginUniqueName = "plus-as-tab",
        pluginDescription = "Plus As Tab allows you to assign any key to mimic the same behaviour as pushing the 'tab' button. It will automatically trigger submit buttons",
        pluginVersion = "0.2.2",
        pluginDependancyUniqueIDs = "",
        pluginCategories = "plus-as-tab",
        pluginSubtitle = "Make web and mobile pages 'enter'-friendly",
        pluginGitUrl = "https://github.com/JWebMP/PlusAsTab",
        pluginSourceUrl = "https://github.com/joelpurra/plusastab",
        pluginWikiUrl = "https://github.com/JWebMP/PlusAsTab/wiki",
        pluginOriginalHomepage = "https://github.com/joelpurra/plusastab",
        pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/plus-as-tab",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginLastUpdatedDate = "2025/05/10",
        pluginGroupId = "com.jwebmp.plugins",
        pluginArtifactId = "plus-as-tab",
        pluginModuleName = "com.jwebmp.plugins.plusastab",
        pluginStatus = PluginStatus.Released

)
@NgScript("node_modules/jquery-emulatetab/src/emulateTab.joelpurra.js")
@NgScript("plusastab/src/plusastab.joelpurra.js")

@TsDependency(value = "jquery-emulatetab", version = "^0.2.9")
@TsDependency(value = "plusastab", version = "^0.2.2")

@NgBootConstructorBody("JoelPurra.PlusAsTab.setOptions({\n" +
        "\t\tkey: 13\n" +
        "\t});")
@NgBootGlobalField("declare var JoelPurra : any;")
public class PlusAsTabPageConfigurator
        implements IPageConfigurator<PlusAsTabPageConfigurator>
{
    /**
     * Skips the plus as tab option for the given field
     *
     * @param component
     */
    @SuppressWarnings("unused")
    public static void setSkipComponent(IComponentHierarchyBase<?, ?> component)
    {
        component.cast()
                 .asAttributeBase()
                 .addAttribute("data-plus-as-tab", "false");
    }

    /**
     * Skips the plus as tab option for the given field
     *
     * @param component
     */
    @SuppressWarnings("unused")
    public static void setOnComponent(IComponentHierarchyBase<?, ?> component)
    {
        component.cast()
                 .asAttributeBase()
                 .addAttribute("data-plus-as-tab", "true");
    }

    @Override
    @SuppressWarnings("unchecked")
    public IPage<?> configure(IPage<?> page)
    {
        setOnComponent(page.getBody());
        return page;
    }

    @Override
    public boolean enabled()
    {
        return true;
    }
}
