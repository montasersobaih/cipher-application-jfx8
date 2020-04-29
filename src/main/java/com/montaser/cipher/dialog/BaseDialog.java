package com.montaser.cipher.dialog;

import com.jfoenix.controls.JFXDialog;
import com.montaser.cipher.constant.enumeration.DialogTitle;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public abstract class BaseDialog<R extends Pane> extends JFXDialog {

    public BaseDialog(StackPane pane, DialogTitle title) {
        super.setDialogContainer(pane);
        super.setOverlayClose(true);
        super.setContent(initLayout(title));
        super.setTransitionType(DialogTransition.CENTER);
    }

    protected abstract R initLayout(DialogTitle title);
}
