package student;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by TekSliveron 8/25/2018.
 */
public class resultHistoryTableData {
    private SimpleStringProperty resultHistoryTableCourseCode;
    private SimpleStringProperty resultHistoryTableSec;
    private SimpleStringProperty resultHistoryTableGPA;

    public resultHistoryTableData(String resultHistoryTableCourseCode, String resultHistoryTableSec, String resultHistoryTableGPA) {
        this.resultHistoryTableCourseCode = new SimpleStringProperty(resultHistoryTableCourseCode);
        this.resultHistoryTableSec = new SimpleStringProperty(resultHistoryTableSec);
        this.resultHistoryTableGPA = new SimpleStringProperty(resultHistoryTableGPA);
    }

    public String getResultHistoryTableCourseCode() {
        return resultHistoryTableCourseCode.get();
    }

    public SimpleStringProperty resultHistoryTableCourseCodeProperty() {
        return resultHistoryTableCourseCode;
    }

    public void setResultHistoryTableCourseCode(String resultHistoryTableCourseCode) {
        this.resultHistoryTableCourseCode.set(resultHistoryTableCourseCode);
    }

    public String getResultHistoryTableSec() {
        return resultHistoryTableSec.get();
    }

    public SimpleStringProperty resultHistoryTableSecProperty() {
        return resultHistoryTableSec;
    }

    public void setResultHistoryTableSec(String resultHistoryTableSec) {
        this.resultHistoryTableSec.set(resultHistoryTableSec);
    }

    public String getResultHistoryTableGPA() {
        return resultHistoryTableGPA.get();
    }

    public SimpleStringProperty resultHistoryTableGPAProperty() {
        return resultHistoryTableGPA;
    }

    public void setResultHistoryTableGPA(String resultHistoryTableGPA) {
        this.resultHistoryTableGPA.set(resultHistoryTableGPA);
    }
}
