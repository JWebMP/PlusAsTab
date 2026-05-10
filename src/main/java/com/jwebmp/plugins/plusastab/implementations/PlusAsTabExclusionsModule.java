package com.jwebmp.plugins.plusastab.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;

import java.util.HashSet;
import java.util.Set;

public class PlusAsTabExclusionsModule
		implements IGuiceScanModuleExclusions<PlusAsTabExclusionsModule>
{
	@Override
	public Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.plusastab");
		return strings;
	}
}
