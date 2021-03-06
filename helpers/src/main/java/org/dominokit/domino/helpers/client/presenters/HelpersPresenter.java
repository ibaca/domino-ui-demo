package org.dominokit.domino.helpers.client.presenters;

import org.dominokit.domino.api.client.annotations.ListenTo;
import org.dominokit.domino.api.client.annotations.Presenter;
import org.dominokit.domino.api.client.mvp.presenter.ViewBaseClientPresenter;
import org.dominokit.domino.api.shared.extension.Content;
import org.dominokit.domino.componentcase.shared.extension.ComponentCase;
import org.dominokit.domino.componentcase.shared.extension.ComponentCaseContext;
import org.dominokit.domino.componentcase.shared.extension.ComponentCaseEvent;
import org.dominokit.domino.helpers.client.views.HelpersView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Presenter
public class HelpersPresenter extends ViewBaseClientPresenter<HelpersView> {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelpersPresenter.class);

    @ListenTo(event=ComponentCaseEvent.class)
    public void onComponentCaseModule(ComponentCaseContext context) {
        context.addComponentCase(new ComponentCase() {
            @Override
            public String getHistoryToken() {
                return "helpers";
            }

            @Override
            public String getMenuPath() {
                return "Helper classes";
            }

            @Override
            public String getIconName() {
                return "layers";
            }

            @Override
            public Content getContent() {
                return view.getContent();
            }
        });
    }
}