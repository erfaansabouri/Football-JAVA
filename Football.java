
class Football implements Game , FootballStartEventListener , FootballGoalEventListener , FootballEndEventListener , FootballSubstitutionEventListener{

    private boolean has_winner;
    private String referee_name;
    private String winner_name;
    private String loser_name;
    private int full_time; // in minutes
    private int extra_time; // in minutes
    private Team guest;
    private Team host;
    private Scoreboard scoreboard;
    private int guest_goals;
    private int host_goals;


    @Override
    public int count_of_teams() {
        return 2;
    }

    @Override
    public boolean has_winner() {
        return has_winner;
    }

    @Override
    public String get_referee_name() {
        return referee_name;
    }

    @Override
    public String get_winner_name() {
        return winner_name;
    }

    @Override
    public String get_loser_name() {
        return loser_name;
    }

    @Override
    public int get_full_time() {
        return full_time;
    }

    @Override
    public int get_extra_time() {
        return extra_time;
    }


    @Override
    public void onStartFootball() {
        scoreboard.setHost_score(host_goals);
        scoreboard.setGuest_score(guest_goals);
        scoreboard.setTime(0);
        scoreboard.setNotification("The game between " + host.getName() + " & " + guest.getName() + " Started!");
    }

    @Override
    public void onEnd() {
        scoreboard.setTime(90);
        if(guest_goals > host_goals)
            scoreboard.setNotification("Winner is " + guest.getName());
        else if (guest_goals < host_goals)
            scoreboard.setNotification("Winner is " + host.getName());
        else
            scoreboard.setNotification("Draw! Let's go to extra-time!");
    }

    @Override
    public void onGoal(Goal goal) {
        scoreboard.setNotification(goal.getShooter() + " scored a GOAL!");
        goal.shooter.getCurrent_team().setGoals_scored(goal.shooter.getCurrent_team().getGoals_scored() + 1);
        if(goal.shooter.getCurrent_team().equals(host))
            host_goals++;
        else
            guest_goals++;
        scoreboard.setHost_score(host_goals);
        scoreboard.setGuest_score(guest_goals);
    }


    @Override
    public void onGoal(Player in, Player out) {
        scoreboard.setNotification("Player " + in.getName() + " oomad dakhel va " + out.getName() + "raft biroon!");
    }
}