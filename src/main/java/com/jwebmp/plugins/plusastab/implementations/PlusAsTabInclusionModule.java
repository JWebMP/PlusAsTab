package com.jwebmp.plugins.plusastab.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class PlusAsTabInclusionModule implements IGuiceScanModuleInclusions<PlusAsTabInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.plusastab");
		return set;
	}
}
