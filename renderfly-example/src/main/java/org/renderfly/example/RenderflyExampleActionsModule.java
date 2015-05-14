package org.renderfly.example;

import org.renderfly.core.jmx.JMXAction;
import org.renderfly.example.action.CookieAction;
import org.renderfly.example.action.ErrorAction;
import org.renderfly.example.action.ForwardAction;
import org.renderfly.example.action.HomeAction;
import org.renderfly.example.action.InternalErrorAction;
import org.renderfly.example.action.LoginAction;
import org.renderfly.example.action.LogoutAction;
import org.renderfly.example.action.PageNotFoundAction;
import org.renderfly.example.action.ProductShowAction;
import org.renderfly.example.action.RedirectAction;
import org.renderfly.example.action.XmlDocumentAction;

import com.google.inject.AbstractModule;

public class RenderflyExampleActionsModule  extends AbstractModule {
    
    public void configure() {
        bind(HomeAction.class);
        bind(LoginAction.class);
        bind(LogoutAction.class);
        bind(ErrorAction.class);
        
        bind(PageNotFoundAction.class);
        bind(InternalErrorAction.class);
        bind(ProductShowAction.class);
        
        bind(ForwardAction.class);
        bind(RedirectAction.class);
        
        bind(XmlDocumentAction.class);
        bind(CookieAction.class);
        
        // setup JMX access
        JMXAction jmx = new JMXAction();
        jmx.getControlPage().excludePrefixes.add("java");
        jmx.getControlPage().includePrefixes.add("");
        bind(JMXAction.class).toInstance(jmx);
    }
}
