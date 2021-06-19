package gui.body;


import application.JobApplication;
import application.JobInteraction;
import data.JobStatus;
import application.User;
import controller.NavigationController;
import controller.UserController;
import data.DataStore;
import gui.body.searchBar.AppSearchPane;
import gui.body.searchBar.AppSearchPaneController;
import gui.card.CardDisplayable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ApplicationTab extends Tab implements CardPanelController, AppSearchPaneController {

    private NavigationController navigationController;
    private UserController userController;
    private CardPanel cpo;
    private AppSearchPane asp;
    private List<CardDisplayable> cardPanelData;
    private Predicate<JobInteraction> stringFilter;
    private Predicate<JobInteraction> statusFilter;

    public ApplicationTab() {
        super();
    }

    public ApplicationTab(NavigationController navigationController, UserController userController) {
        super();
        this.navigationController = navigationController;
        this.userController = userController;
        this.stringFilter = ji -> true;
        this.statusFilter = ji -> true;

        this.asp = new AppSearchPane(this);
        this.cpo = new CardPanel(this);
        JScrollPane scrollPane = new JScrollPane(cpo);
        this.add(this.asp, BorderLayout.NORTH);
        this.add(scrollPane, BorderLayout.CENTER);

    }

    public void display() {
        cpo.displayCards();
    }

    public void displayWithFilter() {
        cpo.displayCards(this.cardPanelData.stream()
                .filter(cd -> cd instanceof JobInteraction)
                .map(cd -> (JobInteraction) cd)
                .filter(this.stringFilter)
                .filter(this.statusFilter)
                .collect(Collectors.toList())
        );
    }

    public List<CardDisplayable> getCardPanelData() {
        String userId = userController.getLoggedInUser();

        Optional<User> loggedInUser = DataStore.getDatastore().getUserById(userId);
        List<CardDisplayable> jiList = new ArrayList<>();

        if (loggedInUser.isPresent()) {
            jiList = loggedInUser.get().getJobInteractions()
                    .stream()
                    .filter(ji -> ji instanceof JobApplication && ji.getStatus() != JobStatus.DRAFT)
                    .collect(Collectors.toList());
        }

        this.cardPanelData = jiList;

        return jiList;
    }

    public Button getCardButton(String id) {
        // TODO: set up the button controller
//        Button button = new Button("View", navigationController);
//        button.setProperty("blah");
//        button.setText("View");
//        button.addActionListener(ae -> {
//            button.getNavigationController().setBody("JOBMANAGER", id);
//        });
//
//        return button;
        return new Button();
    }

    public void filterEvents(String searchText, JobStatus status) {
        this.stringFilter = ji -> ji.getJob().getTitle().toLowerCase().contains(searchText.toLowerCase());

        if (status == JobStatus.NULL) {
            this.statusFilter = ji -> true;
        } else {
            this.statusFilter = ji -> ji.getStatus().equals(status);
        }

        displayWithFilter();
    }
}
