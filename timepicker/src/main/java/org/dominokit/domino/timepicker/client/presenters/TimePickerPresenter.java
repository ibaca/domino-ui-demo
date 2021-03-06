package org.dominokit.domino.timepicker.client.presenters;

import org.dominokit.domino.api.client.annotations.ListenTo;
import org.dominokit.domino.api.client.annotations.Presenter;
import org.dominokit.domino.api.client.mvp.presenter.ViewBaseClientPresenter;
import org.dominokit.domino.api.shared.extension.Content;
import org.dominokit.domino.componentcase.shared.extension.ComponentCase;
import org.dominokit.domino.forms.shared.extension.FormsContext;
import org.dominokit.domino.forms.shared.extension.FormsEvent;
import org.dominokit.domino.timepicker.client.views.TimePickerView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Presenter
public class TimePickerPresenter extends ViewBaseClientPresenter<TimePickerView> {

    private static final Logger LOGGER = LoggerFactory.getLogger(TimePickerPresenter.class);

    @ListenTo(event=FormsEvent.class)
    public void onFormsEvent(FormsContext context) {
        context.getComponentCaseContext().addComponentCase(new ComponentCase() {
            @Override
            public String getHistoryToken() {
                return "timepicker";
            }

            @Override
            public String getMenuPath() {
                return "Forms/Time picker";
            }

            @Override
            public Content getContent() {
                return view.getContent();
            }
        });
    }
}