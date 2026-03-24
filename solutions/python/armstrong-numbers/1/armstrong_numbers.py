def is_armstrong_number(number):
    num_str = str(number)

    num_digits = len(num_str)

    # Step 3

    sum_of_powers = sum(int(digit)**num_digits for digit in num_str)

    # Step 4

    return sum_of_powers == number
    pass
