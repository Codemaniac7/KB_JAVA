package ch09.sec07.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class buttonOk implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }
        btnOk.setClickListener(new buttonOk());
        btnOk.click();

        Button btnCancel = new Button();
        class buttonCancel implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }
        btnCancel.setClickListener(new buttonCancel());
        btnCancel.click();
    }
}
