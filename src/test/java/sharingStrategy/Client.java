package sharingStrategy;

public class Client {
    public static void main(String[] args) {
        // Create instances of camera apps
        PhoneCameraApp basicCameraApp = new BasicCameraApp();
        PhoneCameraApp cameraPlusApp = new CameraPlusApp();

        // Set sharing strategy dynamically
        basicCameraApp.setSharingStrategy(new TextSharingStrategy());
        cameraPlusApp.setSharingStrategy(new EmailSharingStrategy());

        // Use the camera apps
//        basicCameraApp.takePhoto();
//        basicCameraApp.editPhoto();
//        basicCameraApp.savePhoto();
        basicCameraApp.sharePhoto("basic_photo.jpg");

//        cameraPlusApp.takePhoto();
//        cameraPlusApp.editPhoto();
//        cameraPlusApp.savePhoto();
        cameraPlusApp.sharePhoto("plus_photo.jpg");

        // Change the sharing strategy at runtime
        basicCameraApp.setSharingStrategy(new SocialMediaSharingStrategy("Instagram"));
        basicCameraApp.sharePhoto("basic_insta_photo.jpg");
    }
}
