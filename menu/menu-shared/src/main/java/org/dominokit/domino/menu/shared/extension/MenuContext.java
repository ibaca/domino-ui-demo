package org.dominokit.domino.menu.shared.extension;


import org.dominokit.domino.api.shared.extension.EventContext;

public interface MenuContext extends EventContext {

    interface CanAddMenuItem{
        CanAddMenuItem addMenuItem(String title);
        CanAddMenuItem addMenuItem(String title, OnMenuSelectedHandler selectionHandler);
    }

    @FunctionalInterface
    interface OnMenuSelectedHandler{
        void onMenuSelected();
    }

    void setMainTitle(String title);
    CanAddMenuItem addMenuItem(String title, String iconName, OnMenuSelectedHandler selectionHandler);
    CanAddMenuItem addMenuItem(String title, String iconName);
}
