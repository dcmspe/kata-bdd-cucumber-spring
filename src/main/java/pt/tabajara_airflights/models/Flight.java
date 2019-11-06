package pt.tabajara_airflights.models;

import lombok.Getter;
import lombok.Setter;

public class Flight {

    @Getter @Setter
    private User user;

    @Getter @Setter
    private String boardingPass;

    @Getter @Setter
    private boolean isCheckinMade;

    public Flight(User user, String boardingPass, boolean isCheckinMade) {
        this.user = user;
        this.boardingPass = boardingPass;
        this.isCheckinMade = isCheckinMade;
    }
}
