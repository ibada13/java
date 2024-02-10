public class Bit {
    private char data = '0';

    public void SetBit(char data) {
        this.data = data;
    }

    public char GetBit() {
        return this.data;
    }

    public Bit(char data) {
        this.data = data;
    }

    public void Inverse() {
        this.data = this.data == '0' ? '1' : '0';
        // if (this.data == '0') {
        //     this.data = '1';
        // }
        // else {
        //     this.data = '0';
        // }
    }

    public String toString() {
        return String.valueOf(this.data);
    }
}