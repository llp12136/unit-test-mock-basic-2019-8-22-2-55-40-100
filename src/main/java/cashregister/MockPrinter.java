package cashregister;

public class MockPrinter extends Printer{
    private  String text = "";

    public String getText() {
        return text;
    }

    @Override
    public  void print(String printThis){
        super.print(printThis);
        text = printThis;
    }


}
