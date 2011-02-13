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
		System.out.println("====== Turn  hFlip(1) ======");
		sheet.hFlip();
		for(int i = 0; i < sheet.getHeight(); i++) {
			for(int j = 0; j < sheet.getWidth(); j++) {
				System.out.print("[" + sheet.getCell(j, i) + "]");
			}
			System.out.println();
		}
		System.out.println("====== Turn  hFlip(2) ======");
		sheet.hFlip();
		for(int i = 0; i < sheet.getHeight(); i++) {
			for(int j = 0; j < sheet.getWidth(); j++) {
				System.out.print("[" + sheet.getCell(j, i) + "]");
			}
			System.out.println();
		}
		System.out.println("====== Turn  vFlip(1) ======");
		sheet.vFlip();
		for(int i = 0; i < sheet.getHeight(); i++) {
			for(int j = 0; j < sheet.getWidth(); j++) {
				System.out.print("[" + sheet.getCell(j, i) + "]");
			}
			System.out.println();
		}
		System.out.println("====== Turn  vFlip(2) ======");
		sheet.vFlip();
		for(int i = 0; i < sheet.getHeight(); i++) {
			for(int j = 0; j < sheet.getWidth(); j++) {
				System.out.print("[" + sheet.getCell(j, i) + "]");
			}
			System.out.println();
		}
		System.out.println("====== Turn  getRow ======");
		Object[] row = sheet.getRow(1);
		for(int i = 0; i < row.length; i++) {
			System.out.print("[" + row[i] + "]");
		}
		System.out.println();
		System.out.println("====== Turn  getCol ======");
		Object[] col = sheet.getCol(1);
		for(int i = 0; i < col.length; i++) {
			System.out.print("[" + col[i] + "]");
		}
		System.out.println();
	}
}
