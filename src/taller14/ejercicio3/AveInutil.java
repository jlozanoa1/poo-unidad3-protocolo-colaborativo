package ejercicio3;

public class AveInutil extends Ave {
    // Sobrescritura inútil: repite exactamente lo mismo
    @Override
    public void volar() {
        System.out.println("El ave vuela.");
    }
}
