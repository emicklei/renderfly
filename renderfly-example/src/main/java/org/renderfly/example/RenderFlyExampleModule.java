package org.renderfly.example;

import org.renderfly.core.RenderflyModule;
import org.renderfly.http.HttpServer;

import com.google.inject.AbstractModule;

public class RenderFlyExampleModule extends AbstractModule {
    public static void main(String[] args) {
        HttpServer.main(new String[]{"./src/main/resources/renderfly.properties"});
    }
    
    public void configure() {
        install(new RenderflyModule.HTML());
        install(new RenderflyExampleActionsModule());
    }
}
