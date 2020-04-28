package com.montaser.cipher.dialog;

import com.jfoenix.controls.JFXDialog;
import com.montaser.cipher.constant.enumeration.DialogTitle;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;

public abstract class BaseDialog<L extends Region> extends JFXDialog {

    protected DialogTitle title;

    public BaseDialog(StackPane pane, DialogTitle title) {
        this.title = title;
        super.setDialogContainer(pane);
        super.setOverlayClose(true);
        super.setContent(initLayout());
        super.setTransitionType(DialogTransition.CENTER);
    }

    public abstract L initLayout();
}
