package sharingStrategy;

public class EmailSharingStrategy implements SharingStrategy {
    @Override
    public void share(String photo) {
        // Logic for sharing photo via email
        System.out.println("Sharing photo via email: " + photo);
    }
}
