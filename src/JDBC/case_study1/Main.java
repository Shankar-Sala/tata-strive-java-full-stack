package JDBC.case_study1;

/*
* DB Connection
* */

public class Main {
    public static void main(String[] args) {
        AddLearner a = new AddLearner();
        a.addLearner();
        UpdatePlacement u = new UpdatePlacement();
        u.updateStatus();
        DisplayLearner d = new DisplayLearner();
        d.showData();

    }
}
