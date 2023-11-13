package sharingStrategy;

public abstract class PhoneCameraApp {
    private SharingStrategy sharingStrategy;

    // Other methods common to all camera apps

    public void sharePhoto(String photo) {
        if (sharingStrategy != null) {
            sharingStrategy.share(photo);
        }
    }

    public void setSharingStrategy(SharingStrategy sharingStrategy) {
        this.sharingStrategy = sharingStrategy;
    }
}
