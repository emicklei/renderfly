package org.renderfly.example.action;

import java.io.IOException;

import javax.inject.Named;
import javax.inject.Singleton;

import org.renderfly.core.HandlerResult;
import org.renderfly.core.HttpGetHandler;
import org.renderfly.example.page.HomePage;
import org.rendersnake.HtmlCanvas;

@Singleton @Named("/index.html")
public class HomeAction implements HttpGetHandler {

    public HandlerResult get(HtmlCanvas html) throws IOException {
        html.render(new HomePage());
        return HandlerResult.ok();
    }   
}
