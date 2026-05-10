import com.jwebmp.plugins.plusastab.implementations.PlusAsTabInclusionModule;

module com.jwebmp.plugins.plusastab {
    exports com.jwebmp.plugins.plusastab;

    requires transitive com.jwebmp.core.base.angular.client;
    requires com.jwebmp.client;
    requires com.jwebmp.core;

    provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.plusastab.PlusAsTabPageConfigurator;
    provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.plusastab.implementations.PlusAsTabExclusionsModule;
    provides com.guicedee.client.services.config.IGuiceScanModuleInclusions with PlusAsTabInclusionModule;

    opens com.jwebmp.plugins.plusastab to com.fasterxml.jackson.databind, com.jwebmp.core, com.google.guice, com.jwebmp.core.angular;
    opens com.jwebmp.plugins.plusastab.implementations to com.fasterxml.jackson.databind, com.jwebmp.core, com.google.guice, com.jwebmp.core.angular;
}
