public interface Game {
    int count_of_teams();
    boolean has_winner();
    String get_referee_name();
    String get_winner_name();
    String get_loser_name();
    int get_full_time();
    int get_extra_time();
}
