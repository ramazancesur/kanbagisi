package Utulity;

public class EnumUtulity {
	public enum TelType {
		EV, IS, CEP;
		public static TelType fromInteger(int x) {

			switch (x) {
			case 0:
				return EV;
			case 1:
				return IS;
			case 2:
				return CEP;
			}
			return null;
		}
	}
	
	public enum AddresType {
		EV, IS;
		public static AddresType fromInteger(int x) {

			switch (x) {
			case 0:
				return EV;
			case 1:
				return IS;
			}
			return null;
		}
	}
	
	public enum KanGrubu {
		SIFIR, A,B,AB,SIFIRNEGATIF,ANEGATIF,BNEGATIF,ABNEGATIF;
		public static KanGrubu fromInteger(int x) {

			switch (x) {
			case 0:
				return SIFIR;
			case 1:
				return A;	
			case 2:
				return B;
			case 3:
				return AB;
			case 4:
				return SIFIRNEGATIF;
			case 5:
				return ANEGATIF;	
			case 6:
				return BNEGATIF;
			case 7:
				return ABNEGATIF;
			}
			return null;
		}
	}
}
