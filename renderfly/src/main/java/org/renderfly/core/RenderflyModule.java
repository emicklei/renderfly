package org.renderfly.core;

import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.handler.codec.http.HttpRequestDecoder;
import org.jboss.netty.handler.codec.http.HttpResponseDecoder;
import org.renderfly.core.error.DefaultErrorAction;
import org.renderfly.core.logging.LoggerManager;
import org.renderfly.http.HttpRESTPipelineFactory;
import org.renderfly.http.HttpRequestHandler;
import org.renderfly.http.HttpSelectiveContentCompressor;
import org.renderfly.http.HttpServerPipelineFactory;
import org.renderfly.http.session.SessionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.AbstractModule;

public abstract class RenderflyModule extends AbstractModule {
    private static final Logger LOG = LoggerFactory.getLogger(RenderflyModule.class);
    
    @Override
    protected void configure() {
        bind(HttpRequestDecoder.class);
        bind(HttpResponseDecoder.class);
        bind(LoggerManager.class).toInstance(new LoggerManager());
    }
    
    public static class REST extends RenderflyModule {

        @Override
        protected void configure() {
            super.configure();
            LOG.info("Configure for REST processing");
            bind(ChannelPipelineFactory.class).to(HttpRESTPipelineFactory.class);
        }
    }
    public static class HTML extends RenderflyModule {

        @Override
        protected void configure() {
            super.configure();
            LOG.info("Configure for HTML processing");
            bind(ChannelPipelineFactory.class).to(HttpServerPipelineFactory.class);
            bind(HttpSelectiveContentCompressor.class);
            bind(HttpRequestHandler.class);
            bind(SessionManager.class);        
            bind(Dispatcher.class).toInstance(new Dispatcher(new DefaultErrorAction()));
        }
    }  
}
