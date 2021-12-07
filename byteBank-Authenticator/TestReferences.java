public class TestReferences {
    public static void main(String[] args) {
        Manager me = new Manager();

        me.setName("Breno Farias");
        me.setSalary(5000);

        BonusControl control = new BonusControl();
        control.register(me);

        VideoEditor videoEditor = new VideoEditor();
        videoEditor.setSalary(2500);
        control.register(videoEditor);

        Designer designer = new Designer();
        designer.setSalary(2000);
        control.register(designer);

        System.out.println(control.getSum());
    } 
}
