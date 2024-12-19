# Polymorphism in Java: 3D Shape Demonstration

## Description
This project showcases the concept of polymorphism in Java by implementing a program that calculates the surface area and volume of different 3D shapes. The program defines a `Shape3DInterface` with methods `surfaceArea()` and `volume()` and implements this interface in three classes: `Sphere`, `Cylinder`, and `Cube`. These classes override the interface methods to provide specific calculations based on the shape's properties.

### Key Features:
- **Interface Implementation:** The `Shape3DInterface` provides a unified interface for calculating surface area and volume.
- **Polymorphism:** The program uses polymorphism by storing objects of different classes (`Sphere`, `Cylinder`, `Cube`) in an array of `Shape3DInterface` type. Method calls (`surfaceArea()` and `volume()`) are dynamically resolved at runtime based on the actual object type.
- **Random Object Generation:** The program generates random dimensions for the shapes and creates an array of 10 random 3D shapes.
- **Formatted Output:** The program formats all numeric outputs to display two decimal places.

## How Polymorphism is Used
Polymorphism is demonstrated in this project by:
1. **Unified Method Calls:** Regardless of the specific shape, the `surfaceArea()` and `volume()` methods are called uniformly for all objects in the array.
2. **Dynamic Method Resolution:** The implementation of these methods differs for each shape class (`Sphere`, `Cylinder`, `Cube`), and the correct implementation is invoked based on the object's actual type at runtime.

This allows the program to operate on the objects abstractly, enhancing flexibility and reusability.

## Sample Output
Below are examples of the program's output for different runs:

### Run 1:
```
Sphere with radius 6.56
Surface Area: 540.15
Volume: 1180.44

Sphere with radius 7.72
Surface Area: 749.37
Volume: 1928.96

Sphere with radius 7.67
Surface Area: 738.61
Volume: 1887.53

Sphere with radius 9.70
Surface Area: 1181.80
Volume: 3820.23

Cube with side length 6.94
Surface Area: 288.73
Volume: 333.81

Cube with side length 4.49
Surface Area: 121.20
Volume: 90.78

Sphere with radius 7.76
Surface Area: 756.94
Volume: 1958.23

Cylinder with radius 6.91 and height 10.41
Surface Area: 752.27
Volume: 1562.38

Sphere with radius 5.99
Surface Area: 450.38
Volume: 898.76

Sphere with radius 3.25
Surface Area: 132.81
Volume: 143.91
```

### Run 2:
```
Sphere with radius 7.08
Surface Area: 629.38
Volume: 1484.70

Sphere with radius 8.95
Surface Area: 1007.57
Volume: 3007.36

Cube with side length 4.20
Surface Area: 105.99
Volume: 74.25

Cylinder with radius 6.80 and height 12.49
Surface Area: 823.66
Volume: 1812.72

Cylinder with radius 3.09 and height 9.22
Surface Area: 239.24
Volume: 276.98

Cube with side length 3.38
Surface Area: 68.45
Volume: 38.53

Sphere with radius 9.90
Surface Area: 1231.17
Volume: 4062.10

Cylinder with radius 2.18 and height 8.39
Surface Area: 145.10
Volume: 125.73

Sphere with radius 1.47
Surface Area: 27.12
Volume: 13.28

Cube with side length 8.66
Surface Area: 449.79
Volume: 649.07
```

## Notes
- The random dimensions for the shapes are generated within specified ranges:
  - Sphere radius: [1, 10]
  - Cylinder radius: [1, 10], height: [5, 20]
  - Cube side length: [1, 10]
- All numeric values in the output are formatted to two decimal places for better readability.

