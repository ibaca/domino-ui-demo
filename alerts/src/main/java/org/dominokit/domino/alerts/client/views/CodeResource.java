package org.dominokit.domino.alerts.client.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ExternalTextResource;

public interface CodeResource extends ClientBundle{

    CodeResource INSTANCE= GWT.create(CodeResource.class);

    @Source("basicAlerts.txt")
    ExternalTextResource basicAlerts();

    @Source("customBackgrounds.txt")
    ExternalTextResource customBackgrounds();

    @Source("dismissibleAlerts.txt")
    ExternalTextResource dismissibleAlerts();

    @Source("linksInAlerts.txt")
    ExternalTextResource linksInAlerts();
}
