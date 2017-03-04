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
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 *
 * @author GedMarc
 * @since 07 Feb 2017
 *
 */
@ComponentInformation(name = "Plus As Tab", description = "Allows you to automatically move to the next input field based on a key press", url = "https://github.com/joelpurra/plusastab")
public class PlusAsTabFeature extends Feature<JavaScriptPart, Feature> implements IPlusAsTab
{

    private static final long serialVersionUID = 1L;

    private JavascriptReference jsReference = new JavascriptReference("EmulateTab", 1.0, "bower_components/emulatetab.joelpurra/index.js");
    private JavascriptReference jsReferenceActual = new JavascriptReference("PlusAsTab", 1.0, "bower_components/jquery-plusastab/src/plusastab.joelpurra.js");

    private Integer key;

    public PlusAsTabFeature()
    {
        super("PlusAsTab");
        getJavascriptReferences().add(jsReference);
        getJavascriptReferences().add(jsReferenceActual);
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
                .append(key == null ? "" : key)
                .append("});");

        addQuery(sb);
    }

    public JavascriptReference getJsReference()
    {
        return jsReference;
    }

    public PlusAsTabFeature setJsReference(JavascriptReference jsReference)
    {
        this.jsReference = jsReference;
        return this;
    }

    public JavascriptReference getJsReferenceActual()
    {
        return jsReferenceActual;
    }

    public PlusAsTabFeature setJsReferenceActual(JavascriptReference jsReferenceActual)
    {
        this.jsReferenceActual = jsReferenceActual;
        return this;
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
}
