public class TestVehicle {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle(
                "1234", "Ford", 2015, 30000.0);

        // informações sobre o veículo
        System.out.println("Veículo 1:");
        System.out.println("Número de Registro: " + vehicle1.getRegNo());
        System.out.println("Marca: " + vehicle1.getMake());
        System.out.println("Ano de Fabricação: " + vehicle1.getYearOfManufacture());
        System.out.println("Valor: R$" + vehicle1.getValue());
        System.out.println("Idade do Veículo: " + vehicle1.calculateAge(2023) + " anos");

        // SecondHandVehicle
        SecondHandVehicle vehicle2 = new SecondHandVehicle(
                "5678", "Chevrolet", 2018, 20000.0, 2);

        // Chamando os métodos da classe SecondHandVehicle para imprimir informações sobre o veículo de segunda mão
        System.out.println("\nVeículo 2:");
        System.out.println("Número de Registro: " + vehicle2.getRegNo());
        System.out.println("Marca: " + vehicle2.getMake());
        System.out.println("Ano de Fabricação: " + vehicle2.getYearOfManufacture());
        System.out.println("Valor: R$" + vehicle2.getValue());
        System.out.println("Idade do Veículo: " + vehicle2.calculateAge(2023) + " anos");
        System.out.println("Número de Proprietários Anteriores: " + vehicle2.getNumberOfOwners());
        System.out.println("Múltiplos Proprietários? " + vehicle2.hasMultipleOwners());
    }
}
