import CustomFX.Point3D;

public class Client {

	public static void main(String[] args) {
        try {
			Swordsman swordsman1 = new Swordsman();
			swordsman1.move(new Point3D(10, 10, 0), 100);
			swordsman1.attack();
			System.out.println(swordsman1);

			Swordsman swordsman2 = (Swordsman) swordsman1.clone();
			System.out.println(swordsman2);

			General general = new General();
			general.move(new Point3D(5,5,5), 10);
			general.boostMorale();
			System.out.println(general);

			General unsupportedCopy = (General)general.clone();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
