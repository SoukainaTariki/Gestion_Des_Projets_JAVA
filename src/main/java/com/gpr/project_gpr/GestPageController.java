package com.gpr.project_gpr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

public class GestPageController {

    @FXML
    private Label LabelIdUser;

    @FXML
    private Hyperlink LogOutLinkId;

    @FXML
    private Hyperlink MyPublicProjectLinkId;

    @FXML
    private TableView<?> PublicPageProfileTable;

    @FXML
    private BorderPane broderpenid;

    @FXML
    private TableColumn<?, ?> colfifth;

    @FXML
    private TableColumn<?, ?> colfirst;

    @FXML
    private TableColumn<?, ?> colforth;

    @FXML
    private TableColumn<?, ?> colsecond;

    @FXML
    private TableColumn<?, ?> colsiwth;

    @FXML
    private TableColumn<?, ?> colthird;

    @FXML
    void LogOutLinkIdOnAction(ActionEvent event) {

    }

    @FXML
    void MyPublicProjectLinkIdOnAction(ActionEvent event) {

    }

}
