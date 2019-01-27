module com.jwebmp.plugins.plusastab {
	exports com.jwebmp.plugins.plusastab;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.plusastab.PlusAsTabPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.plusastab.implementations.PlusAsTabExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.plusastab.implementations.PlusAsTabExclusionsModule;

	opens com.jwebmp.plugins.plusastab to com.fasterxml.jackson.databind, com.jwebmp.core;
}
