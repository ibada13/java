public class Octet {
    private String[] data;

    public void Octet(String[] data) throws InvBit {
        for (int i = 0; i < data.length;i++) {
            if (!data.equals("1") || !data[i].equals("0")) {
                throw new InvBit();
            }
        }
        this.data = data;
    }
}
