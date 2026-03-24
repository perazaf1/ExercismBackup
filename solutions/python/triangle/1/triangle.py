def is_valid_triangle(sides):
    """
    Check if the given sides form a valid triangle.

    :param sides: list - a list of three side lengths
    :return: bool - True if it's a valid triangle, False otherwise
    """
    # All sides must have a length greater than 0
    if all(side > 0 for side in sides):
        # The sum of any two sides must be greater than the third side
        a, b, c = sorted(sides)
        return a + b >= c and b + c >= a and a + c >= b
    return False

def equilateral(sides):
    """
    Determine if the given sides form an equilateral triangle.

    :param sides: list - a list of three side lengths
    :return: bool - True if it's an equilateral triangle, False otherwise
    """
    # Check if it's a valid triangle and has all sides equal
    return is_valid_triangle(sides) and len(set(sides)) == 1

def isosceles(sides):
    """
    Determine if the given sides form an isosceles triangle.

    :param sides: list - a list of three side lengths
    :return: bool - True if it's an isosceles triangle, False otherwise
    """
    # Check if it's a valid triangle and has at least two sides equal
    return is_valid_triangle(sides) and len(set(sides)) <= 2

def scalene(sides):
    """
    Determine if the given sides form a scalene triangle.

    :param sides: list - a list of three side lengths
    :return: bool - True if it's a scalene triangle, False otherwise
    """
    # Check if it's a valid triangle and has all sides different
    return is_valid_triangle(sides) and len(set(sides)) == 3

# Example usage:
triangle_sides = [5, 5, 5]

if equilateral(triangle_sides):
    print("Equilateral Triangle")
elif isosceles(triangle_sides):
    print("Isosceles Triangle")
elif scalene(triangle_sides):
    print("Scalene Triangle")
else:
    print("Not a valid triangle")
