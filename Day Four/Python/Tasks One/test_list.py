import math

def get_perfect_square(list):
    result = []
    for number in list:
       
        if math.isqrt(number) ** 2 == number:
            result.append(True)
        else:
            result.append(False)
    return result


test_list = [4, 9, 25, 49]
print(get_perfect_square(test_list))