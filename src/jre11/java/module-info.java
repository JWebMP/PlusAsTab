import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.plusastab.PlusAsTabPageConfigurator;

module com.jwebmp.plugins.plusastab {
	exports com.jwebmp.plugins.plusastab;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with PlusAsTabPageConfigurator;

	provides IGuiceScanModuleExclusions with com.jwebmp.plugins.plusastab.implementations.PlusAsTabExclusionsModule;
	provides IGuiceScanJarExclusions with com.jwebmp.plugins.plusastab.implementations.PlusAsTabExclusionsModule;

	opens com.jwebmp.plugins.plusastab to com.fasterxml.jackson.databind, com.jwebmp.core;
}
