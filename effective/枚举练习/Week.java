package base;

public enum Week {
    MONDAY(1, "星期一", true),
    TUESDAY(2, "星期二", true),
    WEDNESDAY(3, "星期三", true),
    THURSDAY(4, "星期四", true),
    FRIDAY(5, "星期五", true),
    STARDAY(6, "星期六", false),
    SUNDAY(7, "星期日", false);

    private int value;
    private String name;
    private boolean isWorkDay;
    private Week(int value, String name, boolean isWorkDay){
        this.name = name;
        this.value = value;
        this.isWorkDay = isWorkDay;
    }

    public int getValue(){
        return value;
    }

    public String getName() {
        return name;
    }

    public boolean getIsWorkDay(){
        return isWorkDay;
    }


}
