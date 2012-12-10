public class LecturerScript {
	public static void main(String[] args) {
		LecturerScript launcher = new LecturerScript();
		launcher.launch();
	}
	public void launch() {
		Lecturer javaLecturer = new Lecturer("Dr Java");
		System.out.println(javaLecturer.getName());
		javaLecturer.teach("Programming in Java");
		javaLecturer.doResearch("tricky stuff");
		javaLecturer.setName("Dr FoC");
		System.out.println(javaLecturer.getName());
	}
}
