public class Team {
    private int count_of_players;
    private int points;
    private int rank;
    private int wins;
    private int loses;
    private int draws;
    private int match_played;
    private int goals_scored;
    private int goals_for;
    private String name;
    private String coach;
    private Player[] players;

    public int getCount_of_players() {
        return count_of_players;
    }

    public void setCount_of_players(int count_of_players) {
        this.count_of_players = count_of_players;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getMatch_played() {
        return match_played;
    }

    public void setMatch_played(int match_played) {
        this.match_played = match_played;
    }

    public int getGoals_scored() {
        return goals_scored;
    }

    public void setGoals_scored(int goals_scored) {
        this.goals_scored = goals_scored;
    }

    public int getGoals_for() {
        return goals_for;
    }

    public void setGoals_for(int goals_for) {
        this.goals_for = goals_for;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Team(int count_of_players, int points, int rank, int wins, int loses, int draws, int match_played, int goals_scored, int goals_for, String name, String coach, Player[] players) {
        this.count_of_players = count_of_players;
        this.points = points;
        this.rank = rank;
        this.wins = wins;
        this.loses = loses;
        this.draws = draws;
        this.match_played = match_played;
        this.goals_scored = goals_scored;
        this.goals_for = goals_for;
        this.name = name;
        this.coach = coach;
        this.players = players;
    }
}
