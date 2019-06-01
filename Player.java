public class Player {
    private int age;
    private int height;
    private String name;
    private Team[] previous_teams;
    private Team current_team;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team[] getPrevious_teams() {
        return previous_teams;
    }

    public void setPrevious_teams(Team[] previous_teams) {
        this.previous_teams = previous_teams;
    }

    public Team getCurrent_team() {
        return current_team;
    }

    public void setCurrent_team(Team current_team) {
        this.current_team = current_team;
    }
}
