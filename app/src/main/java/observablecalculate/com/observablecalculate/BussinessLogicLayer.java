package observablecalculate.com.observablecalculate;

public class BussinessLogicLayer {

    Observer observer;

    int val1 = 0, val2 = 0, val3 = 0;
    long resultVal;

    public BussinessLogicLayer(Observer observer) {
        this.observer = observer;

    }

    public void setValNote1(int val1) {
        this.val1 = val1;
        setResult();
    }

    public void setValNote2(int val2) {
        this.val2 = val2;
        setResult();
    }

    public void setValNote3(int val3) {
        this.val3 = val3;
        setResult();
    }

    public void setResult() {
        resultVal = (val1 * 25 / 100) + (val2 * 30 / 100) + (val3 * 45 / 100);
        notifyObserver();
    }

    public void notifyObserver() {
        this.observer.updateValue(resultVal);
    }
}
