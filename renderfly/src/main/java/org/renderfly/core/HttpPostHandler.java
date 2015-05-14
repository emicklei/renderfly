package org.renderfly.core;

import java.io.IOException;

import org.rendersnake.HtmlCanvas;

public interface HttpPostHandler {
    HandlerResult post(HtmlCanvas html) throws IOException;
}
