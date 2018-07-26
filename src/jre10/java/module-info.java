import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.plusastab.PlusAsTabPageConfigurator;

module com.jwebmp.plugins.plusastab {
	exports com.jwebmp.plugins.plusastab;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with PlusAsTabPageConfigurator;
	opens com.jwebmp.plugins.plusastab to com.fasterxml.jackson.databind,com.jwebmp.core;
}
