package com.kiayang1.customtags1;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * When this tag gets called we will put out message 'Hello Ent Java Class'
 */

public class NewHelloWorldTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();

        // What do we want tag to do? Want to be able to write back out to JSP
        // get access to JSP writer, code gives us ability to send info back out to browser
        JspWriter out = getJspContext().getOut();
        out.println("Hello Ent Java Class");
    }
}
