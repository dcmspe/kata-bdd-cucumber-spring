package pt.tabajara_airflights.models;

public class Flight {

    private User user;

    private String boardingPass;

    private boolean isCheckinMade;

    public Flight(User user, String boardingPass) {
        this.user = user;
        this.boardingPass = boardingPass;
        this.isCheckinMade = false;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBoardingPass() {
        return boardingPass;
    }

    public void setBoardingPass(String boardingPass) {
        this.boardingPass = boardingPass;
    }

    public boolean isCheckinMade() {
        return isCheckinMade;
    }

    public void setCheckinMade(boolean checkinMade) {
        isCheckinMade = checkinMade;
    }

}
