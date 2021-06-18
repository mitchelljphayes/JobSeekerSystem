package gui.body;


import application.Job;
import application.JobInteraction;
import application.JobInvitation;
import controller.NavigationController;
import data.DataStore;
import gui.body.searchBar.SeekerFilterPane;
import gui.body.searchBar.SeekerFilterPaneController;
import gui.card.CardDisplayable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class InviteesTab extends Tab implements CardPanelController, SeekerFilterPaneController {

    private NavigationController navigationController;
    private CardPanel cpo;
    private SeekerFilterPane sfp;
    private List<CardDisplayable> cardPanelData;
    private Predicate<JobInteraction> stringFilter;
    private Predicate<JobInteraction> statusFilter;

    private Job job;

    public InviteesTab() {
        super();
    }

    public InviteesTab(NavigationController navigationController, Job job) {
        super();
        this.job = job;
        this.navigationController = navigationController;
        this.stringFilter = ji -> true;
        this.statusFilter = ji -> true;

        this.sfp = new SeekerFilterPane(this);
        this.cpo = new CardPanel(this);
        JScrollPane scrollPane = new JScrollPane(cpo);
        this.add(this.sfp, BorderLayout.NORTH);
        this.add(scrollPane, BorderLayout.CENTER);

    }

    public void display() {
        cpo.displayCards();
    }

    public void displayWithFilter() {
//        cpo.displayCards(this.cardPanelData.stream()
//                .filter(cd -> cd instanceof JobInteraction)
//                .map(cd -> (JobInteraction) cd)
//                .filter(this.stringFilter)
//                .filter(this.statusFilter)
//                .collect(Collectors.toList())
//        );
    }

    public List<CardDisplayable> getCardPanelData() {

        List<CardDisplayable> jiList = new ArrayList<>();

        if (!Objects.isNull(this.job)) {
            jiList = DataStore.getDatastore().getJobSeekers()
                    .stream()
                    .filter(js -> js.getJobInteractions()
                            .stream()
                            .anyMatch(ji -> ji.getJob().equals(this.job) && ji instanceof JobInvitation))
                    .collect(Collectors.toList());
        }

        this.cardPanelData = jiList;

        return jiList;
    }

    public Button getCardButton(String id) {
        return new Button();
    }

    public void filterEvents(String searchText, int matchingScore) {
//        this.stringFilter = ji -> ji.getJob().getTitle().toLowerCase().contains(searchText.toLowerCase());
//
//        if (status == JobStatus.NULL) {
//            this.statusFilter = ji -> true;
//        } else {
//            this.statusFilter =  ji -> ji.getStatus().equals(status);
//        }
//
//        displayWithFilter();
    }
}
