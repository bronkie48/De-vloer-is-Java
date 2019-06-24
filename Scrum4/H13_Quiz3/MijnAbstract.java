package H13_Quiz3;
abstract class MijnAbstract{
	String str = "N";
	
	MijnAbstract(){
		this("0");
		str += "L";
	}
	MijnAbstract(String str){
		str += str;
		/*
		 * door er this.str van te maken wordt er N0L27 geprint in de console
		 * dit komt omdat dit 0 toevoegd aan de string.
		 */
	}
}