package cashregister;

public class MockPrinter extends Printer{
    private  String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public  void print(String printThis){
       // super.print(printThis);
        this.text = printThis;
    }

}
