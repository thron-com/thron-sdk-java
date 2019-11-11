package it.newvision.core.dictionary.exceptions;

import com.sun.jersey.api.json.JSONWithPadding;
import it.newvision.nvp.core.libraries.restserver.PRestHelper;
import org.apache.commons.lang.StringUtils;

import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


/**
 * @author daniele.bettella
 */
public class WebApplicationException extends javax.ws.rs.WebApplicationException {

    public WebApplicationException(int status, String message, CacheControl cc) {
        super(Response
                .status(status)
                .entity(message)
                .cacheControl(cc)
                .type(MediaType.TEXT_PLAIN)
                .header(PRestHelper.fuzzyHostnameID(),(StringUtils.isNotBlank(PRestHelper.fuzzyHostname())?PRestHelper.fuzzyHostname():""))
                .build());
    }

    public WebApplicationException(int status, String message) {
        super(Response
                .status(status)
                .entity(message)
                .cacheControl(noCache())
                .type(MediaType.TEXT_PLAIN)
                .header(PRestHelper.fuzzyHostnameID(),(StringUtils.isNotBlank(PRestHelper.fuzzyHostname())?PRestHelper.fuzzyHostname():""))
                .build());
    }

    public WebApplicationException(Object entity) {
        super(Response
                .status(418)
                .entity(entity)
                .cacheControl(noCache())
                .type(MediaType.APPLICATION_JSON)
                .header(PRestHelper.fuzzyHostnameID(),(StringUtils.isNotBlank(PRestHelper.fuzzyHostname())?PRestHelper.fuzzyHostname():""))
                .build());
    }

    public WebApplicationException(Object entity, String callback) {
        super(Response
                .status(418)
                .entity(new JSONWithPadding(entity, callback))
                .cacheControl(noCache())
                .type("application/x-javascript")
                .header(PRestHelper.fuzzyHostnameID(),(StringUtils.isNotBlank(PRestHelper.fuzzyHostname())?PRestHelper.fuzzyHostname():""))
                .build());
    }


    public WebApplicationException(Object entity, List<MediaType> mtlist) {
        super(WebApplicationException.buildResponse(entity, mtlist, ""));
    }

    public WebApplicationException(WebApplicationException wae, String capability) {
        super(WebApplicationException.buildResponse(wae, capability));
    }

    private static CacheControl noCache() {
        CacheControl cc = new CacheControl();
        cc.setNoCache(true);
        return cc;
    }

    static Response buildResponse(WebApplicationException wae, String capability) {
        Response.ResponseBuilder rb = Response.fromResponse(wae.getResponse());
        if (StringUtils.isNotEmpty(capability)) rb.header(PRestHelper.capabilityID(), capability);
        return rb.build();
    }

    static Response buildResponse(Object entity, List<MediaType> mtlist, String capability) {
        List<MediaType> _mtList = new ArrayList();
        _mtList.add(MediaType.APPLICATION_JSON_TYPE);
        _mtList.add(MediaType.APPLICATION_XML_TYPE);
        MediaType _mt = MediaType.APPLICATION_JSON_TYPE;
        _mtList.retainAll(mtlist);
        if (!_mtList.isEmpty()) {
            _mt = _mtList.get(0);
        }
        Response.ResponseBuilder rb = Response.status(418).entity(entity).cacheControl(noCache()).type(_mt);
        if(StringUtils.isNotBlank(PRestHelper.fuzzyHostname()))rb.header(PRestHelper.fuzzyHostnameID(),PRestHelper.fuzzyHostname());
        if (StringUtils.isNotEmpty(capability)) rb.header(PRestHelper.capabilityID(), capability);
        return rb.build();
    }

}
