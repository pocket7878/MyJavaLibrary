import pocket.data.Sheet;

class sheetTest {
	public static void main(String args[]) {
		Sheet sheet = new Sheet(3, 4);
		sheet.init(0);
		System.out.println("====== Print Default Sheet ======");
		for(int i = 0; i < sheet.getHeight(); i++) {
			for(int j = 0; j < sheet.getWidth(); j++) {
				System.out.print("[" + sheet.getCell(j, i) + "]");
			}
			System.out.println();
		}
		System.out.println("====== Add some date ======");
		sheet.setCell(0,0,1);
		sheet.setCell(1,1,"Hello");
		sheet.setCell(2,3,"Sheet");
		for(int i = 0; i < sheet.getHeight(); i++) {
			for(int j = 0; j < sheet.getWidth(); j++) {
				System.out.print("[" + sheet.getCell(j, i) + "]");
			}
			System.out.println();
		}
		System.out.println("====== Turn Right(1) ======");
		sheet.turnRight();
		for(int i = 0; i < sheet.getHeight(); i++) {
			for(int j = 0; j < sheet.getWidth(); j++) {
				System.out.print("[" + sheet.getCell(j, i) + "]");
			}
			System.out.println();
		}
		System.out.println("====== Turn Right(2) ======");
		sheet.turnRight();
		for(int i = 0; i < sheet.getHeight(); i++) {
			for(int j = 0; j < sheet.getWidth(); j++) {
				System.out.print("[" + sheet.getCell(j, i) + "]");
			}
			System.out.println();
		}
		System.out.println("====== Turn Right(3) ======");
		sheet.turnRight();
		for(int i = 0; i < sheet.getHeight(); i++) {
			for(int j = 0; j < sheet.getWidth(); j++) {
				System.out.print("[" + sheet.getCell(j, i) + "]");
			}
			System.out.println();
		}
		System.out.println("====== Turn Right(4) ======");
		sheet.turnRight();
		for(int i = 0; i < sheet.getHeight(); i++) {
			for(int j = 0; j < sheet.getWidth(); j++) {
				System.out.print("[" + sheet.getCell(j, i) + "]");
			}
			System.out.println();
		}
		System.out.println("====== Turn  Left(1) ======");
		sheet.turnLeft();
		for(int i = 0; i < sheet.getHeight(); i++) {
			for(int j = 0; j < sheet.getWidth(); j++) {
				System.out.print("[" + sheet.getCell(j, i) + "]");
			}
			System.out.println();
		}
		System.out.println("====== Turn  Left(2) ======");
		sheet.turnLeft();
		for(int i = 0; i < sheet.getHeight(); i++) {
			for(int j = 0; j < sheet.getWidth(); j++) {
				System.out.print("[" + sheet.getCell(j, i) + "]");
			}
			System.out.println();
		}
		System.out.println("====== Turn  Left(3) ======");
		sheet.turnLeft();
		for(int i = 0; i < sheet.getHeight(); i++) {
			for(int j = 0; j < sheet.getWidth(); j++) {
				System.out.print("[" + sheet.getCell(j, i) + "]");
			}
			System.out.println();
		}
		System.out.println("====== Turn  Left(4) ======");
		sheet.turnLeft();
		for(int i = 0; i < sheet.getHeight(); i++) {
			for(int j = 0; j < sheet.getWidth(); j++) {
				System.out.print("[" + sheet.getCell(j, i) + "]");
			}
			System.out.println();
		}
	}
}
