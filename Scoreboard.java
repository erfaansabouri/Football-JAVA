public class Scoreboard {
    private int host_score;
    private int guest_score;
    private String notification;
    private int time;
    private int extra_time;

    public int getExtra_time() {
        return extra_time;
    }

    public void setExtra_time(int extra_time) {
        this.extra_time = extra_time;
    }


    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


    public int getHost_score() {
        return host_score;
    }

    public void setHost_score(int host_score) {
        this.host_score = host_score;
    }

    public int getGuest_score() {
        return guest_score;
    }

    public void setGuest_score(int guest_score) {
        this.guest_score = guest_score;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
        System.out.println(notification);
    }


}
