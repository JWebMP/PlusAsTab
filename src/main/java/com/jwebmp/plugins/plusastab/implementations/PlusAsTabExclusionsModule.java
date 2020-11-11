package com.jwebmp.plugins.plusastab.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class PlusAsTabExclusionsModule
		implements IGuiceScanModuleExclusions<PlusAsTabExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.plusastab");
		return strings;
	}
}
