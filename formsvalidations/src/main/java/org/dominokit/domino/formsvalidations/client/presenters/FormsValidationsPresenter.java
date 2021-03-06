package org.dominokit.domino.formsvalidations.client.presenters;

import org.dominokit.domino.api.client.annotations.ListenTo;
import org.dominokit.domino.api.client.annotations.Presenter;
import org.dominokit.domino.api.client.mvp.presenter.ViewBaseClientPresenter;
import org.dominokit.domino.api.shared.extension.Content;
import org.dominokit.domino.componentcase.shared.extension.ComponentCase;
import org.dominokit.domino.forms.shared.extension.FormsContext;
import org.dominokit.domino.forms.shared.extension.FormsEvent;
import org.dominokit.domino.formsvalidations.client.views.FormsValidationsView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Presenter
public class FormsValidationsPresenter extends ViewBaseClientPresenter<FormsValidationsView> {

    private static final Logger LOGGER = LoggerFactory.getLogger(FormsValidationsPresenter.class);

    @ListenTo(event = FormsEvent.class)
    public void onFormsEvent(FormsContext context) {
        context.getComponentCaseContext().addComponentCase(new ComponentCase() {
            @Override
            public String getHistoryToken() {
                return "fields-decoration";
            }

            @Override
            public String getMenuPath() {
                return "Forms/Field Decoration";
            }

            @Override
            public Content getContent() {
                return view.getContent();
            }
        });
    }
}