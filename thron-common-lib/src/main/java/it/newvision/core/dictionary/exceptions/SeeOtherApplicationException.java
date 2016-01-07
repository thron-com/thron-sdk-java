package it.newvision.core.dictionary.exceptions;

import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Response;
import java.net.URI;

public class SeeOtherApplicationException extends javax.ws.rs.WebApplicationException {

    public SeeOtherApplicationException(URI redirectUrl) {
        super(Response.seeOther(redirectUrl).build());
    }

    public SeeOtherApplicationException(URI redirectUrl, CacheControl cache) {
        super(Response.seeOther(redirectUrl).cacheControl(cache).build());
    }

}
