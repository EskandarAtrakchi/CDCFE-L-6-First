package sac;

class FulltimeStudent extends Student {
    private boolean fullTime;

    public FulltimeStudent(String name, int id, boolean fullTime) {
        super(name, id);
        this.fullTime = fullTime;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }
}
