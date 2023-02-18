package top.wuml.ajax;

import java.util.List;

public class Channel {
    private String lv1;
    private List<String> lv2;

    public Channel(String lv1, List<String> lv2) {
        this.lv1 = lv1;
        this.lv2 = lv2;
    }

    public Channel() {
    }

    public String getLv1() {
        return lv1;
    }

    public void setLv1(String lv1) {
        this.lv1 = lv1;
    }

    public List<String> getLv2() {
        return lv2;
    }

    public void setLv2(List<String> lv2) {
        this.lv2 = lv2;
    }
}
