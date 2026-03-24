package Principal;

public class Clase_principal {

	public static void main(String[] args) {
		
        Class_Circle miCirculo = new Class_Circle(5.5, "Azul", true);
        
        
        Class_Rectangle miRectangulo = new Class_Rectangle();
        miRectangulo.setWidth(10);
        miRectangulo.setHeight(4);
        miRectangulo.setColor("Rojo");
        miRectangulo.setFilled(false);

    
        System.out.println("=== DATOS DEL CÍRCULO ===");
        miCirculo.printCircle(); 
        System.out.println("Área: " + miCirculo.getArea());
        System.out.println("Diámetro: " + miCirculo.getDiameter());
     
        System.out.println("¿Está lleno?: " + miCirculo.isFilled()); 
        
        System.out.println("\n---------------------------\n");

       
        System.out.println("=== DATOS DEL RECTÁNGULO ===");
        System.out.println("Color: " + miRectangulo.getColor());
        System.out.println("Área: " + miRectangulo.getArea());
        System.out.println("Perímetro: " + miRectangulo.getPerimeter());
       
        System.out.println("Info General: " + miRectangulo.toString());

        System.out.println("\n---------------------------\n");

       
        GeometryObject figuraGenérica = new Class_Circle(2.0, "Verde", true);
        System.out.println("Círculo polimórfico: " + figuraGenérica.getColor());
    }
	}



