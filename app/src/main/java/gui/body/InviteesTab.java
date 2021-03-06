package gui.body;


import application.Job;
import application.JobInvitation;
import controller.NavigationController;
import data.DataStore;
import gui.body.searchBar.UserCardTab;
import gui.card.CardDisplayable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class InviteesTab extends UserCardTab {

    public InviteesTab() {
        super();
    }

    public InviteesTab(NavigationController navigationController, Job job) {
        super(navigationController, job);
    }

    @Override
    public void loadCardPanelData() {

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

    }

}
