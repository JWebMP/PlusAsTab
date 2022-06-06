import com.jwebmp.plugins.plusastab.implementations.PlusAsTabInclusionModule;

module com.jwebmp.plugins.plusastab {
	exports com.jwebmp.plugins.plusastab;
	
	requires transitive com.jwebmp.core.base.angular.client;
	
	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.plusastab.PlusAsTabPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with PlusAsTabInclusionModule;

	opens com.jwebmp.plugins.plusastab to com.fasterxml.jackson.databind, com.jwebmp.core;
}
