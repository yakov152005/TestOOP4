public class Client {
    private String firstName;
    private String lastName;
    private String[] phones;
    private int birthYear;
    private int birthMonth;
    private int birthDate;

    public Client(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        phones = new String[0];
    }
    public String[] getPhones() {
        return phones;
    }
    public void addPhone(String newPhone){
        String[] temp = new String[phones.length + 1];
        for (int i = 0; i < phones.length; i++) {
            temp[i] = phones[i];
        }

        temp[temp.length -1] = newPhone;
        phones = temp;
    }

    public boolean lengthPhoneValid (String phone){
        boolean res = false;
        if (phone.length()  == 10){
            res = true;
        }
        return res;
    }
    public boolean thePhoneStartWith(String phone){
        return phone.startsWith("05");
    }
    public boolean onlyDigits(String phone){
        boolean res = false;
        int countForNumber = 0;
        for (int i = 0; i < phone.length(); i++) {
            int p = Integer.parseInt(phone.charAt(i) +"");
            if (p >= 0 && p <=9){
                countForNumber++;
            }
        }
        if (countForNumber == 10){
            res = true;
        }
        return res;
    }
    public boolean hasValidCellPhone(){
        boolean res = false;
        int countForValidPhone = 0;
        for (int i = 0; i < phones.length; i++) {
            if (lengthPhoneValid(phones[i]) && thePhoneStartWith(phones[i]) && onlyDigits(phones[i])){
                countForValidPhone++;
            }
        }
        if (countForValidPhone >= 1){
            res = true;
        }
        return res;
    }
    public boolean hasGoldNumber() {
        boolean res = false;
        boolean temp = false;
        int countForNumber = 5;
        int countForGoldNumber = 0;
        char digit1 = 0;
        char digit2 = 0;
        if (hasValidCellPhone()) {
            for (int i = 0; i < phones.length; i++) {
                countForGoldNumber = 0;
                 digit1 = phones[i].charAt(3);
                 digit2 = phones[i].charAt(4);
                 if (digit1 == digit2){
                     while (!temp){
                         digit2 = phones[i].charAt(countForNumber);
                         if (digit2 != digit1){
                             temp = true;
                             break;
                         }
                     }
                 }
                for (int j = 5; j < phones[i].length(); j++) {
                    if (phones[i].charAt(j) == digit1 || phones[i].charAt(j) == digit2 ){
                        countForGoldNumber++;
                    }else {
                        temp = false;
                    }
                }
                if (countForGoldNumber == 5){
                    res = true;
                    break;
                }

            }
        }

        return res;
    }
    public String toString(){
        StringBuilder res = new StringBuilder("Name: " +firstName + " " + lastName + "\nPhones number--->\n");
        for (int i = 0; i < this.phones.length; i++) {
            res.append((i + 1)).append(":").append(getPhones()[i]);
            res.append("\n");
        }
        return res.toString();
    }
}
