package org.dominokit.domino.colors.client.presenters;

import org.dominokit.domino.api.client.annotations.ListenTo;
import org.dominokit.domino.api.client.annotations.Presenter;
import org.dominokit.domino.api.client.mvp.presenter.ViewBaseClientPresenter;
import org.dominokit.domino.api.shared.extension.Content;
import org.dominokit.domino.colors.client.views.ColorsView;
import org.dominokit.domino.componentcase.shared.extension.ComponentCase;
import org.dominokit.domino.componentcase.shared.extension.ComponentCaseContext;
import org.dominokit.domino.componentcase.shared.extension.ComponentCaseEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Presenter
public class ColorsPresenter extends ViewBaseClientPresenter<ColorsView> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ColorsPresenter.class);

    @ListenTo(event=ComponentCaseEvent.class)
    public void onComponentCaseEvent(ComponentCaseContext context) {
        context.addComponentCase(new ComponentCase() {
            @Override
            public String getHistoryToken() {
                return "colors";
            }

            @Override
            public String getMenuPath() {
                return "Colors";
            }

            @Override
            public String getIconName() {
                return "color_lens";
            }

            @Override
            public Content getContent() {
                return view.getContent();
            }
        });
    }
}