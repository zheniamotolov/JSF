import javax.faces.bean.ManagedBean;

/**
 * Created by eugene on 10/23/17.
 */
@ManagedBean
public class Tour {
    private String kindOfTour;

    public String getKindOfTour() {
        return kindOfTour;
    }

    public void setKindOfTour(String kindOfTour) {
        this.kindOfTour = kindOfTour;
    }


    public Tour() {
    }

    public String takeMeToTheTour() {
        if (kindOfTour != null && kindOfTour.equals("city")) {
            return "city";
        } else {
            return "country";
        }
    }
}
