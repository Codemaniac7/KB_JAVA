package ch09.sec06.exam01;

public class Button {
    public interface ClickListener {
        void onClick();
    }

    //필드
    private ClickListener clickListener;
    //메서드
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
    public void click() {
        this.clickListener.onClick();
    }
}
