def square(number):
    """Calculate the number of grains on a given square."""
    if number < 1 or number > 64:
        raise ValueError("square must be between 1 and 64")
    return 2**(number - 1)
    pass 

def total():
    """Calculate the total number of grains on the chessboard."""
    return sum(square(i) for i in range(1, 65))
    pass