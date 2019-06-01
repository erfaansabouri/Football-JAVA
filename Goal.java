public class Goal {
    int is_own_goal;
    Player assisant;
    Player shooter;
    Player goaler;
    int time;


    public int getIs_own_goal() {
        return is_own_goal;
    }

    public void setIs_own_goal(int is_own_goal) {
        this.is_own_goal = is_own_goal;
    }

    public Player getAssisant() {
        return assisant;
    }

    public void setAssisant(Player assisant) {
        this.assisant = assisant;
    }

    public Player getShooter() {
        return shooter;
    }

    public void setShooter(Player shooter) {
        this.shooter = shooter;
    }

    public Player getGoaler() {
        return goaler;
    }

    public void setGoaler(Player goaler) {
        this.goaler = goaler;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


    public Goal(int is_own_goal, Player assisant, Player shooter, Player goaler, int time) {
        this.is_own_goal = is_own_goal;
        this.assisant = assisant;
        this.shooter = shooter;
        this.goaler = goaler;
        this.time = time;
    }
}
