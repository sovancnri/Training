package dailyproject;

class AddressBook{

    private String ownerName;  //Attribute -> Property
    private long ownerPhone;

    private Address tempAddress;
    private Address permAddress;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public long getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(long ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public Address getTempAddress() {
        return tempAddress;
    }

    public void setTempAddress(Address tempAddress) {
        this.tempAddress = tempAddress;
    }

    public Address getPermAddress() {
        return permAddress;
    }

    public void setPermAddress(Address permAddress) {
        this.permAddress = permAddress;
    }
    class Address{
        String house_name;
        String street_name;
        String city;
        String state;

        public String getHouse_name() {
            return house_name;
        }

        public void setHouse_name(String house_name) {
            this.house_name = house_name;
        }

        public String getStreet_name() {
            return street_name;
        }

        public void setStreet_name(String street_name) {
            this.street_name = street_name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}

public class TestAdressBook {
    public static void main(String[] args) {
        AddressBook diary = new AddressBook();
        diary.setOwnerName("Jesse Pinkman");
        diary.setOwnerPhone(192944);

        AddressBook.Address addone = diary.new Address();
        addone.setHouse_name("Jesse's Hideout");
        addone.setStreet_name("43");
        addone.setCity("Anchorage");
        addone.setState("Alaska");

        diary.setTempAddress(addone);

        AddressBook.Address addtwo = diary.new Address();
        addtwo.setHouse_name("Jesse's Permanent");
        addtwo.setStreet_name("909");
        addtwo.setCity("Albuquerque");
        addtwo.setState("New Mexico");

        diary.setPermAddress(addtwo);

        System.out.println("Address Book Owns By - " + diary.getOwnerName());
        System.out.println("Owners Phone Number - " + diary.getOwnerPhone());
        System.out.println("Temporary Address Details - ");
        System.out.println(diary.getTempAddress().getHouse_name()+" ");
        System.out.print(diary.getTempAddress().getStreet_name()+" ");
        System.out.print(diary.getTempAddress().getCity()+" ");
        System.out.print(diary.getTempAddress().getState()+" ");

        System.out.println("Permanent Address Details - ");
        System.out.println(diary.getPermAddress().getHouse_name()+" ");
        System.out.print(diary.getPermAddress().getStreet_name()+" ");
        System.out.print(diary.getPermAddress().getCity()+" ");
        System.out.print(diary.getPermAddress().getState()+" ");
    }
}
