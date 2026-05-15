public class CellPhone {
    public String model = "unknown";
    public String[] contacts = new String[3];
    public int contactCount = 0;

    public void printDetails() {
        System.out.println("Phone Model " + this.model);
        System.out.println("Contacts Stored " + this.contactCount);
        if (this.contactCount > 0) {
            System.out.println("Stored Contacts :");
            for (int i = 0; i < this.contactCount; i++) {
                System.out.println(contacts[i]);
            }
        }
    }

    public void storeContact(String contact) {
        if (this.contactCount < 3) {
            contacts[this.contactCount] = contact;
            this.contactCount++;
            System.out.println("Contact Stored");
        } else {
            System.out.println("Memory full. New contact can't be stored.");
        }
    }
}
