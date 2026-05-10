package com.jwebmp.plugins.plusastab.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleInclusions;

import java.util.HashSet;
import java.util.Set;

public class PlusAsTabInclusionModule implements IGuiceScanModuleInclusions<PlusAsTabInclusionModule>
{
	@Override
	public Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.plusastab");
		return set;
	}
}
