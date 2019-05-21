public class UserDriver {

        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String phoneNumber;
        private String aboutYourself;
        private String incorrectEmail;
        private String zipCode;
        private String refferalCode;

        public UserDriver(){
            firstName = "Vasil";
            lastName = "Petrov";
            email = "my@gmail.com";
            password = "888";
            phoneNumber = "1234567890";
            aboutYourself = "I love dogs and would be happy keep care about yours!";
            zipCode = "94567";
            refferalCode = "798";

            incorrectEmail = "323";
        }

        public String getFirstName() {
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getAboutYourself(){return aboutYourself;}

        public String getIncorrectEmail() {
            return incorrectEmail;
        }

        public String getZipCode(){return zipCode;}

        public String getRefferalCode(){return refferalCode;}
    }


