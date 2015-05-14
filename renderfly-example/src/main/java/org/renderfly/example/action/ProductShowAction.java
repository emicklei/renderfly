package org.renderfly.example.action;

import java.io.IOException;

import javax.inject.Named;
import javax.inject.Singleton;

import org.renderfly.core.HandlerResult;
import org.renderfly.core.HttpGetHandler;
import org.rendersnake.HtmlCanvas;
import org.rendersnake.PageContext;

@Singleton @Named("/product/{id}")
public class ProductShowAction implements HttpGetHandler {

    public HandlerResult get(HtmlCanvas html) throws IOException {
        String id = html.getPageContext().getContextMap(PageContext.REQUEST_PATH).getString("id");
        html.html().body().h2().content(id)._body()._html();
        return HandlerResult.ok();
    }   
}
