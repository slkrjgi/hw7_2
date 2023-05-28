public class Programming extends Calculator {

    private int subject;

    public Programming(int subject) {
        this.subject = subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public String getBinary(int subject) {
        String strResult = "";
        while (subject !=0) {
            int result = subject % 2;
            if (result == 1) {
            strResult += Integer.toString(result);
            } else if (result == 0) {
                strResult += "0";
            } else {
                strResult += "1";
                break;
            }
            subject = subject / 2;
        }
        return new StringBuilder(strResult).reverse().toString();
    }

}
