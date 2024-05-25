package sintaxe_variaveis_e_fluxo;

public class TesteIR {
	
	public static void main(String[] args) {
		
		double salario = 3300.0;
		
		// ifs aqui
		
		// 1900.0 até 2800.0, o IR= 7.5% - R$ 142
		// 2800.01 até 3751.0, o IR= 15% - R$ 350
		// 3751.01 até 4664.00, o IR= 22.5% - R$ 636
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("A sua alíquota é de 7.5%");
			System.out.println("Você pode reduzir até R$ 142");
		} else if (salario >= 2800.01 && salario <= 3751.0){
			System.out.println("A sua alíquota é de 15%");
			System.out.println("Você pode reduzir até R$ 350");	
		} else if (salario >= 3751.01 && salario <= 4664.0) {
			System.out.println("A sua alíquota é de 22.5%");
			System.out.println("Você pode reduzir até R$ 636");
		}
	}
}